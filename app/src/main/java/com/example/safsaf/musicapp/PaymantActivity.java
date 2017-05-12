package com.example.safsaf.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.os.Build.VERSION_CODES.N;
import static com.example.safsaf.musicapp.R.id.nowPlaying_tracks;
import static com.example.safsaf.musicapp.R.id.payment_tracks;

public class PaymantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymant);
        // find the view that shows the tracks

        final Button paymentTracks = (Button) findViewById(payment_tracks);

        // set a clickListener  on that view
        paymentTracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // create a new intent to open the {@link TracksActivity}

                Intent nowPlayingTracksIntent = new Intent(PaymantActivity.this, TracksActivity.class);
                // start the new Activity
                startActivity(nowPlayingTracksIntent);

            }
        });
    }
}
