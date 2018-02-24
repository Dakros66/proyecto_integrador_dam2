package com.example.robertoracancoj.proyectointegrador2dam.componentesApp.vista;

import com.example.robertoracancoj.proyectointegrador2dam.componentesApp.listener.manager.DatabaseHelper;

/**
 * Created by robertoracancoj on 2/24/18.
 */

public class ApplicationHelper {
    private static final String TAG = ApplicationHelper.class.getSimpleName();
    private static DatabaseHelper databaseHelper;

    public static DatabaseHelper getDatabaseHelper() {
        return databaseHelper;
    }

    public static void initDatabaseHelper(android.app.Application application) {
        databaseHelper = DatabaseHelper.getInstance(application);
        databaseHelper.init();
    }
}
