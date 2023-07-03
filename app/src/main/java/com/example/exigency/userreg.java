package com.example.exigency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class userreg extends AppCompatActivity {
Button re,cncl,viewd;
EditText nm,cntn,adhar,pswd,repswd;
databaseuser obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userreg);
        re = findViewById(R.id.button7);
        cncl = findViewById(R.id.button8);
        nm = findViewById(R.id.name);
        cntn = findViewById(R.id.contno);
        adhar = findViewById(R.id.aadhar);
        pswd = findViewById(R.id.pass);
        repswd = findViewById(R.id.repas);

        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nm.getText().toString().length()!=0 && cntn.getText().toString().length()!=0 && adhar.getText().toString().length()!=0 && pswd.getText().toString().length()!=0 && repswd.getText().toString().length()!=0)
                {
                    if (pswd.getText().toString().equals(repswd.getText().toString()) && cntn.getText().toString().length()==10) {
                        obj.adddata(nm.getText().toString(), cntn.getText().toString(), adhar.getText().toString(), pswd.getText().toString(), repswd.getText().toString());
                        Toast.makeText(userreg.this, "Registered Successfully", Toast.LENGTH_LONG).show();


                    } else {
                        Toast.makeText(userreg.this, "Password does not match or invalid input", Toast.LENGTH_LONG).show();
                        clnpass();
                    }

                }
                else{
                    Toast.makeText(userreg.this, "Invalid Input", Toast.LENGTH_LONG).show();
                }


            }
        });
        cncl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cln();
                Intent obj4 = new Intent(userreg.this, MainActivity.class);
                startActivity(obj4);
            }
        });


    }
        public void cln(){
            nm.setText(null);
            cntn.setText(null);
            adhar.setText(null);
            pswd.setText(null);
            repswd.setText(null);
        }
        public void clnpass()
        {
            pswd.setText(null);
            repswd.setText(null);
        }

}
