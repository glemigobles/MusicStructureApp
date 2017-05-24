package com.example.jsura.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityPlaylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        String text = getString(R.string.toast3);

        Toast toast = Toast.makeText(this, text,
                Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

        Button btnPlaylist = (Button) findViewById(R.id.buttonPlaylist);
        btnPlaylist.setBackgroundResource(R.drawable.mybutton2);

        Button btnLibrary = (Button) findViewById(R.id.buttonLibrary);
        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLibrary();
            }
        });

        Button btnNowPlaying = (Button) findViewById(R.id.buttonNowPLaying);
        btnNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNowPlaying();
            }
        });

    }

    public void goToLibrary() {

        Intent i = new Intent(this, ActivityLibrary.class);
        startActivity(i);
    }

    public void goToNowPlaying() {

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}

