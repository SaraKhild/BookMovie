package com.example.cinemaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Drama_Movie extends AppCompatActivity {
    Button btnlogin1,btnlogin2 ,btnlogin3, previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drama__movie);
        btnlogin1 = (Button) findViewById(R.id.butD1);
        btnlogin2 = (Button) findViewById(R.id.butD2);
        btnlogin3 = (Button) findViewById(R.id.butD3);
        previous= findViewById(R.id.Dpoeviou);

        btnlogin1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drama_Movie.this, CheckOut_Activity.class);
                startActivity(intent);
            }
        });//end method

        btnlogin2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drama_Movie.this, CheckOut_Activity.class);
                startActivity(intent);

            }
        });//end method

        btnlogin3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drama_Movie.this,CheckOut_Activity.class);
                startActivity(intent);
            }
        });//end method

        previous.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drama_Movie.this, movelist.class);
                startActivity(intent);
            }
        });//end method
    }//end method
}//end class
