package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout relativeLayout;
    private SeekBar seekBarRed;
    private SeekBar seekBarGreen;
    private SeekBar seekBarBlue;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        seekBarRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean t) {
                int r = seekBarRed.getProgress();
                int g = seekBarGreen.getProgress();
                int b = seekBarBlue.getProgress();
                relativeLayout.setBackgroundColor(Color.rgb(r, g, b));
                textView.setText("(" + String.valueOf(r) + "," + String.valueOf(g) + "," + String.valueOf(b) + ")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                int r = seekBarRed.getProgress();
                int g = seekBarGreen.getProgress();
                int b = seekBarBlue.getProgress();
                relativeLayout.setBackgroundColor(Color.rgb(r, g, b));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int r = seekBarRed.getProgress();
                int g = seekBarGreen.getProgress();
                int b = seekBarBlue.getProgress();
                relativeLayout.setBackgroundColor(Color.rgb(r, g, b));
            }
        });
        seekBarGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean t) {
                int r = seekBarRed.getProgress();
                int g = seekBarGreen.getProgress();
                int b = seekBarBlue.getProgress();
                relativeLayout.setBackgroundColor(Color.rgb(r, g, b));
                textView.setText("(" + String.valueOf(r) + "," + String.valueOf(g) + "," + String.valueOf(b) + ")");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                int r = seekBarRed.getProgress();
                int g = seekBarGreen.getProgress();
                int b = seekBarBlue.getProgress();
                relativeLayout.setBackgroundColor(Color.rgb(r, g, b));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int r = seekBarRed.getProgress();
                int g = seekBarGreen.getProgress();
                int b = seekBarBlue.getProgress();
                relativeLayout.setBackgroundColor(Color.rgb(r, g, b));
            }
        });

        seekBarBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean t) {
                int r = seekBarRed.getProgress();
                int g = seekBarGreen.getProgress();
                int b = seekBarBlue.getProgress();
                relativeLayout.setBackgroundColor(Color.rgb(r, g, b));
                textView.setText("(" + String.valueOf(r) + "," + String.valueOf(g) + "," + String.valueOf(b) + ")");

            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                int r = seekBarRed.getProgress();
                int g = seekBarGreen.getProgress();
                int b = seekBarBlue.getProgress();
                relativeLayout.setBackgroundColor(Color.rgb(r, g, b));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int r = seekBarRed.getProgress();
                int g = seekBarGreen.getProgress();
                int b = seekBarBlue.getProgress();
                relativeLayout.setBackgroundColor(Color.rgb(r, g, b));
            }
        });
    }

    public void init()
    {
        relativeLayout = findViewById(R.id.relativeLayout);
        seekBarRed = findViewById(R.id.seekBarRed);
        seekBarGreen = findViewById(R.id.seekBarGreen);
        seekBarBlue = findViewById(R.id.seekBarBlue);
        textView = findViewById(R.id.textView);
    }
}