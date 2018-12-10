package com.example.hp.florella;

import android.content.Intent;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

public class menu extends AppCompatActivity {
    ListView sampleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //  super.onCreateOptionsMenu(menu);
        //  MenuInflater inflater = getMenuInflater();
        //R.menu.menu est l'id de notre menu
        // inflater.inflate(R.menu.menu, menu);
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.services:
                Toast.makeText(this,"Nos services",Toast.LENGTH_LONG).show();
                return true;
            case R.id.apropos:
                Toast.makeText(this,"a propos",Toast.LENGTH_LONG).show();
                return true;
            case R.id.servclient:
                Toast.makeText(this,"le service client",Toast.LENGTH_LONG).show();
                return true;
            case R.id.langage:
                Toast.makeText(this," choisissez votre langage préferés",Toast.LENGTH_LONG).show();
                return true;
            case R.id.avis:
                Toast.makeText(this,"vos avis?",Toast.LENGTH_LONG).show();
                return true;
            case R.id.aide:
                Toast.makeText(this,"besoins d'aide",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}


