package com.example.areacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AREA_OF_RECTANGLE extends AppCompatActivity {
    EditText mEditHeight;
    EditText mEditWidth;
    TextView mTextResult;
    Button mButtonCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_rectangle);
        mEditHeight=(EditText) findViewById(R.id.edit_height);
        mEditWidth=(EditText) findViewById(R.id.edit_width);
        mTextResult=(TextView) findViewById(R.id.result) ;
        mButtonCalculate=(Button) findViewById(R.id.calculate);
        mButtonCalculate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                calculates();
            }
        });
    }
    public void calculates(){
        Double value1= Double.parseDouble(mEditHeight.getText().toString());
        Double value2= Double.parseDouble(mEditWidth.getText().toString());
        Double calculate = value1*value2;
        mTextResult.setText(calculate.toString());

    }
}