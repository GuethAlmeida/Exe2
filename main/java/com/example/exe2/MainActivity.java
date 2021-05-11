package com.example.exe2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText txt1;
    EditText txt2;
    TextView resultado;

    public void executar(View view) {

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        resultado = findViewById(R.id.textView);

        String s1 = txt1.getText().toString();
        String s2 = txt2.getText().toString();
        String s3 = s1 + " " + s2;

        if(s1.isEmpty() || s2.isEmpty()){
            resultado.setText("Nome não inserido");

        }else{
            resultado.setText("Olá " + s3  );
        }
    }
}