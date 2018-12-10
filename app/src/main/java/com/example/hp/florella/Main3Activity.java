package com.example.hp.florella;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText  email,reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        email = (EditText) findViewById(R.id.e);
        reference = (EditText) findViewById(R.id.ref);
        final Button b = findViewById(R.id.valide);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("") || reference.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "verifier votre données", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Votre commande est en cour", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }}



