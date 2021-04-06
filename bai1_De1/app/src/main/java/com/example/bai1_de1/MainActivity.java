package com.example.bai1_de1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText etBankinh = findViewById(R.id.et_Bankinh);
        EditText etCao = findViewById(R.id.et_Chieucao);
        RadioButton rbDientich = findViewById(R.id.rb_dientich);
        RadioButton rbThetich = findViewById(R.id.rb_thetich);
        Button btn = findViewById(R.id.btn_tt);
        TextView tvketqua = findViewById(R.id.tv_kqua);

        try {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Double kqua = 0.0;
                    Double r = Double.parseDouble(etBankinh.getText().toString());
                    Double h = Double.parseDouble(etCao.getText().toString());
                    if(rbDientich.isChecked()){
                        kqua = Math.PI*r*r + 2*Math.PI*r*h;
                    }
                    if(rbThetich.isChecked()){
                        kqua = Math.PI*r*r*h;
                    }
                    tvketqua.setText("ket qua: " + kqua);
                }
            });
        }
        catch (Exception e){
           tvketqua.setText(e+"");
        }
    }
}