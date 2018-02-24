package com.example.robertoracancoj.proyectointegrador2dam.componentesApp.enums;

/**
 * Created by robertoracancoj on 3/25/18.
 */

public enum ProfileStatus {
    PROFILE_CREATED(0), NOT_AUTHORIZED(1), NO_PROFILE(2);

    int status;

    ProfileStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
