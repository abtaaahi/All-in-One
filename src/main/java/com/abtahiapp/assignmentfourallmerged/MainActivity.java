package com.abtahiapp.assignmentfourallmerged;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonOne,buttonTwo,buttonThree,buttonFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne=findViewById(R.id.b_1);
        buttonOne.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
                return false;
            }
        });
        buttonTwo=findViewById(R.id.b_2);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii= new Intent(MainActivity.this,MainActivity3.class);
                startActivity(ii);
            }
        });
        buttonThree=findViewById(R.id.b_3);
        buttonThree.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent iii= new Intent(MainActivity.this,MainActivity4.class);
                startActivity(iii);
                return false;
            }
        });
        buttonFour=findViewById(R.id.b_4);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonFour.setText("©Abtahi Md. Mahib Uddin");
                buttonFour.setTextSize(15);
                //buttonFour.setTextColor(getResources().getColor(R.color.black));
                Toast.makeText(MainActivity.this,"Thanks!", Toast.LENGTH_LONG).show();
            }
        });
    }
}