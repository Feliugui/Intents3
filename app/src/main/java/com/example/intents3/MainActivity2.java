package com.example.intents3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    EditText editText1;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText1 = findViewById(R.id.comEstas);
        editText2 = findViewById(R.id.aniversari);
        Button b1 = findViewById(R.id.boto1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    String text1 = editText1.getText().toString();
    int text2 = Integer.parseInt(editText2.getText().toString());
    Intent intent1 = new Intent();
    intent1.setData(Uri.parse(text1));
    intent1.putExtra("numero",text2);
    setResult(1,intent1);
    finish();

    }
}