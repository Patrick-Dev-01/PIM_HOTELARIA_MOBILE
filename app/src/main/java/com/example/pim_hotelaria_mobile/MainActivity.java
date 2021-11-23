package com.example.pim_hotelaria_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button quartos_button, button_reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        quartos_button = findViewById(R.id.quartos_button);
        button_reserva = findViewById(R.id.button_reservar);

        quartos_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        button_reserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(MainActivity.this, ReserActivity.class);
                startActivity(intent);
            }
        });
    }
}