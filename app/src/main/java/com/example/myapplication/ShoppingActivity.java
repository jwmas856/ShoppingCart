package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        t1.setText(arrayList.get(0).toString());
    }
}
