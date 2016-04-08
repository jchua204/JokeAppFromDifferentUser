package com.example.student.badjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class newbadjoke extends AppCompatActivity {


    public int badnesslvl = getIntent().getIntExtra("progress",0) ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newbadjoke);


        String strJoke;
        if (badnesslvl >1){
            strJoke ="2";
        }else if(badnesslvl <1){
            strJoke = "0";
        }else{
            strJoke ="1";
        }


        TextView txtJoke = (TextView) findViewById(R.id.txtJoke);
        txtJoke.setText(strJoke);
    }

    public void getAnswer (View vw){
        String strAnswer;


        if (badnesslvl >1){
            strAnswer ="2";
        }else if(badnesslvl <1){
            strAnswer = "0";
        }else{
            strAnswer ="1";
        }

        TextView txtAnswer = (TextView) findViewById(R.id.txtAnswer);
        txtAnswer.setText(strAnswer);
    }

    public void goBack(View vw){
    Intent menu = new Intent();
        finish();
    }

}
