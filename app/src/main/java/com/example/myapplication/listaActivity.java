package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class listaActivity extends AppCompatActivity {

    public String itemsTable[]=new String[10];
    public ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        Resources res =getResources();
        itemsTable=res.getStringArray(R.array.items);

        if(getIntent().hasExtra("com.example.myapplication.transferredString")){
            myListView=(ListView) findViewById(R.id.myListView);
            String text[]=getIntent().getExtras().getStringArray("com.example.myapplication.transferredString");
            myListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(),R.layout.activity_text_view_layout,text));
        }
        Button backBtn = (Button) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
            }
    });
    }
}