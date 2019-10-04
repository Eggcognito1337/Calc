package com.TcLt.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonPLUS, buttonEQ, buttonMINUS, buttonMULTIPLY, buttonMORE;
    private TextView textViewEredmeny;
    private String eredmeny;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
    }

    public void init()
    {
        button0 = findViewById((R.id.button0));
        button1 = findViewById((R.id.button1));
        button2 = findViewById((R.id.button2));
        button3 = findViewById((R.id.button3));
        button4 = findViewById((R.id.button4));
        button5 = findViewById((R.id.button5));
        button6 = findViewById((R.id.button6));
        button7 = findViewById((R.id.button7));
        button8 = findViewById((R.id.button8));
        button9 = findViewById((R.id.button9));

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button0:
            case R.id.button1:
            case R.id.button2:
            case R.id.button3:
            case R.id.button4:
            case R.id.button5:
            case R.id.button6:
            case R.id.button7:
            case R.id.button8:
            case R.id.button9:
                eredmeny += ((Button)v).getText();
                textViewEredmeny.setText(eredmeny);
                break;
            case R.id.buttonMINUS:
                break;
        }
    }
}
