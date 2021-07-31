package com.example.st.shortvideo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // add a video to my app ( I wrote the code in the OnCreate method because I want the video start when I run the app )
        VideoView video = (VideoView)findViewById(R.id.shortFilm);
        String videoPath = "android.resource://"+getPackageName()+"/"+R.raw.demovideo;
       video.setVideoPath(videoPath);

        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(video);
        video.setMediaController(mediaController);
        video.start();
    }
}
