package com.example.pim_hotelaria_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ReserActivity extends AppCompatActivity {

    private Button concluir_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva);

        getSupportActionBar().hide();

        concluir_button = findViewById(R.id.button_concluir);

        concluir_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent( ReserActivity.this, TicketActivity.class);
                startActivity(intent);
            }
        });
    }
}
