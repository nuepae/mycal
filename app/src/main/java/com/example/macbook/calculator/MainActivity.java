package com.example.macbook.calculator;

import android.location.GpsStatus;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CalculaterListener{
    TextView firstOperandEditText , secondOperandEditText,resultTextView;
    Double first , second , result;
    MainController mainController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstOperandEditText = (EditText)findViewById(R.id.operand_one_edit_text);
        secondOperandEditText = (EditText)findViewById(R.id.operand_two_edit_text);
        resultTextView = (TextView)findViewById(R.id.operation_result_text_view);

        mainController = new MainController();
        mainController.setListener(this);

    }

    public void onAdd(View view){
        first = Double.parseDouble(firstOperandEditText.getText().toString());
        second = Double.parseDouble(secondOperandEditText.getText().toString());
        mainController.add(first,second);
    }


    public void onSub(View view){
        first = Double.parseDouble(firstOperandEditText.getText().toString());
        second = Double.parseDouble(secondOperandEditText.getText().toString());
        mainController.sub(first,second);
    }

    public void onMul(View view){
        first = Double.parseDouble(firstOperandEditText.getText().toString());
        second = Double.parseDouble(secondOperandEditText.getText().toString());
        mainController.mul(first,second);
    }

    public void onDivide(View view){
        first = Double.parseDouble(firstOperandEditText.getText().toString());
        second = Double.parseDouble(secondOperandEditText.getText().toString());
        mainController.divide(first,second);
    }

    @Override
    public void onSuccess(String result) {
        resultTextView.setText(result);
    }
}

