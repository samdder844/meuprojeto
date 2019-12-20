package com.example.meuprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class meuprojeto3 extends AppCompatActivity {

    public TextView NomeCampo;
    public TextView emailCampo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.meuprojeto3);
        Bundle bundle = getIntent().getExtras();

        if(bundle != null) {

            String nome = bundle.getString("Nome");
            String email = bundle.getString("email");


            emailCampo = findViewById(R.id.textView);
            emailCampo.setText(email);

            nomeCampo = findViewById(R.id.textView);
            nomeCampo.setText(Nome);

        }

        }

    }

