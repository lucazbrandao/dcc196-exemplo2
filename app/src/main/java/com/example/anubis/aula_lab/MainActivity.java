package com.example.anubis.aula_lab;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_SIAPE = 1;
    public static final String PROF_SIAPE = "siape";
    public static final String PESSOA_NOME = "nome";

    private TextView nomecompleto;
    private Button btnProfessor;
    private Button btnStudent;
    private EditText edtNome;
    private TextView siapeMsg;


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
                 startActivityForResult(intent, REQUEST_SIAPE);
            }
        });

        siapeMsg = (TextView) findViewById(R.id.txtMensagem);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == MainActivity.REQUEST_SIAPE && resultCode == Activity.RESULT_OK && data != null) {
            Bundle bundleResultado = data.getExtras();
            String siape = bundleResultado.getString(MainActivity.PROF_SIAPE);
            siapeMsg.setText("Your SIAPE: " + siape);
        }
    }
}
