package com.example.administrator.pyq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/6 0006.
 */
public class MyAdapter1 extends BaseAdapter {
    private Context mContext;
    ArrayList<String> listString;
    private int resourceId;
    final int VIEW_TYPE = 3;
    final int TYPE_1 = 0;
    final int TYPE_2 = 1;
    final int TYPE_3 = 2;
    public MyAdapter1(Context context) {
        // TODO Auto-generated constructor stub
        mContext = context;
        }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 6;
        }
    public int getViewTypeCount() {
        // TODO Auto-generated method stub
        return 3;
        }
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return listString.get(arg0);
      }
    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
        }
    public int getItemViewType(int position) {
        // TODO Auto-generated method stub
        int p = position%6;
        if(p == 0)
        return TYPE_1;
        else if(p < 3)
        return TYPE_2;
        else if(p < 6)
        return TYPE_3;
        else
        return TYPE_1;
       }

    public View getView(int position, View converView, ViewGroup parent) {
        ViewHolder1 holder1 = null;
        ViewHolder2 holder2 = null;
        ViewHolder3 holder3 = null;
        int type = getItemViewType(position);
        if (converView ==null){
            switch(type){
                case TYPE_1:
                    converView = LayoutInflater.from(mContext).inflate(R.layout.activity_pyq1, parent, false);
                    holder1 = new ViewHolder1();
                    holder1.titleview = (TextView) converView.findViewById(R.id.textview);
                    holder1.image = (ImageView) converView.findViewById(R.id.imageView);
                    holder1.imageButton = (ImageButton) converView.findViewById(R.id.imagebutton);

                    converView.setTag(holder1);
                    break;
                case TYPE_2:
                    converView = LayoutInflater.from(mContext).inflate(R.layout.activity_lxr, parent, false);
                    holder2 = new ViewHolder2();
                    holder2.titleview = (TextView) converView.findViewById(R.id.textview);
                    holder2.image = (ImageView) converView.findViewById(R.id.imageview);

                    converView.setTag(holder2);
                    break;
                case TYPE_3:
                    converView = LayoutInflater.from(mContext).inflate(R.layout.activity_lxr, parent, false);
                    holder3 = new ViewHolder3();
                    holder3.titleview = (TextView) converView.findViewById(R.id.textview);
                    holder3.image = (ImageView) converView.findViewById(R.id.imageview);

                    converView.setTag(holder3);
                    break;

            }


        }
        else{
            switch(type){
                case TYPE_1:
                    holder1 = (ViewHolder1) converView.getTag();
                    break;
                case TYPE_2:
                    holder2 = (ViewHolder2) converView.getTag();
                    break;
                case TYPE_3:
                    holder3 = (ViewHolder3) converView.getTag();
                    break;

            }

        }
        switch(type){
            case TYPE_1:
                holder1.titleview.setText("123");
                holder1.image.setBackgroundResource(R.drawable.huiyuan2);
                holder1.imageButton.setBackgroundResource(R.drawable.huiyuan3);
                break;
            case TYPE_2:
                holder2.titleview.setText("123");
                holder2.image.setImageResource(R.drawable.huiyuan3);
                break;
            case TYPE_3:
                holder3.titleview.setText("123");
                holder3.image.setImageResource(R.drawable.huiyuan5);
                break;
        }

        return converView;
    }
    public class ViewHolder1{
        public TextView titleview;
        public ImageView image;
        public ImageButton imageButton;
    }
    public class ViewHolder2{
        public TextView titleview;
        public ImageView image;
    }
    public class ViewHolder3{
        public TextView titleview;
        public ImageView image;
    }
}
