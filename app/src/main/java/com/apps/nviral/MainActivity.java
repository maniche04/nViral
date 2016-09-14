package com.apps.nviral;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.apps.nviral.helper.FontsOverride;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FontsOverride.setDefaultFont(this, "DEFAULT", "fonts/ptsans.ttf");
        FontsOverride.setDefaultFont(this, "MONOSPACE", "fonts/ptsans.ttf");
        FontsOverride.setDefaultFont(this, "SERIF", "fonts/ptsans.ttf");
        FontsOverride.setDefaultFont(this, "SANS_SERIF", "fonts/ptsans.ttf");
        setContentView(R.layout.activity_main);
    }
}
