package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {
    ArrayList arrayList=new ArrayList();
    String condition="SelectedItemsFromShoppingCart";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        arrayList= (ArrayList) getIntent().getSerializableExtra("selectedList");
        TextView t1 = findViewById(R.id.textView3);
        for(int i = 0; i < arrayList.size(); i++){
            t1.append(arrayList.get(i).toString() + "\n");
        }
        Button backButton = findViewById(R.id.button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShoppingActivity.this, MainActivity.class);
                intent.putExtra("selectedList", arrayList);
                startActivity(intent);
            }
        });
    }
}
