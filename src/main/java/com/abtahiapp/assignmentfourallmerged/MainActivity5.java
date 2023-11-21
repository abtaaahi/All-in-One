package com.abtahiapp.assignmentfourallmerged;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    Button buttonTwo;
    TextView textViewOne;
    TextView textViewTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        String productName = getIntent().getStringExtra("productName");
        double totalCost = getIntent().getDoubleExtra("totalCost", 0);
        textViewOne = findViewById(R.id.tv_1);
        textViewOne.setText(productName);
        textViewTwo = findViewById(R.id.tv_2);
        textViewTwo.setText(String.format("%.2f", totalCost));
        buttonTwo=findViewById(R.id.bt_2);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity5.this,MainActivity4.class);
                startActivity(i);
            }
        });
    }
}