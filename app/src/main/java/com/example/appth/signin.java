package com.example.appth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class signin extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        ListView listView=findViewById(R.id.listview);
        List<String> List=new ArrayList<>();
        List.add("SamSung");
        List.add("Oppo");
        List.add("Xiaomi");
        List.add("Apple");
        List.add("Sony");
        List.add("LG");
        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_expandable_list_item_1,List);
        listView.setAdapter(arrayAdapter);

        img= (ImageView) findViewById(R.id.View2);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(signin.this,profile.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(signin.this,samsung.class));
            }
        });

    }
}