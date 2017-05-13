package com.example.safsaf.musicapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.example.safsaf.musicapp.R.id.nowPlaying_musicLibrary;
import static com.example.safsaf.musicapp.R.id.nowPlaying_tracks;
import static com.example.safsaf.musicapp.R.id.tracks_musicLibrary;
import static com.example.safsaf.musicapp.R.id.tracks_nowPlaying;

public class NowPlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowplaying);
        // find the view that shows the music Library

        final Button nowPlayingMusicLibrary = (Button) findViewById(nowPlaying_musicLibrary);

        // set a clickListener  on that view
        nowPlayingMusicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // create a new intent to open the {@link MainActivity}

                Intent nowPlayingMusicLibraryIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                // start the new Activity
                startActivity(nowPlayingMusicLibraryIntent);

            }
        });

        // find the view that shows the tracks

        final Button nowPlayingTracks = (Button) findViewById(nowPlaying_tracks);

        // set a clickListener  on that view
        nowPlayingTracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // create a new intent to open the {@link TracksActivity}

                Intent nowPlayingTracksIntent = new Intent(NowPlayingActivity.this, TracksActivity.class);
                // start the new Activity
                startActivity(nowPlayingTracksIntent);

            }
        });
    }

}
