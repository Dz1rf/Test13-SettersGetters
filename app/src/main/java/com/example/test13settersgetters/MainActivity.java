package com.example.test13settersgetters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText entX, entY;
    Button set, get;
    TextView readXY, readX, readY;
    SetGet setGet = new SetGet(1.0, 1.1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entX = findViewById(R.id.entX);
        entY = findViewById(R.id.entY);
        set = findViewById(R.id.butSet);
        get = findViewById(R.id.butGet);
        readXY = findViewById(R.id.textView1);
        readX = findViewById(R.id.textGetX);
        readY = findViewById(R.id.textGetY);

        set.setOnClickListener(this);
        get.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        String temp1 = entX.getText().toString();
        String temp2 = entY.getText().toString();

        switch (view.getId()) {
            case R.id.butSet:
                System.out.println("Set: " + temp1 + ", " + temp2);
                setGet.setX(Double.parseDouble(temp1));
                setGet.setY(Double.parseDouble(temp2));
                break;
            case R.id.butGet:
                System.out.println("Get: " + temp1 + ", " + temp2);
                double get1 = setGet.getX();;
                readX.setText(Double.toString(get1));
                double get2 = setGet.getY();
                readY.setText(Double.toString(get2));
                break;
        }
    }
}