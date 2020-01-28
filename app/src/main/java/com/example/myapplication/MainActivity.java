package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button addCodMW = findViewById(R.id.buttonCodMW);
    Button btnCheckout = findViewById(R.id.buttonCheckout);
    Button showShoppingCart = findViewById(R.id.buttonViewCart);
    double totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addCodMW.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                totalPrice+= 59.99;
            }
        });
        showShoppingCart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            }
        });
        btnCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
