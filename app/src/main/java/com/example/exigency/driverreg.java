package com.example.exigency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class driverreg extends AppCompatActivity {
    Button reg,can,infor;
    EditText dnm,dcn,dlc,dad,dps,drps;
    driverdatabase dv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driverreg);
        reg=findViewById(R.id.button6);
        can=findViewById(R.id.button9);
        dnm=findViewById(R.id.editText7);
        dcn=findViewById(R.id.editText9);
        dlc=findViewById(R.id.editText10);
        dad=findViewById(R.id.editText11);
        dps=findViewById(R.id.editText12);
        drps=findViewById(R.id.editText13);
        dv=new driverdatabase((driverreg.this));

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dnm.getText().toString().length()!=0 && dcn.getText().toString().length()!=0 && dlc.getText().toString().length()!=0 && dad.getText().toString().length()!=0 && dps.getText().toString().length()!=0 && drps.getText().toString().length()!=0) {
                    dv.adddatad(dnm.getText().toString(), dcn.getText().toString(), dlc.getText().toString(), dad.getText().toString(), dps.getText().toString(), drps.getText().toString());
                    Toast.makeText(driverreg.this, "Data Inserted Successfully", Toast.LENGTH_LONG).show();
                    cln();
                }
                else {
                    Toast.makeText(driverreg.this, "Field cannot be empty", Toast.LENGTH_LONG).show();
                }
            }
        });
        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj5=new Intent(driverreg.this,MainActivity.class);
                startActivity(obj5);
            }
        });

    }
    public void cln(){
        dnm.setText(null);
        dcn.setText(null);
        dlc.setText(null);
        dad.setText(null);
        dps.setText(null);
        drps.setText(null);
        dnm.requestFocus();
    }
}
