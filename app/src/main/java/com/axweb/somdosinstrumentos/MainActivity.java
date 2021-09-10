package com.axweb.somdosinstrumentos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv_bateria;
    ImageView iv_guitarra;
    ImageView iv_harpa;
    ImageView iv_bongo;
    ImageView iv_triangulo;
    ImageView iv_xilofone;

    MediaPlayer audio_bateria;
    MediaPlayer audio_guitarra;
    MediaPlayer audio_harpa;
    MediaPlayer audio_bongo;
    MediaPlayer audio_triangulo;
    MediaPlayer audio_xilofone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        sons();

        iv_bateria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio_bateria.start();
            }
        });
        iv_guitarra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio_guitarra.start();
            }
        });
        iv_harpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio_harpa.start();
            }
        });
        iv_bongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio_bongo.start();
            }
        });
        iv_triangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio_triangulo.start();
            }
        });
        iv_xilofone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio_xilofone.start();
            }
        });


    }

    private void init() {
        iv_bateria = findViewById(R.id.iv_bateria);
        iv_guitarra = findViewById(R.id.iv_guitarra);
        iv_harpa = findViewById(R.id.iv_harpa);
        iv_bongo = findViewById(R.id.iv_bongo);
        iv_triangulo = findViewById(R.id.iv_triangulo);
        iv_xilofone = findViewById(R.id.iv_xilofone);
    }

    private void sons() {
        audio_bateria = MediaPlayer.create(getApplicationContext(), R.raw.bateria);
        audio_guitarra = MediaPlayer.create(getApplicationContext(), R.raw.guitarra);
        audio_harpa = MediaPlayer.create(getApplicationContext(), R.raw.harpa);
        audio_bongo = MediaPlayer.create(getApplicationContext(), R.raw.bongo);
        audio_triangulo = MediaPlayer.create(getApplicationContext(), R.raw.triangulo);
        audio_xilofone = MediaPlayer.create(getApplicationContext(), R.raw.xilofone);


    }
}