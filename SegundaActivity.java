package com.example.elton.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Intent i = getIntent();
        String nome = i.getStringExtra("nome");
        ((TextView)findViewById(R.id.dados)).setText(nome);
    }

    public void voltar(View v) {
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
