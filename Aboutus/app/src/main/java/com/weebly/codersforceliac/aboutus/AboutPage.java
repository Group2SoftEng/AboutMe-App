package com.weebly.codersforceliac.aboutus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AboutPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);


        Button memberOne = (Button) findViewById(R.id.memberOneButton);
        memberOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(AboutPage.this, MemberOnePage.class);
                startActivity(intent);
            }
        });

        Button memberTwo = (Button) findViewById(R.id.memberTwoButton);
        memberTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(AboutPage.this, MemberTwoPage.class);
                startActivity(intent);
            }
        });

        Button memberThree = (Button) findViewById(R.id.memberThreeButton);
        memberThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(AboutPage.this, MemberThreePage.class);
                startActivity(intent);
            }
        });

        Button memberFour = (Button) findViewById(R.id.memberFourButton);
        memberFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(AboutPage.this, MemberFourPage.class);
                startActivity(intent);
            }
        });

        Button memberFive = (Button) findViewById(R.id.memberFiveButton);
        memberFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(AboutPage.this, MemberFivePage.class);
                startActivity(intent);
            }
        });
    }

}
