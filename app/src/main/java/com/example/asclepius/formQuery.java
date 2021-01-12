package com.example.asclepius;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class formQuery extends AppCompatActivity {
    // Initializing the objects used in xml
    EditText t1,t2,t3,t4,date;
    int year,month,day;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_query);

        t1=findViewById(R.id.name);
        t2=findViewById(R.id.mail);
        t3=findViewById(R.id.contact);
        t4=findViewById(R.id.problem);
        date=findViewById(R.id.Date);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(v -> {
            String Name=t1.getText().toString().trim();
            String Mail=t2.getText().toString().trim();
            String Phone=t3.getText().toString().trim();
            String Problem=t4.getText().toString().trim();


            dataholder obj = new dataholder(Mail,Phone,Problem);

            FirebaseDatabase db=FirebaseDatabase.getInstance();
            DatabaseReference root=db.getReference("Customer");
            root.child(Name).setValue(obj);

            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
            t4.setText(" ");
            Toast.makeText(formQuery.this, "Data Inserted", Toast.LENGTH_SHORT).show();


        });


        final Calendar calendar= Calendar.getInstance();
        date.setOnClickListener(v -> {
            year=calendar.get(Calendar.YEAR);
            month=calendar.get(Calendar.MONTH);
            day=calendar.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog datePickerDialog =new DatePickerDialog(formQuery.this, (view, year, month, dayOfMonth) ->
                    date.setText(SimpleDateFormat.getInstance().format(calendar.getTime())),year,month,day);
            datePickerDialog.show();
        });


    }
}