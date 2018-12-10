package com.example.hp.florella;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    EditText nom, prenom, telephone, email, mdp, confirmation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        nom = (EditText) findViewById(R.id.nom);
        prenom = (EditText) findViewById(R.id.prenom);
        telephone = (EditText) findViewById(R.id.tel);
        confirmation = (EditText) findViewById(R.id.mddp);
       final Button b1 = findViewById(R.id.inscription);
        email = (EditText) findViewById(R.id.emaill);
        mdp = (EditText) findViewById(R.id.mdp);
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if ((email.getText().toString().equals("wafa") && mdp.getText().toString().equals("wafa1996")) || (email.getText().toString().equals("abir") && mdp.getText().toString().equals("abir12") || (email.getText().toString().equals("shaima") && mdp.getText().toString().equals("azerty")))) {
                   Toast.makeText(getApplicationContext(), "vous avez deja un compte", Toast.LENGTH_SHORT).show();
               } else if (nom.getText().toString().equals("") || prenom.getText().toString().equals("") || telephone.getText().toString().equals("") || confirmation.getText().toString().equals("") || email.getText().toString().equals("") || mdp.getText().toString().equals("")) {
                   Toast.makeText(getApplicationContext(), "verifier votre entréés", Toast.LENGTH_SHORT).show();
               } else {
                   Toast.makeText(getApplicationContext(), "votre inscription a eté effectuer avec succees", Toast.LENGTH_SHORT).show();
               }
           }
       });
    }}





