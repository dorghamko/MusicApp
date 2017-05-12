package com.example.safsaf.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.safsaf.musicapp.R.id.tracks_musicLibrary;
import static com.example.safsaf.musicapp.R.id.tracks_nowPlaying;

public class TracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);


        // find the view that shows the music Library

        final Button tracksMusicLibrary = (Button) findViewById(tracks_musicLibrary);

        // set a clickListener  on that view
        tracksMusicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // create a new intent to open the {@link MainActivity}

                Intent tracksMusicLibraryIntent = new Intent(TracksActivity.this, MainActivity.class);
                // start the new Activity
                startActivity(tracksMusicLibraryIntent);

            }
        });

        // find the view that shows the now playing

        final Button tracksNowPlaying = (Button) findViewById(tracks_nowPlaying);

        // set a clickListener  on that view
        tracksNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // create a new intent to open the {@link NowPlayingActivity}

                Intent tracksNowPlayingIntent = new Intent(TracksActivity.this, NowPlayingActivity.class);
                // start the new Activity
                startActivity(tracksNowPlayingIntent);

            }
        });
    }
}
