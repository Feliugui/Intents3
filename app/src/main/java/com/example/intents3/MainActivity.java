package com.example.intents3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewPerResultat;
    TextView textViewPerResultat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.boto1);
        b1.setOnClickListener(this);
        textViewPerResultat = findViewById(R.id.dadesRetornades);
        textViewPerResultat = findViewById(R.id.dadesRetornades2);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivityForResult(intent,1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String textViewResultat = data.getData().toString();
       // int textViewResult2 = getIntent().getIntExtra("numero",0) ;
        textViewPerResultat.setText((textViewResultat));
       // textViewPerResultat2.setText((textViewResult2));
    }
}