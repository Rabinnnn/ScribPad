package com.signaturecapture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Displayed_Patients_Records extends AppCompatActivity {
    public ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayed_patients_records);

        MyListData[] myListData = new MyListData[] {
                new MyListData("January", android.R.drawable.ic_dialog_dialer),
                new MyListData("February", android.R.drawable.ic_dialog_dialer),
                new MyListData("March", android.R.drawable.ic_dialog_dialer),
                new MyListData("April", android.R.drawable.ic_dialog_dialer),
                new MyListData("May", android.R.drawable.ic_dialog_dialer),
                new MyListData("June", android.R.drawable.ic_dialog_dialer),
                new MyListData("July", android.R.drawable.ic_dialog_dialer),
                new MyListData("August", android.R.drawable.ic_dialog_dialer),
                new MyListData("September", android.R.drawable.ic_dialog_dialer),
                new MyListData("October", android.R.drawable.ic_dialog_dialer),
                new MyListData("November", android.R.drawable.ic_dialog_dialer),
                new MyListData("December", android.R.drawable.ic_dialog_dialer),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
      /*  imageView1 = findViewById(R.id.imageViewJan);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Displayed_Patients_Records2.class);
                startActivity(i);

            }
        }); */
    }
}