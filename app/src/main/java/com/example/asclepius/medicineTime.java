package com.example.asclepius;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class medicineTime extends AppCompatActivity {

    EditText hour , timeminute;
    Button setAlarm , setTime;
    TimePickerDialog timePickerDialog;
    Calendar calendar;
    int currentHour;
    int currentMinute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madicine_time);


        hour=findViewById(R.id.etHour);
        timeminute =findViewById(R.id.etTime);
        setAlarm=findViewById(R.id.btnAlarm);
        setTime=findViewById(R.id.btnTime);

        setTime.setOnClickListener(v -> {

            calendar=Calendar.getInstance();
            currentHour=calendar.get(Calendar.HOUR_OF_DAY);
            currentMinute=calendar.get(Calendar.MINUTE);

            timePickerDialog=new TimePickerDialog(medicineTime.this, (timePicker, hourOfDay, minute) -> {

                hour.setText(String.format("%02",hourOfDay));
                timeminute.setText(String.format("%02",minute));
            }, currentHour , currentMinute ,true);

            timePickerDialog.show();
        });
         setAlarm.setOnClickListener(view -> {
             Intent intent=new Intent(AlarmClock.ACTION_SET_ALARM);
             intent.putExtra(AlarmClock.EXTRA_HOUR,Integer.parseInt(hour.getText().toString()));
             intent.putExtra(AlarmClock.EXTRA_MINUTES,Integer.parseInt(timeminute.getText().toString()));
             intent.putExtra(AlarmClock.EXTRA_MESSAGE, "Set Alarm ");
             startActivity(intent);
         });


    }
}