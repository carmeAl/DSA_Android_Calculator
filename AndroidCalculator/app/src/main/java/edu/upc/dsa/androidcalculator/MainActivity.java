package edu.upc.dsa.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onClickButton(View view){
        Button boton = (Button) view;
        TextView textView=(TextView) findViewById(R.id.textViewOperacion);
        switch (Integer.toString(boton.getId())){

            case "button0":
                 textView.append("0");
                break;
            case "button1":
                textView.append("1");
                break;
            case "button2":
                textView.append("2");
                break;
            case "button3":
                textView.append("3");
                break;
            case "button4":
                textView.append("4");
                break;
            case "button5":
                textView.append("5");
                break;
            case "button6":
                textView.append("6");
                break;
            case "button7":
                textView.append("7");
                break;
            case "button8":
                textView.append("8");
                break;
            case "button9":
                textView.append("9");
                break;
            case "buttonIgual":
                textView.append("=");
                break;
            case "buttonCos":
                textView.append("cos(");
                break;
            case "buttonSum":
                textView.append("+");
                break;
            case "buttonSubstract":
                textView.append("-");
                break;
            case "buttonSin":
                textView.append("sin(");
                break;
            case "buttonComa":
                textView.append(",");
                break;
            case "buttonTan":
                textView.append("tan(");
                break;
            case "buttonDivision":
                textView.append("/");
                break;
            case "buttonAC":
                textView.append("AC");
                break;
            case "buttonParentesiFinish":
                textView.append(")");
                break;
            case "buttonMultiply":
                textView.append("x");
                break;
            default:
                textView.append("(");



        }
    }

    public void ClickButton8(View view) {
    }

    public void ClickButtonComa(View view) {
    }

    public void ClickButtonIgual(View view) {
    }

    public void ClickButton5(View view) {
    }

    public void ClickButton0(View view) {
    }

    public void ClickButtonCos(View view) {
    }

    public void ClickButton6(View view) {
    }

    public void ClickButtonSum(View view) {
    }

    public void ClickButtonSubstract(View view) {
    }

    public void ClickButtonSin(View view) {
    }

    public void ClickButtonTan(View view) {
    }

    public void ClickButtonDivision(View view) {
    }

    public void ClickButton9(View view) {
    }

    public void ClickButton1(View view) {
    }

    public void ClickButton4(View view) {
    }

    public void ClickButton3(View view) {
    }

    public void ClickButton7(View view) {
    }

    public void ClickButton2(View view) {
    }

    public void ClickButtonAC(View view) {
    }

    public void ClickButtonParentesiFinish(View view) {
    }

    public void ClickButtonMultiply(View view) {
    }

    public void ClickButtonParentesiStart(View view) {
    }
}