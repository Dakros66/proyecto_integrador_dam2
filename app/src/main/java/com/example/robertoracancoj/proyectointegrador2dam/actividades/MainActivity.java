package com.example.robertoracancoj.proyectointegrador2dam.actividades;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.robertoracancoj.proyectointegrador2dam.R;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    //private PostsAdapter postsAdapter;
    private RecyclerView recyclerView;
   //private FloatingActionButton floatingActionButton;

   // private ProfileManager profileManager;
  //  private PostManager postManager;
    private int contador;
    private TextView countadorNuevoPostTextView;
   // private PostManager.PostCounterWatcher postCounterWatcher;
    private boolean counterAnimationInProgress = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);
    }
}
