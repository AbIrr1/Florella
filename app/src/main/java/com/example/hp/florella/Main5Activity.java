package com.example.hp.florella;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    EditText email,mdp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        email = (EditText) findViewById(R.id.email);
        mdp= (EditText) findViewById(R.id.mdp);
        final Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals("wafa") && mdp.getText().toString().equals("wafa1996")){
                    Toast.makeText(getApplicationContext(),
                            "connecte",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Main5Activity.this, Main6Activity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),
                            "votre donnees sont fauses",Toast.LENGTH_SHORT).show();
                }
            }
        });
        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main5Activity.this, Main4Activity.class);
                startActivity(intent);

            }
        });

    }
}
