package com.misiontic.proyectobasededatos.ui;

import com.misiontic.proyectobasededatos.database.SqliteDatabase;
import com.misiontic.proyectobasededatos.helper.UiHelper;
import com.misiontic.proyectobasededatos.model.ShoppingListEntry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import static com.rola.Constants.COMPONENT_PADDING;

// TODO(nilsheumer): Add proper JavaDoc, here an for all classes and public functions (except of @Overrides) and where
// ever explanation is necessary.
// TODO(nilsheumer): Introduce a global constants file for all resource icons, like "rola.png".
// TODO(nilsheumer): Use a translation framework for all displayed strings.
public class MainFrame extends JFrame {

    private static final String APP_NAME = "Shopping List 1.0";
    private static final String RES_NAME_APP_ICON = "rola.png";

    private final ShoppingListTable shoppingListTable;

    public MainFrame() {
        super(APP_NAME);
        UiHelper.setAppIcon(this, RES_NAME_APP_ICON);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        shoppingListTable = new ShoppingListTable(loadTableModel());

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(createTablePanel(), BorderLayout.CENTER);
        getContentPane().add(createButtonsPanel(), BorderLayout.EAST);
        pack();
    }

    private List<ShoppingListEntry> loadTableModel() {
        return SqliteDatabase.instance().loadTable();
    }

    private JPanel createTablePanel() {
        JPanel mainPanel = UiHelper.createPanel(
                new BorderLayout(), COMPONENT_PADDING, COMPONENT_PADDING, COMPONENT_PADDING, 0);
        mainPanel.add(new JScrollPane(shoppingListTable), BorderLayout.CENTER);
        return mainPanel;
    }

    private JPanel createButtonsPanel() {
        JPanel topButtonsPanel = UiHelper.createPanel(UiHelper.createGridLayout(4,1));
        topButtonsPanel.add(UiHelper.createButton("Add Entry", new AddEntryButtonActionListener()));
        topButtonsPanel.add(UiHelper.createButton("Delete Entries", new DeleteEntriesButtonActionListener()));
        topButtonsPanel.add(UiHelper.createButton("Delete All Entries", new DeleteAllEntriesButtonActionListener()));
        topButtonsPanel.add(UiHelper.createButton("Sort Entries", new SortEntriesButtonActionListener()));

        JPanel bottomButtonPanel = UiHelper.createPanel(UiHelper.createGridLayout(1,1));
        bottomButtonPanel.add(UiHelper.createButton("Exit", new ExitButtonActionListener()));

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(topButtonsPanel, BorderLayout.NORTH);
        mainPanel.add(bottomButtonPanel, BorderLayout.SOUTH);

        return mainPanel;
    }

    private final class AddEntryButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            shoppingListTable.addNewRow();
        }
    }

    private final class DeleteEntriesButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            shoppingListTable.deleteSelectedRows();
        }
    }

    private final class DeleteAllEntriesButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            shoppingListTable.deleteAllRows();
        }
    }

    private final class SortEntriesButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            shoppingListTable.sortRows();
        }
    }

    private final class ExitButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (JOptionPane.showConfirmDialog(
                    MainFrame.this,
                    "Would really like to close the Rola Shopping List?",
                    "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                MainFrame.this.dispose();
                System.exit(0);
            }
        }
    }
}
