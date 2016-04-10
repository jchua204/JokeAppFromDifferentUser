package com.example.student.badjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class newbadjoke extends AppCompatActivity {


    public int intbadnesslvl = getIntent().getIntExtra("progress",0) ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newbadjoke);


        String strJoke;
        if (intbadnesslvl >1){
            strJoke ="What's colourful and smart?";
        }else if(intbadnesslvl <1){
            strJoke = "What do you call a belt made of watches?";
        }else{
            strJoke ="How did the hipster burn his mouth?";
        }

        TextView txtJoke = (TextView) findViewById(R.id.txtJoke);
        txtJoke.setText(strJoke);


    }

    public void getAnswer (View vw){

        String strAnswer;

        if (intbadnesslvl >1){
            strAnswer ="A brain-bow!";
        }else if(intbadnesslvl <1){
            strAnswer = "A waist of time!";
        }else{
            strAnswer ="He sipped the coffee before it was cool!";
        }

        TextView txtAnswer = (TextView) findViewById(R.id.txtAnswer);
        txtAnswer.setText(strAnswer);
    }

    public void goBack(View vw){
    Intent menu = new Intent();
        finish();
    }

}
