package com.misiontic.proyectobasededatos.ui;

import com.misiontic.proyectobasededatos.model.AccessibleByIndex;

import javax.swing.table.AbstractTableModel;
import java.util.List;

// TODO(nilsheumer): Add proper JavaDoc, here an for all classes and public functions (except of @Overrides) and where
// ever explanation is necessary.
// TODO(nilsheumer): Use a list of enums as columnNames.
// TODO(nilsheumer): Fix that data entered by the user is not always stored to the database.
public final class ShoppingListTableModel<T extends AccessibleByIndex> extends AbstractTableModel {

    private final List<String> columnNames;

    private List<T> records;
    private ShoppingListTable table;

    public ShoppingListTableModel(List<T> records, List<String> columnNames) {
        this.records = records;
        this.columnNames = columnNames;
    }

    public void setTable(ShoppingListTable table) {
        this.table = table;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        records.get(row).setValue(column, value);
        table.updateRow(row);
        fireTableCellUpdated(row, column);
    }

    public String getColumnName(int col) {
        return columnNames.get(col);
    }

    @Override
    public int getRowCount() {
        return records.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.size();
    }

    @Override
    public T getValueAt(int rowIndex, int columnIndex) {
        return records.get(rowIndex);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return true;
    }
}
