package com.example.elton.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void navegar(View v) {
        Intent i= new Intent(this, SegundaActivity.class);
        //i.putExtra("nome",((EditText)findViewById(R.id.nome)).getText().toString());
        startActivity(i);
    }

    public void sair(DialogInterface dialog, int which){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |    Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();

    }

}
