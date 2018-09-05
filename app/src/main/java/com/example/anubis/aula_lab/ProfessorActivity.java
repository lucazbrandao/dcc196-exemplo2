package com.example.anubis.aula_lab;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProfessorActivity extends AppCompatActivity {


    private TextView txtProfessorMsg;
    private Button btnConfirmar;
    private EditText edtSiape;

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

        btnConfirmar = (Button) findViewById(R.id.btn_confirm);
        edtSiape = (EditText) findViewById(R.id.edt_siape);

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultado = new Intent();
                resultado.putExtra(MainActivity.PROF_SIAPE, edtSiape.getText().toString());
                setResult(Activity.RESULT_OK, resultado);
                finish();
            }
        });

        Toast.makeText(getApplicationContext(),"Proffesor onCreate()", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onDestroy() {
        Toast.makeText(getApplicationContext(),"Exiting ProfessorActivity onDestroy()", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
