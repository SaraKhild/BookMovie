package com.example.cinemaproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login_Activity extends AppCompatActivity {

    EditText ediT1 , ediT2 ;
    Button btn1 , btn2;
    Controllerdb controllerdb;
    SQLiteDatabase db;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

         controllerdb = new Controllerdb (this);
         builder = new AlertDialog.Builder(this);
         ediT1 = findViewById(R.id.edtname);
         ediT2 = findViewById(R.id.edtpass);
        btn1 = findViewById(R.id.btnLogin);
        btn2 = findViewById(R.id.buttonsinup);

       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String username = ediT1.getText().toString();
               String password = ediT2.getText().toString();
               boolean isExist = checkUserExist(username,password);
               if(isExist){
                   Toast.makeText(Login_Activity.this , "Login successful" , Toast.LENGTH_SHORT).show();
                   Intent intent = new Intent(Login_Activity.this,movelist.class);
                   startActivity(intent);
               }
               else {

                   ediT2.setText(null);
                   builder.setMessage("Invalid Username or Password !!! ");
                   builder.setCancelable(false);
                   builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {
                       }
                   });
                   AlertDialog alert = builder.create();
                   alert.setTitle("Login Error");
                   alert.show();
                  /// ediT2.setText(null);
                   //Toast.makeText(Login_Activity.this,"Invalid UserName or Password!!",Toast.LENGTH_SHORT).show();
               }

           } // end method onClick
       });

       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent2 = new Intent(Login_Activity.this , Singup_Activity.class);
               startActivity(intent2);

           }
       });

            } // end method onCreate



    public boolean checkUserExist(String username, String password){
        String[] columns = {"username"};

        db = controllerdb.getReadableDatabase();

        String selection = "username=? and pass = ?";
        String[] selectionArgs = {username, password};

        Cursor cursor = db.query("users", columns, selection, selectionArgs, null, null, null);
        int count = cursor.getCount();
        cursor.close();

        if(count > 0){
            return true;
        } else {
            return false;
        }
    } // end method checkUserEix
}//end class
