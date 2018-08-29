package com.example.anubis.aula_lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nomecompleto;
    private Button btnProfessor;
    Button btnStudent;
    private EditText edtNome;
    public static final String PESSOA_NOME = "nome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtNome = (EditText) findViewById(R.id.edit_name);

        btnProfessor = (Button) findViewById(R.id.btn_professor);
        btnProfessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfessorActivity.class);
                intent.putExtra("nome", edtNome.getText().toString());
                startActivity(intent);
            }
        });



    }
}
