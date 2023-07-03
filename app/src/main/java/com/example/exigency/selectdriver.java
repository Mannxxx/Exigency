package com.example.exigency;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.os.Bundle;
import android.widget.TextView;

public class selectdriver extends AppCompatActivity {
    TextView dn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectdriver);
        dn=findViewById(R.id.textView20);

        List<String> list = new ArrayList<>();
        // add 5 element in ArrayList
        list.add("Driver Name: Ashok"+"\n\n"+"Ambulance No.:RJ19PA6767"+"\n\n"+"Contact: 9876543210");
        list.add("Driver Name: Sita"+"\n\n"+"Ambulance No.:RJ185A6967"+"\n\n"+"Contact: 9876543210");
        list.add("Driver Name: Babita"+"\n\n"+"Ambulance No.:RJ17PA6790"+"\n\n"+"Contact: 9876543210");
        list.add("Driver Name: Sarla"+"\n\n"+"Ambulance No.:RJ18PA6778"+"\n\n"+"Contact: 9876543210");
        list.add("Driver Name: Rishi"+"\n\n"+"Ambulance No.:RJ19PA6799"+"\n\n"+"Contact: 9876543210");

        selectdriver sd = new selectdriver();

        // take a random element from list and print them
        dn.setText(sd.getRandomElement(list));
    }

    // Function select an element base on index
    // and return an element
    public String getRandomElement(List<String> list)
    {
        Random rand = new Random();

        return list.get(rand.nextInt(list.size()));
    }

}

