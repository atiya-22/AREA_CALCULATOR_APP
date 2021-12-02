package com.example.areacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AREA_OF_CIRCLE extends AppCompatActivity {
    EditText mEditRadius;
    TextView mTextResult;
    Button mButtonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_circle);
        mEditRadius=(EditText) findViewById(R.id.editradius);
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
        Double value1= Double.parseDouble(mEditRadius.getText().toString());
        Double calculateValue =22*(value1*value1)/7;
        mTextResult.setText(calculateValue.toString());
    }
}

