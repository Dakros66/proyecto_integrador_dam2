package com.example.rracancoj.pintegrador;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rracancoj.pintegrador.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class ProfileNavigationActivity extends AppCompatActivity {

    private TextView textViewEmail;
    private ImageView imageViewImage;
    private String email;
    private Uri photoUrl;
    private StorageReference mStorageRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_navigation);

        mStorageRef = FirebaseStorage.getInstance().getReference().child("profile_images");

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {

            email = user.getEmail();
            photoUrl = user.getPhotoUrl();
            boolean emailVerified = user.isEmailVerified();
            String uid = user.getUid();

        }



        textViewEmail=(TextView) findViewById(R.id.textViewEmail);
        imageViewImage=(ImageView) findViewById(R.id.imageViewProfileImage);
        textViewEmail.setText(email);
        imageViewImage.setImageURI(photoUrl);





    }
}
