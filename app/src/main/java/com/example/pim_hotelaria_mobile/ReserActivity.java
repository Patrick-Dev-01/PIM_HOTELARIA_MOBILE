package com.example.pim_hotelaria_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class ReserActivity extends AppCompatActivity {

    private Button concluir_button;
    private ImageView image_voltar;

    Connection connect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva);

        getSupportActionBar().hide();

        image_voltar = findViewById(R.id.imageView_voltar);
        concluir_button = findViewById(R.id.button_concluir);

        image_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReserActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        concluir_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReserActivity.this, TicketActivity.class);
                startActivity(intent);
            }
        });
    }
}
