package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView result_field;
Double firstValues,twoValues,result;
String operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result_field=findViewById(R.id.result_field);
    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.one:
                result_field.append("1");

                break;
                case R.id.two:
                result_field.append("2");

                break;
                case R.id.three:
                result_field.append("3");

                break;
                case R.id.four:
                result_field.append("4");

                break;case R.id.five:
                result_field.append("5");

                break;case R.id.six:
                result_field.append("6");

                break;case R.id.seven:
                result_field.append("7");

                break;case R.id.eight:
                result_field.append("8");

                break;case R.id.nine:
                result_field.append("9");

                break;case R.id.zero:
                result_field.append("0");


                break;
            case R.id.clear:
                result_field.setText("  ");
                break;

        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.plus:
                firstValues = Double.valueOf(result_field.getText().toString());
                operation = "+";
                result_field.setText(firstValues + "+");
                break;
            case R.id.minus:

                operation = "-";

                firstValues = Double.valueOf(result_field.getText().toString());
                result_field.setText(firstValues + "-");
                break;
            case R.id.division:

                operation = "/";

                firstValues = Double.valueOf(result_field.getText().toString());
                result_field.setText(firstValues + "/");
                break;
            case R.id.multiply:

                operation = "*";

                firstValues = Double.valueOf(result_field.getText().toString());
                result_field.setText(firstValues + "*");
                break;
            case R.id.equal:
                if (operation != null) {
                    String two = result_field.getText().toString().replace(firstValues + operation+"", " ");
                    twoValues = Double.valueOf(two);
                    switch (operation) {
                        case "+":
                            plus();
                            break;
                        case "*":
                            multiply();
                            break;
                        case "/":
                            division();
                            break;
                        case "-":
                            minus();
                            break;

                    }


                }
        }
    }
    public void plus(){
        if (firstValues!=null){
            result_field.setText("");
        }else {
            result = firstValues + twoValues;
            result_field.setText(result.toString());
        }
    }
    public void division() {
        if (firstValues != null) {
            result_field.setText("");
        } else {
            result = firstValues / twoValues;
            result_field.setText(result.toString());
        }
    }
    public void multiply() {
        if (firstValues != null) {
            result_field.setText("");
        } else {
            result = firstValues * twoValues;
            result_field.setText(result.toString());
        }
    }
    public void minus() {
        if (firstValues != null) {
            result_field.setText("");
        } else {
            result = firstValues - twoValues;
            result_field.setText(result.toString());
        }
    }

}
