package com.misiontic.proyectobasededatos.database;

import com.misiontic.proyectobasededatos.model.ShoppingListEntry;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


// TODO(nilsheumer): Add proper JavaDoc, here an for all classes and public functions (except of @Overrides) and where
// ever explanation is necessary.
// TODO(nilsheumer): Use a proper file/console logger framework to log the exceptions.
// TODO(nilsheumer): Use commit mode and implement rollbacks.
// TODO(nilsheumer): Database should life in the user/appdata folder and not in the project folder.
// TODO(nilsheumer): The table manipulation code including the table creating code should be in separate file named
// "ShoppingListEntryTable"
// TODO(nilsheumer): Use a suitable query builder, if available.
// TODO(nilsheumer): Introduce a string constant for the table name.
public class SqliteDatabase {

    private static SqliteDatabase database;

    private SqliteDatabase() {
        createTables();
    }

    public static SqliteDatabase instance() {
        if (database == null) {
            database = new SqliteDatabase();
        }
        return database;
    }

    private Connection createConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:sqlite:rolashoppinglist.db");
        } catch (Exception e) {
            System.exit(0);
        }
        return null;
    }

    private void createTables() {
        String createStatement =
                "CREATE TABLE IF NOT EXISTS `shopping_list_entry` ( " +
                "`checked` INTEGER NOT NULL, " +
                "`amount` INTEGER NOT NULL, " +
                "`title` TEXT NOT NULL);";
        try (
                Connection connection = createConnection();
                Statement statement = connection.createStatement()) {
            statement.executeUpdate(createStatement);

        } catch (Exception e) {
            System.exit(0);
        }
    }

    public List<ShoppingListEntry> loadTable() {
        String selectStatement = "SELECT `rowid`, * FROM `shopping_list_entry`;";
        List<ShoppingListEntry> shoppingListEntries = new ArrayList<>();
        try (
                Connection connection = createConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(selectStatement)) {
            while (resultSet.next() ) {
                shoppingListEntries.add(new ShoppingListEntry(
                        resultSet.getLong("rowid"),
                        resultSet.getInt("checked") == 1 ? true : false,
                        resultSet.getInt("amount"),
                        resultSet.getString("title")));
            }
        } catch (Exception e) {
            System.exit(0);
        }
        return shoppingListEntries;
    }

    public long addRow(boolean checked, int amount, String title) {
        String insertStatement = String.format(
                "INSERT INTO `shopping_list_entry` (`checked`, `amount`, `title`) VALUES (%d, %d, \"%s\");",
                checked ? 1 : 0, amount, title);
        try (
                Connection connection = createConnection();
                PreparedStatement statement = connection.prepareStatement(
                        insertStatement, Statement.RETURN_GENERATED_KEYS)) {

            return statement.executeUpdate();
        } catch (Exception e) {
            System.exit(0);
        }
        return -1;
    }

    public void updateRow(long rowId, boolean checked, int amount, String title) {
        String updateStatement = String.format(
                "UPDATE `shopping_list_entry` SET `checked` = %d, `amount` = %d, `title` = \"%s\" WHERE `rowid` = %d;",
                checked ? 1 : 0, amount, title, rowId);
        try (
                Connection connection = createConnection();
                Statement statement = connection.createStatement()) {
            statement.executeUpdate(updateStatement);

        } catch (Exception e) {
            System.exit(0);
        }
    }

    public void deleteRow(long rowId) {
        String deleteStatement = String.format("DELETE FROM `shopping_list_entry` WHERE `rowid` = %d;", rowId);
        try (
                Connection connection = createConnection();
                Statement statement = connection.createStatement()) {
            statement.execute(deleteStatement);
        } catch (Exception e) {
            System.exit(0);
        }
    }

    public void deleteAll() {
        String deleteStatement = "DELETE FROM `shopping_list_entry`;";
        try (
                Connection connection = createConnection();
                Statement statement = connection.createStatement()) {
            statement.execute(deleteStatement);
        } catch (Exception e) {
            System.exit(0);
        }
    }
}
