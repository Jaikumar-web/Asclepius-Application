package com.example.asclepius;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btn1 = findViewById(R.id.btnget);
        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,Dashboard.class);
            startActivity(intent);
        });

        btn2=findViewById(R.id.btnlogin);
        btn2.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,LoginApp.class);
            startActivity(intent);
        });
    }


}