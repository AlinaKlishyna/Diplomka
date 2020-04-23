package com.example.user.history;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScrollingActivity_1 extends MainActivity {
    MediaPlayer sound_1;
    FloatingActionButton fab_1, startButton, stopButton, pauseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

          setText();

    }
    public void setText(){
        TextView textView1=(TextView)findViewById(R.id.textView1);
        Bundle bundle1= getIntent().getExtras();
        String str1 = bundle1.getString("1");
        textView1.setText(str1);
    }
}

