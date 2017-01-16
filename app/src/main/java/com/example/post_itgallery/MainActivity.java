package com.example.post_itgallery;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost=(TabHost)findViewById(android.R.id.tabhost);

        TabHost.TabSpec albums=tabHost.newTabSpec("Albums");
        TabHost.TabSpec photos=tabHost.newTabSpec("Photos");

        albums.setIndicator("Albums");
        albums.setContent(new Intent(this,Albums.class));

        photos.setIndicator("Photos");
        photos.setContent(new Intent(this,Photos.class));

        tabHost.addTab(albums);
        tabHost.addTab(photos);

    }

    }
