package com.example.robertoracancoj.proyectointegrador2dam.componentesApp.utils;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by robertoracancoj on 2/25/18.
 */

public class Utils {
    public static int getDisplayWidth(Context context) {
        return getSize(context).x;
    }

    public static int getDisplayHeight(Context context) {
        return getSize(context).y;
    }

    private static Point getSize(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size;
    }
}
