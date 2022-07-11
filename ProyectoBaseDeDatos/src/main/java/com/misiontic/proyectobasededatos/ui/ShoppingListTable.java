package com.misiontic.proyectobasededatos.ui;

import com.misiontic.proyectobasededatos.database.SqliteDatabase;
import com.misiontic.proyectobasededatos.model.ShoppingListEntry;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.*;
import java.util.List;

// TODO(nilsheumer): Add proper JavaDoc, here an for all classes and public functions (except of @Overrides) and where
// ever explanation is necessary.
// TODO(nilsheumer): Use and declare an enum here that removes the ...COLUMN_INDEX, COLUMN_NAME and COLUMN_WIDTH
// constants.
// TODO(nilsheumer): Use a translation framework for all displayed strings.
public class ShoppingListTable extends JTable {

    static final int CHECK_BOX_COLUMN_INDEX = 0;
    static final int AMOUNT_COLUMN_INDEX = 1;

    private static final String CHECK_BOX_COLUMN_NAME = "";
    private static final String AMOUNT_COLUMN_NAME = "Amount";
    private static final String TITLE_COLUMN_NAME = "Title";

    private static final int PREFERRED_TABLE_WIDTH = 500;
    private static final int PREFERRED_TABLE_HEIGHT = 70;

    private static final int CHECK_BOX_COLUMN_WIDTH = 16;
    private static final int AMOUNT_COLUMN_WIDTH = 60;

    private static final String[] TABLE_COLUMN_NAMES = {
        CHECK_BOX_COLUMN_NAME,
        AMOUNT_COLUMN_NAME,
        TITLE_COLUMN_NAME
    };

    private final List<ShoppingListEntry> tableData;

    public ShoppingListTable(List<ShoppingListEntry> tableData) {
        super(new ShoppingListTableModel<>(tableData, Arrays.asList(TABLE_COLUMN_NAMES)));
        this.tableData = tableData;

        // TODO(nilsheumer): Avoid circular dependencies. Find a better solution, eventually listener based?
        getModel().setTable(this);

        setPreferredScrollableViewportSize(new Dimension(PREFERRED_TABLE_WIDTH, PREFERRED_TABLE_HEIGHT));
        setFillsViewportHeight(true);

        initTableColumns();
    }

    @Override
    public Object getValueAt(int row, int column) {
        return tableData.get(row).getValue(column);
    }

    @Override
    public ShoppingListTableModel<ShoppingListEntry> getModel() {
        return (ShoppingListTableModel<ShoppingListEntry>) super.getModel();
    }

    @Override
    public Class getColumnClass(int column) {
        return getValueAt(0, column).getClass();
    }

    public void addNewRow() {
        long rowId = SqliteDatabase.instance().addRow(false, 1, "");
        tableData.add(new ShoppingListEntry(rowId,false, 1, ""));
        updateTable();
    }

    public void updateRow(int row) {
        SqliteDatabase.instance().updateRow(
                tableData.get(row).getSqliteRowId(),
                tableData.get(row).isChecked(),
                tableData.get(row).getAmount(),
                tableData.get(row).getTitle());
    }

    public void deleteSelectedRows() {
        if (getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please select at least on entry.");
            return;
        }
        List<ShoppingListEntry> rowDataToDelete = new ArrayList<>();
        for (int row : getSelectedRows()) {
            SqliteDatabase.instance().deleteRow(tableData.get(row).getSqliteRowId());
            rowDataToDelete.add(tableData.get(row));
        }
        tableData.removeAll(rowDataToDelete);
        updateTable();
    }

    public void deleteAllRows() {
        if (JOptionPane.showConfirmDialog(
                this,
                "Do you really want to delete the complete Rola Shopping List?",
                "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            SqliteDatabase.instance().deleteAll();
            tableData.clear();
            updateTable();
        }
    }

    public void sortRows() {
        Collections.sort(tableData, (first, second) -> {
            if (first.isChecked() == second.isChecked()) {
                return first.getTitle().compareToIgnoreCase(second.getTitle());
            }
            return first.isChecked() ? 1 : -1;
        });
        getModel().setRecords(tableData);
        updateTable();
    }

    private void initTableColumns() {
        getColumnModel().getColumn(CHECK_BOX_COLUMN_INDEX).setMinWidth(CHECK_BOX_COLUMN_WIDTH);
        getColumnModel().getColumn(CHECK_BOX_COLUMN_INDEX).setMaxWidth(CHECK_BOX_COLUMN_WIDTH);
        getColumnModel().getColumn(CHECK_BOX_COLUMN_INDEX).setCellEditor(new DefaultCellEditor(new JCheckBox()));

        getColumnModel().getColumn(AMOUNT_COLUMN_INDEX).setMaxWidth(AMOUNT_COLUMN_WIDTH);
        getColumnModel().getColumn(AMOUNT_COLUMN_INDEX).setMinWidth(AMOUNT_COLUMN_WIDTH);
        DefaultTableCellRenderer amountCellRenderer = new DefaultTableCellRenderer();
        amountCellRenderer.setHorizontalAlignment(JLabel.CENTER);
        getColumnModel().getColumn(AMOUNT_COLUMN_INDEX).setCellRenderer(amountCellRenderer);
    }

    private void updateTable() {
        getModel().fireTableDataChanged();
    }
}
