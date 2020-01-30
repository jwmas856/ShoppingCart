package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
        // Use a bundle with intents.
        // https://www.youtube.com/watch?v=3YCkW7J9NP0
        // Dont pass the ArrayList to different activities, use the bundle.
        //1/30/29
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
                Intent intent=new Intent(MainActivity.this,ShoppingActivity.class);
                intent.putExtra("selectedList", shoppingCart);
                startActivity(intent);
            }
        });

    }
}
