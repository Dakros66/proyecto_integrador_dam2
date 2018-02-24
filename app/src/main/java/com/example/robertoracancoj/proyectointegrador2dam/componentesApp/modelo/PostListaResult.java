package com.example.robertoracancoj.proyectointegrador2dam.componentesApp.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by robertoracancoj on 2/24/18.
 */

public class PostListaResult {

    boolean isMoreDataAvailable;
    List<Post> posts = new ArrayList<>();
    long lastItemCreatedDate;

    public boolean isMoreDataAvailable() {
        return isMoreDataAvailable;
    }

    public void setMoreDataAvailable(boolean moreDataAvailable) {
        isMoreDataAvailable = moreDataAvailable;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public long getLastItemCreatedDate() {
        return lastItemCreatedDate;
    }

    public void setLastItemCreatedDate(long lastItemCreatedDate) {
        this.lastItemCreatedDate = lastItemCreatedDate;
    }
}
