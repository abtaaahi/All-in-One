package com.abtahiapp.assignmentfourallmerged;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity4 extends AppCompatActivity {
    Button buttonOne;
    EditText edittextOne;
    EditText edittextTwo;
    EditText edittextThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        buttonOne=findViewById(R.id.bt_1);
        edittextOne=findViewById(R.id.et_1);
        edittextTwo=findViewById(R.id.et_2);
        edittextThree=findViewById(R.id.et_3);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String productName= edittextOne.getText().toString();
                double productPrice = Double.parseDouble(edittextTwo.getText().toString());
                int productQuantity = Integer.parseInt(edittextThree.getText().toString());
                double totalCost = productPrice * productQuantity;
                Intent i= new Intent(MainActivity4.this,MainActivity5.class);
                i.putExtra("productName", productName);
                i.putExtra("totalCost", totalCost);
                startActivity(i);
            }
        });
    }
}