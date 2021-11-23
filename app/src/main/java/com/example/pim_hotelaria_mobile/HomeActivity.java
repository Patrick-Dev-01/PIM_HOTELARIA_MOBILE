package com.example.pim_hotelaria_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button reserve_button1, reserve_button2, button_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();

        button_voltar = findViewById(R.id.button_voltar);
        reserve_button1 = findViewById(R.id.button_Reserva);
        reserve_button2 = findViewById(R.id.button_Reserva2);

        button_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        reserve_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(HomeActivity.this, ReserActivity.class);
                startActivity(intent);
            }
        });

        reserve_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(HomeActivity.this, ReserActivity.class);
                startActivity(intent);
            }
        });
    }
}
