package com.example.safsaf.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // find the view that shows the playList

        final TextView playLists = (TextView) findViewById(R.id.playLists);

        // set a clickListener  on that view
        playLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // create a new intent to open the {@link PlayListsActivity}

                Intent playListsIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                // start the new Activity
                startActivity(playListsIntent);

            }
        });

        // find the view that shows the tracks

        final TextView tracks = (TextView) findViewById(R.id.tracks);

        // set a clickListener  on that view
        tracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // create a new intent to open the {@link TracksActivity}

                Intent tracksIntent = new Intent(MainActivity.this, TracksActivity.class);
                // start the new Activity
                startActivity(tracksIntent);

            }
        });

        // find the view that shows the now playing

        final TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);

        // set a clickListener  on that view
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // create a new intent to open the {@link NowPlayingActivity}

                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                // start the new Activity
                startActivity(nowPlayingIntent);

            }
        });
    }


}
