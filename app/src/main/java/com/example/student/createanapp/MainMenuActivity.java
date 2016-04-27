package com.example.student.createanapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;



public class MainMenuActivity extends AppCompatActivity {

   private Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

    btnPlay = (Button) findViewById(R.id.btnPlay);

    }
    //when button is pressed it will lead to next display
    public void goToGame (View vw) {
        Intent display = new Intent(MainMenuActivity.this, GameMainMenuActivity.class);

        startActivity(display);
    }
}





