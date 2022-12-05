package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public String[] itemList={"bieganie","skakanie","siatkówka","tenis","siłka","szachy","koszykówka","pływanie'","marsz","łyżwy"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button listaBtn = (Button) findViewById(R.id.listaBtn);
        listaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), listaActivity.class);
                startIntent.putExtra("com.example.zadanie.transsferredString", itemList);
                startActivity(startIntent);
            }
        });
    }
}