package com.example.robertoracancoj.proyectointegrador2dam.componentesApp.enums;

/**
 * Created by robertoracancoj on 2/25/18.
 */

public enum UploadImagePrefix {

    PROFILE("profile_"), POST("post_");

    String prefix;

    UploadImagePrefix(String prefix) {
        this.prefix = prefix;
    }

    private String getPrefix() {
        return prefix;
    }

    @Override
    public String toString() {
        return getPrefix();
    }
}
