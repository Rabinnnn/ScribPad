package com.signaturecapture;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.signaturecapture.databinding.ActivityLoginBinding;

import java.util.HashMap;
import java.util.Map;

public class Create_New_Record extends AppCompatActivity {
    private Button Next;
    public static EditText name;
    public static EditText phone;
    public static EditText id;

    public static String Name;
    public static String Phone;
    public static String ID;


    public static String getName() {
        return Name;
    }
    public static String getPhone() {
        return Phone;
    }
    public static String getID() {
        return ID;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_record);

        Next = (Button) findViewById(R.id.go_to_new_records_page2);
        name = (EditText) findViewById(R.id.fullName);
        phone = (EditText) findViewById(R.id.phone);
        id = (EditText) findViewById(R.id.idNumber);

        //Name = name.getText().toString();
      /*  SharedPreferences sharedPref = getSharedPreferences("myKey", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("Name", name.getText().toString());
        editor.apply(); */


        Phone = phone.getText().toString();
        ID = id.getText().toString();

        Next.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                FirebaseFirestore db = FirebaseFirestore.getInstance();
                String Name = name.getText().toString();
                String Phone = phone.getText().toString();
                String ID = id.getText().toString();

                Intent i = new Intent(getApplicationContext(), Create_New_Record2.class);
                startActivity(i);

            } }   );





    }


}