package com.example.multiexcerice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btn_renitializer, btn_afficher, btn_quitter;
    EditText ed_number;
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Exercise 2 : Multiplication");

        btn_renitializer = findViewById(R.id.btn_renitialiser);
        btn_afficher = findViewById(R.id.btn_afficher);
        btn_quitter = findViewById(R.id.bnt_quitter);
        ed_number = findViewById(R.id.ed_number);
        tv_result = findViewById(R.id.tv_result);

        for (int i = 0; i <= 10; i++) {
            tv_result.append("? * " + i + " = ? \n");
        }

        btn_renitializer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed_number.setText("");
                tv_result.setText("");
               btn_afficher.performClick();
            }
        });
        btn_afficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed_number.getText().toString().trim().length() == 0) {
                    tv_result.setText("");
                    for (int i = 0; i <= 10; i++) {
                        tv_result.append("? * " + i + " = ? \n");
                    }
                    Toast.makeText(MainActivity.this, "Veuillez saisir un entier!!", Toast.LENGTH_SHORT).show();
                } else {
                    tv_result.setText("");
                    String number = ed_number.getText().toString();
                    int n = Integer.parseInt(number);
                    int f = 0;
                    for (int i = 0; i <= 10; i++) {
                        f = n * i;
                        tv_result.append(n + "*" + i + " = " + f + "\n");
                    }
                }
            }
        });

        btn_quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}