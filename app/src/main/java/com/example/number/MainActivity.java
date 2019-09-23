package com.example.number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2;
    Button btn;
    String getNum1, getNum2, res;
    int num1, num2, num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText)findViewById(R.id.num1);
        ed2=(EditText)findViewById(R.id.num2);

        btn=(Button)findViewById(R.id.but);

        btn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getNum1= ed1.getText().toString();
                getNum2=ed2.getText().toString();

                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                num3=num1+num2;
                res=String.valueOf(num3);
                Toast.makeText(getApplicationContext(),res, Toast.LENGTH_SHORT).show();
            }
        }));
    }
}
