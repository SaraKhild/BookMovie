package com.example.cinemaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;

public class CheckOut_Activity extends AppCompatActivity {
    EditText et1 , et2 , et3;
    Button btn1 , btn2;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out_);
        btn1 = findViewById(R.id.poeviou);
        btn2 = findViewById(R.id.checkout);
        et1 = findViewById(R.id.numbercard);
        et2 = findViewById(R.id.expirydate);
        et3= findViewById(R.id.cvc);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheckOut_Activity.this, movelist.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.length()==0 ){
                   et1.setError("Enter Number card ");
                }//end if
                else if( et2.length()==0){
                    et2.setError("Enter Expirt date ");
                }
                else if ( et3.length()==0){
                    et3.setError("Enter CVC "); }
              else {
                    Intent intent = new Intent(CheckOut_Activity.this, Don_Activity.class);
                    startActivity(intent);}
                 } });
    }//end method onCreate
}//end class
