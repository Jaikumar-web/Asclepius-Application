package com.example.asclepius;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    public ImageView baikal;
    public ImageView faq;
    public ImageView medicineTimeAlert;
    public ImageView form;
    public ImageView doctor;
    public ImageView skincare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

    baikal = findViewById(R.id.bmi);

    baikal.setOnClickListener(view -> {
        Intent intent= new Intent(Dashboard.this, medicare.class);
        startActivity(intent);
    });
        faq = findViewById(R.id.faq);
        faq.setOnClickListener(view -> {
            Intent intent =new Intent(Dashboard.this,faq.class);
            startActivity(intent);
        });


        medicineTimeAlert = findViewById(R.id.medialert);
        medicineTimeAlert.setOnClickListener(v -> {

            Intent intent = new Intent(Dashboard.this,medicineTime.class);
            startActivity(intent);

        });


        form=findViewById(R.id.book);
        form.setOnClickListener(v -> {

            Intent intent = new Intent(Dashboard.this,Booking.class);
            startActivity(intent);
        });


        doctor=findViewById(R.id.doctor);
        doctor.setOnClickListener(v -> {
            Intent intent=new Intent(Dashboard.this,DoctorApp.class);
            startActivity(intent);
        });


        skincare=findViewById(R.id.skin);
        skincare.setOnClickListener(view -> {
        Intent intent = new Intent(Dashboard.this,Skincare.class);
        startActivity(intent);
        });
    }




}