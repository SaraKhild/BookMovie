package com.example.cinemaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Action_Movie extends AppCompatActivity {

    Button btnlogin1,btnlogin2,btnlogin3 , previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action__movie);
        btnlogin1 = (Button) findViewById(R.id.butA1);
        btnlogin2 = (Button) findViewById(R.id.butA2);
        btnlogin3 = (Button) findViewById(R.id.butA3);
        previous = findViewById(R.id.Apoeviou);

        btnlogin1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Action_Movie.this, CheckOut_Activity.class);
                startActivity(intent);
            }
        });//end method

        btnlogin2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Action_Movie.this, CheckOut_Activity.class);
                startActivity(intent);
            }
        });//end method

        btnlogin3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Action_Movie.this, CheckOut_Activity.class);
                startActivity(intent);
            }
        });//end method

        previous.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Action_Movie.this, movelist.class);
                startActivity(intent);
            }
        });//end method
    }//end method onCreate
}//end class
