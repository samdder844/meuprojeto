package com.example.meuprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class meuprojeto2 extends AppCompatActivity {

    public EditText Nome;
    public EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meuprojeto2);

    }
        public void proximaTela (View view){

            Nome = findViewById(R.id.Nome);
            email = findViewById(R.id.email);

            String nomeText = Nome.getText().toString();
            String emailText = email.getText().toString();

            Intent intent = new Intent(this, meuprojeto2.class);

            intent.putExtra("nome", nomeText);
            intent.putExtra("email", emailText);

            startActivity(intent);
        }

}