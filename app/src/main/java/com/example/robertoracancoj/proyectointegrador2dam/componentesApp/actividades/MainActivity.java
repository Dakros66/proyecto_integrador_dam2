package com.example.robertoracancoj.proyectointegrador2dam.componentesApp.actividades;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.robertoracancoj.proyectointegrador2dam.R;

public class MainActivity extends ModeloActividadPrincipal {
    private static final String TAG = MainActivity.class.getSimpleName();

    //private PostsAdapter postsAdapter;
    private RecyclerView recyclerView;
    private FloatingActionButton floatingActionButton;
    //private ProfileManager profileManager;
    //private PostManager postManager;
    private int contador;
    private TextView countadorNuevoPostTextView;
    //private PostManager.PostCounterWatcher postCounterWatcher;
    private boolean counterAnimationInProgress = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        /*
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case ProfileActivity.CREATE_POST_FROM_PROFILE_REQUEST:
                    refreshPostList();
                    break;
                case CreatePostActivity.CREATE_NEW_POST_REQUEST:
                    refreshPostList();
                    showFloatButtonRelatedSnackBar(R.string.message_post_was_created);
                    break;

                case PostDetailsActivity.UPDATE_POST_REQUEST:
                    if (data != null) {
                        PostStatus postStatus = (PostStatus) data.getSerializableExtra(PostDetailsActivity.POST_STATUS_EXTRA_KEY);
                        if (postStatus.equals(PostStatus.REMOVED)) {
                            postsAdapter.removeSelectedPost();
                            showFloatButtonRelatedSnackBar(R.string.message_post_was_removed);
                        } else if (postStatus.equals(PostStatus.UPDATED)) {
                            postsAdapter.updateSelectedPost();
                        }
                    }
                    break;
            }
        }*/
    }
}
