package com.example.pim_hotelaria_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CancelarActivity extends AppCompatActivity {

    private Button cancelar_button;
    private ImageView image_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancelar);

        getSupportActionBar().hide();

        cancelar_button = findViewById(R.id.button_confirmar);
        image_voltar = findViewById(R.id.imageView_voltar2);

        cancelar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent( CancelarActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        image_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent( CancelarActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
