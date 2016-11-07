package com.example.administrator.pyq;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity1 extends AppCompatActivity {
    ListView listView;
    MyAdapter1 listAdapter;
    ArrayList<String> listString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyq);
        listView = (ListView)this.findViewById(R.id.listview);
        listString = new ArrayList<String>();
        for(int i = 0 ; i < 3 ; i++)
        {
            listString.add(Integer.toString(i));
            }
        listAdapter = new MyAdapter1(this);
        listView.setAdapter(listAdapter);
        
    }
}
