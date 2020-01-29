package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    double totalPrice;
    String m_Stuff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addCodMW = findViewById(R.id.buttonCodMW);
        Button btnCheckout = findViewById(R.id.buttonCheckout);
        final ArrayList shoppingCart = new ArrayList();

        addCodMW.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                totalPrice+= 59.99;
                shoppingCart.add("Call of Duty: Modern Warfare(2019)");
                }
        });

        btnCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ShoppingActivity.class);
                intent.putExtra("selectedList", shoppingCart);
                startActivity(intent);
            }
        });

    }
}
