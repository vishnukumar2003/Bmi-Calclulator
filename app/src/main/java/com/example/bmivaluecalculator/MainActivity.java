package com.example.bmivaluecalculator;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import android.os.Bundle;
import android.widget.EditText;

import android.widget.TextView;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private EditText height;
private EditText weight;
private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        height=(EditText) findViewById(R.id.height);
        weight=(EditText) findViewById(R.id.weight_input);
        result=(TextView) findViewById(R.id.result);}
        public void CalculateBMI(View V)
        {
            String h=height.getText().toString();
            String w=weight.getText().toString();
            if(h!=null && !" ".equals(h) && w!=null && !" ".equals(w))
            {
                float hf=Float.parseFloat(h);
                float wf=Float.parseFloat(w);
                float bmi=((wf/(hf*hf)))*10000;
                String lbl="";

                if(bmi<=18.5)
                {
                  lbl=getString(R.string.under);
                }
                else if(bmi>18.55 && bmi<=24.99)
                {
                    lbl=getString(R.string.normal);
                } else if (bmi>25 && bmi<29.9) {
                    lbl=getString(R.string.Over);

                }
                else {
                    lbl=getString(R.string.obesity);
                }
              result.setText(bmi+"\n\n"+lbl);

            }


    }
}