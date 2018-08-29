package com.example.anubis.aula_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nomecompleto;
    Button getName;
    EditText nome;
    EditText sobrenome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.edit_name);
        sobrenome = (EditText) findViewById(R.id.edit_sobrenome);
        getName = (Button) findViewById(R.id.get_name);

        
    }
}
