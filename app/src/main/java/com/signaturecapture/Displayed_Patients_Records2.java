package com.signaturecapture;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.signaturecapture.ui.main.SectionsPagerAdapter;
import com.signaturecapture.databinding.ActivityDisplayedPatientsRecords2Binding;

public class Displayed_Patients_Records2 extends AppCompatActivity {

    private ActivityDisplayedPatientsRecords2Binding binding;
    public ImageView imageView6;

    // instance for firebase storage and StorageReference
    FirebaseStorage storage;
    StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDisplayedPatientsRecords2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        // Reference to an image file in Cloud Storage
      //  StorageReference storageReference = FirebaseStorage.getInstance().getReference();

        storage = FirebaseStorage.getInstance();
        StorageReference storageRef = storage.getReference();
        // get the Firebase  storage reference

// ImageView in your Activity
        ImageView imageView11 = findViewById(R.id.imageView11);
        ImageView imageView12 = findViewById(R.id.imageView12);
        ImageView imageView13 = findViewById(R.id.imageView13);


        storageRef.child("symptoms/" + Search_Existing_Records.name.getText().toString()).getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Got the download URL for 'users/me/profile.png'
                Glide.with(getApplicationContext()).load(uri).into(imageView11);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
                Toast.makeText(getApplicationContext(), "Please enter the right name with the right case", Toast.LENGTH_SHORT).show();

            }
        });


        storageRef.child("treatment/" + Search_Existing_Records.name.getText().toString()).getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Got the download URL for 'users/me/profile.png'
                Glide.with(getApplicationContext()).load(uri).into(imageView12);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
                Toast.makeText(getApplicationContext(), "Please enter the right name with the right case", Toast.LENGTH_SHORT).show();

            }
        });


        storageRef.child("notes/" + Search_Existing_Records.name.getText().toString()).getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Got the download URL for 'users/me/profile.png'
                Glide.with(getApplicationContext()).load(uri).into(imageView13);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
                Toast.makeText(getApplicationContext(), "Please enter the right name with the right case", Toast.LENGTH_SHORT).show();

            }
        });



    /*
        String url= "https://firebasestorage.googleapis.com/v0/b/scribpad.appspot.com/o/symptoms%2F50fd10aa-5997-4880-aa2e-fa8de7071c7e?alt=media&token=80dcd4b1-0198-4cf8-a22b-1c364df7d652";
        String urll= "https://firebasestorage.googleapis.com/v0/b/scribpad.appspot.com/o/treatment%2F94000f87-4cce-453a-85b1-d96b9da8236c?alt=media&token=cee7254f-4248-4cf9-8b89-ee2a99f9c5d8";
        String urlll= "https://firebasestorage.googleapis.com/v0/b/scribpad.appspot.com/o/notes%2Fec97dc2e-e327-4376-b98a-81131c59997d?alt=media&token=e0185680-e331-4532-8fb2-08e4f2d69072";



        Glide.with(getApplicationContext()).load(url).into(imageView11);
        Glide.with(getApplicationContext()).load(urll).into(imageView12);
        Glide.with(getApplicationContext()).load(urlll).into(imageView13);  */



    }
}