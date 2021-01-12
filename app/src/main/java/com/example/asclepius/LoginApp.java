package com.example.asclepius;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginApp extends AppCompatActivity {
TextInputLayout mail,pass;
ProgressBar bar;
private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_app);
        mail=findViewById(R.id.email);
        pass=findViewById(R.id.password);
        bar=findViewById(R.id.Progressid);


    }

    public void process(View view) {
        bar.setVisibility(View.VISIBLE);
        String email =mail.getEditText().getText().toString();
        String password= pass.getEditText().getText().toString();

        mAuth=FirebaseAuth.getInstance();

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Toast.makeText(LoginApp.this, "You are Logged In", Toast.LENGTH_SHORT).show();
                            bar.setVisibility(View.INVISIBLE);
                            mail.getEditText().setText("  ");
                            pass.getEditText().setText("  ");
                            Intent intent=new Intent(LoginApp.this,Dashboard.class);
                            startActivity(intent);
                        } else {
                            // If sign in fails, display a message to the user.

                            Toast.makeText(LoginApp.this, "Some error occur in login", Toast.LENGTH_SHORT).show();
                        }

                        // ...
                    }
                });

    }
}