package com.example.asclepius;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Booking extends AppCompatActivity {

TextInputLayout name,mail,prob;
Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        name=findViewById(R.id.Name);
        mail=findViewById(R.id.Email);
        prob=findViewById(R.id.prob);
        btn=findViewById(R.id.btnn);
        btn.setOnClickListener(v -> {
            String Name = name.getEditText().getText().toString();
            String Problem = prob.getEditText().getText().toString();
            String Mail = mail.getEditText().getText().toString();
            container obj = new container(Problem,Mail);

            FirebaseDatabase db =  FirebaseDatabase.getInstance();
            DatabaseReference ref = db.getReference("Query");

            ref.child(Name).setValue(obj);

            name.getEditText().setText("  ");
            prob.getEditText().setText(" ");
            mail.getEditText().setText(" ");





        });





    }
}