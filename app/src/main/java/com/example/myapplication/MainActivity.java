package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList shoppingCart = new ArrayList();
    double totalPrice;
    String m_Stuff;
    String condition="SelectedItemsFromShoppingCart";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addCodMW = findViewById(R.id.buttonCodMW);
        Button btnCheckout = findViewById(R.id.buttonCheckout);
        if(getIntent().getExtras() != null){
            Bundle bundle = getIntent().getExtras();
            ArrayList arrayList =bundle.getStringArrayList("list");
            shoppingCart = arrayList;

        }
        addCodMW.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                totalPrice+= 59.99;
                shoppingCart.add("Call of Duty: Modern Warfare(2019)   | $59.99");
                }
        });

        btnCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShoppingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putDouble("totalCost", totalPrice);
                bundle.putStringArrayList("itemNames", shoppingCart);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

    public void AddSkyrim(View view) {
        shoppingCart.add("Skyrim Vr (Steam)     | $39.99");
        totalPrice+= 39.99;
    }

    public void AddSmash(View view) {
        shoppingCart.add("Super Smash Bros Ultimate     | $59.99");
        totalPrice+= 59.99;
    }
}
