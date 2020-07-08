package com.example.cinemaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);

    }

    public void gotologin(View view){

        Intent intent = new Intent(this , Login_Activity.class);
        startActivity(intent);

    }//end method

} // end class
