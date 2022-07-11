package com.misiontic.proyectobasededatos.model;

// TODO(nilsheumer): Add proper JavaDoc, here an for all classes and public functions (except of @Overrides) and where
// ever explanation is necessary.
public interface AccessibleByIndex {

    Object getValue(int index);

    void setValue(int index, Object value);
}
