package com.example.bai1_de2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et_Rong = findViewById(R.id.et_chieuRong);
        EditText et_Dai = findViewById(R.id.et_chieuDai);
        EditText et_Cao = findViewById(R.id.et_chieuCao);
        RadioButton rb_Dientich = findViewById(R.id.rb_dienTich);
        RadioButton rb_Thetich = findViewById(R.id.rb_theTich);
        Button btn = findViewById(R.id.btn);
        TextView tv_res = findViewById(R.id.tv_res);
        try {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Double res = 0.0;
                    Double a = Double.parseDouble(et_Rong.getText().toString());
                    Double b = Double.parseDouble(et_Dai.getText().toString());
                    Double c = Double.parseDouble(et_Dai.getText().toString());
                    if(rb_Dientich.isChecked()){
                        res = 2*(a*b + a*c + b*c);
                    }
                    if(rb_Thetich.isChecked()){
                        res = a*b*c;
                    }
                    tv_res.setText("ket qua: " + res);
                }
            });
        }
        catch (Exception e){
            tv_res.setText("ket qua: " + e);
        }
    }
}