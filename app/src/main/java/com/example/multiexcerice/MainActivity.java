package com.example.multiexcerice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btn_renitializer,btn_afficher,btn_quitter;
    EditText ed_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Exercise 2 : Multiplication");

        btn_renitializer=findViewById(R.id.btn_renitialiser);
        btn_afficher=findViewById(R.id.btn_afficher);
        btn_quitter=findViewById(R.id.bnt_quitter);
        ed_number=findViewById(R.id.ed_number);
        btn_renitializer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              ed_number.setText("");
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