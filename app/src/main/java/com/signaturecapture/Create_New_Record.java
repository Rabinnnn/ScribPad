package com.signaturecapture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Create_New_Record extends AppCompatActivity {
    private Button Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_record);

        Next = (Button) findViewById(R.id.go_to_new_records_page2);

        Next.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {   Intent i = new Intent(getApplicationContext(), Create_New_Record2.class);
                startActivity(i);

            } }   );
    }
}