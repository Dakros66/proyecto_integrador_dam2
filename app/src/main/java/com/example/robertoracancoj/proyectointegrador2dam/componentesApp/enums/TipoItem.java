package com.example.robertoracancoj.proyectointegrador2dam.componentesApp.enums;

/**
 * Created by robertoracancoj on 2/24/18.
 */

public enum TipoItem {LOAD(10), ITEM(11);
    private final int typeCode;

    TipoItem(int typeCode) {
        this.typeCode = typeCode;
    }

    public int getTypeCode() {
        return this.typeCode;
    }
}
