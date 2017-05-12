package com.example.safsaf.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.safsaf.musicapp.R.id.create_playlist;
import static com.example.safsaf.musicapp.R.id.playLists;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        // find the view that shows the Tracks

        final Button createPlayLists = (Button) findViewById(create_playlist);

        // set a clickListener  on that view
        createPlayLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // create a new intent to open the {@link TracksActivity}

                Intent tracksIntent = new Intent(PlaylistActivity.this, TracksActivity.class);
                // start the new Activity
                startActivity(tracksIntent);

            }
        });
    }
}
