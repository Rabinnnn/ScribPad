package com.signaturecapture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Choose_file extends AppCompatActivity {
    private Button Existing_file_btn;
    private Button New_file_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_file);

        Existing_file_btn = (Button) findViewById(R.id.existing_file);
        New_file_btn = (Button) findViewById(R.id.new_file);

        Existing_file_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {   Intent i = new Intent(getApplicationContext(), Search_Existing_Records.class);
                startActivity(i);

            } }   );

        New_file_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {   Intent i = new Intent(getApplicationContext(), Create_New_Record.class);
                startActivity(i);

            } }   );
    }
}