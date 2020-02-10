package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        ArrayList arrayList = new ArrayList();
        TextView textview20 = findViewById(R.id.textView20);
        TextView textView21 = findViewById(R.id.textView21);

        Intent intent = getIntent();
        arrayList = intent.getStringArrayListExtra("itemNames");
        for(int i = 0; i < arrayList.size(); i++){
            textview20.append(arrayList.get(i) +"\n");
        }
        double total = intent.getDoubleExtra("totalCost",0);
        textView21.setText("Subtotal: " + total + "\n" + "Total Price: " + Math.round(total * 1.076) );

        Button backButton = findViewById(R.id.button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
