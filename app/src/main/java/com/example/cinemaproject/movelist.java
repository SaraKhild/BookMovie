package com.example.cinemaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class movelist extends AppCompatActivity {

    Button btnlogin1;
    Button btnlogin2;
    Button  btnlogin3;
    Button  btnlogin4;
    Button btntype;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movelist);

        btntype = findViewById(R.id.buttonsinup);
        btnlogin1 = (Button) findViewById(R.id.but1);
        btnlogin2 = (Button) findViewById(R.id.but2);
        btnlogin3 = (Button) findViewById(R.id.but3);
        btnlogin4 = (Button) findViewById(R.id.but4);

        btnlogin1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent intent = new Intent(movelist.this, CheckOut_Activity.class);
                 startActivity(intent);
            }
        });//end method

        btnlogin2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent intent = new Intent(movelist.this, CheckOut_Activity.class);
                startActivity(intent);
            }
        });//end method

        btnlogin3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent intent = new Intent(movelist.this, CheckOut_Activity.class);
                startActivity(intent);
            }
        });//end method

        btnlogin4.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent intent = new Intent(movelist.this, CheckOut_Activity.class);
                startActivity(intent);
            }
        });//end method


       btntype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu( movelist.this , btntype);
                popupMenu.getMenuInflater().inflate(R.menu.menu_movie_type , popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch (item.getItemId()){

                            case R.id.item_action:
                                Intent intent1 = new Intent( movelist.this , Action_Movie.class);
                                startActivity(intent1);
                                return true;

                            case  R.id.item_drama:
                                Intent intent2 = new Intent( movelist.this , Drama_Movie.class);
                                startActivity(intent2);
                                return true;
                        }//end switch
                        return true;
                    }// end method
                });
                popupMenu.show();    }    });
    }// end oncreate
}//end class



