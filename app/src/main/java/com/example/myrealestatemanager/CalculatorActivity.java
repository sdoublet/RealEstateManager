package com.example.myrealestatemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CalculatorActivity extends AppCompatActivity {

    @BindView(R.id.price_edit)
    EditText priceEdit;
    @BindView(R.id.duration_edit)
    EditText duration;
    @BindView(R.id.taux_edit)
    EditText taux;
    @BindView(R.id.result_edit)
    TextView result;
    @BindView(R.id.result_credit)
    Button resultCredit;
    double p;
    float t;
    int d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ButterKnife.bind(this);
        resultCredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p = Double.parseDouble(priceEdit.getText().toString());
                t = Float.parseFloat(taux.getText().toString());
                d = Integer.parseInt(duration.getText().toString());
                double calcul =(calculResult(p, d, t));
               // result.setText(Double.toString(calcul));
                result.setText(String.format(Locale.getDefault(), "%.2f $/month", calcul));
            }
        });




    }

    private double calculResult(double price, int duration, float taux){
        double ratePerMonth = (taux / 100.0) / 12.0;
        int totalMonth = duration * 12;

        double result =  (price * ratePerMonth) / (1 - Math.pow(1 + ratePerMonth, -totalMonth));

        return  ((long)(result * 100) / 100.0);
    }
}
