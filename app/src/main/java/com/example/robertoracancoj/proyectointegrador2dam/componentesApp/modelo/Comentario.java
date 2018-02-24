package com.example.robertoracancoj.proyectointegrador2dam.componentesApp.modelo;

import com.example.robertoracancoj.proyectointegrador2dam.componentesApp.utils.FormatterUtil;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by robertoracancoj on 2/24/18.
 */

public class Comentario {

    private String id;
    private String text;
    private String authorId;
    private long createdDate;


    public Comentario() {
        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)
    }

    public Comentario(String text) {

        this.text = text;
        this.createdDate = Calendar.getInstance().getTimeInMillis();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();

        result.put("text", text);
        result.put("createdDate", createdDate);
        result.put("createdDateText", FormatterUtil.getFirebaseDateFormat().format(new Date(createdDate)));

        return result;
    }
}
