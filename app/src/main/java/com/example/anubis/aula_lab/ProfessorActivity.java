package com.example.anubis.aula_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfessorActivity extends AppCompatActivity {


    private TextView txtProfessorMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);

        txtProfessorMsg = (TextView) findViewById(R.id.professor_msg);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nome = extras.getString(MainActivity.PESSOA_NOME);
            txtProfessorMsg.setText("Hello " + nome + '.');
        }
    }
}
