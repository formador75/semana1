package com.misiontic.proyectobasededatos.model;

// TODO(nilsheumer): Add proper JavaDoc, here an for all classes and public functions (except of @Overrides) and where
// ever explanation is necessary.
// TODO(nilsheumer): Write a base class that contains all sqitleRowId related code.
public final class ShoppingListEntry implements AccessibleByIndex {

    private final long sqliteRowId;

    private Boolean checked;
    private Integer amount;
    private String title;

    public ShoppingListEntry(long sqliteRowId, boolean checked, int amount, String title) {
        this.sqliteRowId = sqliteRowId;
        this.checked = checked;
        this.amount = amount;
        this.title = title;
    }

    public long getSqliteRowId() {
        return sqliteRowId;
    }

    @Override
    public Object getValue(int index) {
        switch (index) {
            case 0: return checked;
            case 1: return amount;
            case 2: return title;
        }
        return null;
    }

    @Override
    public void setValue(int index, Object value) {
        switch (index) {
            case 0:
                checked = (Boolean) value;
                return;
            case 1:
                // TODO(nilsheumer): Write a custom cell renderer who handles this more gracefully.
                Integer number;
                try {
                    number = (Integer) value;
                } catch (NumberFormatException e) {
                    return;
                }
                amount = number;
                return;
            case 2:
                title = (String) value;
                return;
        }
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
