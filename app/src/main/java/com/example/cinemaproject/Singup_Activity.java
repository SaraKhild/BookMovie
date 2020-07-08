package com.example.cinemaproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class Singup_Activity extends AppCompatActivity {


    EditText et1 , et2 , et3;
    Button button;
    String username , passsword , phone ;


    Controllerdb controllerdb = new Controllerdb(this);
    SQLiteDatabase db;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup_);

        et1 = findViewById(R.id.edtname);
        et2 = findViewById(R.id.edtpass);
        et3 = findViewById(R.id.edtPhon);
        button=findViewById(R.id.btnsave);
        builder = new AlertDialog.Builder(this);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username = et1.getText().toString();
                passsword = et2.getText().toString();
                phone = et3.getText().toString();

                String q1 , q2 ;
                db = controllerdb.getWritableDatabase();
                q1= "INSERT INTO users (username,pass) VALUES ('"+username+"' ,'"+passsword+"')";
                db.execSQL(q1);
                q2="INSERT INTO newuser (Name,phone) VALUES ('"+username+"' ,'"+phone+"')";
                db.execSQL(q2);


                builder.setMessage(" your information is correctly added to the database");
                builder.setCancelable(false);
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Singup_Activity.this , Login_Activity.class );
                        startActivity(intent);
                    }
                });
                AlertDialog alert = builder.create();
                alert.setTitle("DB");
                alert.show();
            }
        });



    }// end method onCreate
}//end class
