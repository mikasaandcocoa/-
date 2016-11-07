package com.example.administrator.pyq;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PYQ extends Activity {
    private Context mContext;
    private ListView listView;
    private MyAdapter myAdapter1 = null;
    private List<Lxr> list = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyq);
        mContext = PYQ.this;
        init();
    }
    private void init() {
        list = new ArrayList<>();
        list.add(new Lxr(R.drawable.huiyuan5,"梦里花落知多少"));
        list.add(new Lxr(R.drawable.huiyuan3,"单纯"));
        list.add(new Lxr(R.drawable.huiyuan2,"为什么"));
        listView =(ListView) findViewById(R.id.listview);
        myAdapter1 = new MyAdapter(mContext,R.layout.activity_lxr,list);
        listView.setAdapter(myAdapter1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
           public void onItemClick(AdapterView<?> adapterView, View view,int i,long l) {
               Intent intent = new Intent(mContext,MainActivity1.class);
               startActivity(intent);
           }
        });
    }


}
