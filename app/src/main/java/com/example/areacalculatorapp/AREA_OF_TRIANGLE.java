package com.example.areacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AREA_OF_TRIANGLE extends AppCompatActivity {
    EditText mEditBase;
    EditText mEditHeight;
    TextView mTextResult;
    Button mButtonCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_triangle);
        mEditBase=(EditText) findViewById(R.id.editbase);
        mEditHeight=(EditText) findViewById(R.id.editheight);
        mTextResult=(TextView) findViewById(R.id.result) ;
        mButtonCalculate=(Button) findViewById(R.id.calculate);

        mButtonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                calculates();
            }
        });
    }
    public void calculates()
    {
        Double value1= Double.parseDouble(mEditBase.getText().toString());
        Double value2= Double.parseDouble(mEditHeight.getText().toString());
        Double calculateValue =1*(value1*value2)/2;
        mTextResult.setText(calculateValue.toString());

    }
}