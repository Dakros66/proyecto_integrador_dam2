package com.example.robertoracancoj.proyectointegrador2dam.componentesApp.utils;

import com.example.robertoracancoj.proyectointegrador2dam.componentesApp.enums.UploadImagePrefix;

import java.util.Date;

/**
 * Created by robertoracancoj on 2/25/18.
 */

public class ImageUtil {
    public static String generateImageTitle(UploadImagePrefix prefix, String parentId) {
        if (parentId != null) {
            return prefix.toString() + parentId;
        }

        return prefix.toString() + new Date().getTime();
    }
}
