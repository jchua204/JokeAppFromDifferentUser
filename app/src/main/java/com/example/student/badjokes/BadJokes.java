package com.example.student.badjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class BadJokes extends AppCompatActivity {
    ProgressBar proBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad_jokes);
        proBar = (ProgressBar) findViewById(R.id.proBar);
        proBar.setProgress(1);

    }

    public void proIncrease(View vw) {
        proBar.setProgress(proBar.getProgress() + 1);
    }

    public void proDecrease(View vw) {
        proBar.setProgress(proBar.getProgress() - 1);
    }


    public void newjoke (View vw) {
        int progress = proBar.getProgress();
        Intent getnewjoke = new Intent(this,newbadjoke.class) ;
        getnewjoke.putExtra("progress", progress) ;
        startActivity(getnewjoke);
    }

}
