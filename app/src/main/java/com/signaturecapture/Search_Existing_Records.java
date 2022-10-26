package com.signaturecapture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Search_Existing_Records extends AppCompatActivity {
    private Button Get_records_btn;
    public static EditText name;
    public static EditText id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_existing_records);

        Get_records_btn = (Button) findViewById(R.id.get_search_records);
        name = (EditText) findViewById(R.id.name_search);
        id = (EditText) findViewById(R.id.id_search);

        Get_records_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {   Intent i = new Intent(getApplicationContext(), Displayed_Patients_Records.class);
                startActivity(i);

            } }   );
    }
}