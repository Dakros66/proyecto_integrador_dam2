package com.example.robertoracancoj.proyectointegrador2dam.componentesApp.adaptadores;

import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.robertoracancoj.proyectointegrador2dam.componentesApp.actividades.ModeloActividadPrincipal;
import com.example.robertoracancoj.proyectointegrador2dam.componentesApp.listener.OnPostChangedListener;
import com.example.robertoracancoj.proyectointegrador2dam.componentesApp.listener.manager.PostManager;
import com.example.robertoracancoj.proyectointegrador2dam.componentesApp.modelo.Post;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by robertoracancoj on 2/24/18.
 */

public abstract class BasePostAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    public static final String TAG = BasePostAdapter.class.getSimpleName();

    protected List<Post> postList = new LinkedList<>();
    protected ModeloActividadPrincipal activity;
    protected int selectedPostPosition = -1;

    public BasePostAdapter(ModeloActividadPrincipal activity) {
        this.activity = activity;
    }


    protected void cleanSelectedPostInformation() {
        selectedPostPosition = -1;
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return postList.get(position).getItemType().getTypeCode();
    }

    protected Post getItemByPosition(int position) {
        return postList.get(position);
    }

    private OnPostChangedListener createOnPostChangeListener(final int postPosition) {
        return new OnPostChangedListener() {
            @Override
            public void onObjectChanged(Post obj) {
                postList.set(postPosition, obj);
                notifyItemChanged(postPosition);
            }

            @Override
            public void onError(String errorText) {
                Log.d(TAG, errorText);
            }
        };
    }

    public void updateSelectedPost() {
        if (selectedPostPosition != -1) {
            Post selectedPost = getItemByPosition(selectedPostPosition);
            PostManager.getInstance(activity).getSinglePostValue(selectedPost.getId(), createOnPostChangeListener(selectedPostPosition));
        }
    }


}
