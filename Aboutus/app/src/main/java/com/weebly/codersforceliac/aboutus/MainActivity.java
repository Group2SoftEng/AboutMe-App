package com.weebly.codersforceliac.aboutus;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button aboutUs = (Button) findViewById(R.id.aboutUsButton);
        aboutUs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutPage.class);
                startActivity(intent);
            }
        });

        Button projectDetails = (Button) findViewById(R.id.projectDetailsButton);
        projectDetails.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProjectDetailsPage.class);
                startActivity(intent);
            }
        });

        Button extraStuff = (Button) findViewById(R.id.extraStuffButton);
        extraStuff.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExtraStuffPage.class);
                startActivity(intent);
            }
        });



    }





}