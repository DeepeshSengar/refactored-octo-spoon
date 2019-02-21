package com.usernamepassword.ics.myvideo;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.media.MediaPlayer.*;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void play(View view){

        mediaPlayer.start();
    }

    public void pause(View view){

        mediaPlayer.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      mediaPlayer = MediaPlayer.create("this", R.raw.airplane);

    }
}
