package com.gz.customsipnner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gz.customsipnner.weight.MySpinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MySpinner spinner = (MySpinner) findViewById(R.id.spinner);

        ArrayList<String> a = new ArrayList<>();
        a.add("11");
        a.add("22");
        a.add("33");
        a.add("44");
        a.add("55");

        spinner.setText("选择");
        spinner.setPopList(a);
    }
}
