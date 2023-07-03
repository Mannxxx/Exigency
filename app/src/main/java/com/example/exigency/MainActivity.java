package com.example.exigency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button ur,dr,re;
    EditText username,password;
    Preferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = new Preferences(getApplicationContext());
        ur=findViewById(R.id.button);
        dr=findViewById(R.id.button2);
        re=findViewById(R.id.button3);
        username=findViewById(R.id.editText);
        password=findViewById(R.id.editText2);

re.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent obj=new Intent(MainActivity.this,registration.class);
        startActivity(obj);
    }
});
ur.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(username.getText().toString().equals("muskan") && password.getText().toString().equals("1234"))
        {
            Intent inte=new Intent(MainActivity.this,useside.class);
            startActivity(inte);
        }
        else{
            Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
            username.setText(null);
            password.setText(null);
        }
    }
});
dr.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        preferences.setUsername(username.getText().toString());
        Intent driv=new Intent(MainActivity.this,viewreq.class);
        startActivity(driv);
        }
});

    }
}
