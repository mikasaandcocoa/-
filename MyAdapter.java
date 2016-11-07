package com.example.administrator.pyq;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/3 0003.
 */
public class MyAdapter extends ArrayAdapter<Lxr> {

    private List<Lxr> list;
    private Context mContext;
    private int resourceId;
    public MyAdapter(Context mContext,int textViewResourceId,List<Lxr> list){
        super(mContext,textViewResourceId,list);
        resourceId = textViewResourceId;

    }
    public View getView(int i,View converView,ViewGroup parent) {
        Lxr lxr = getItem(i);
        ViewHolder holder;
        if (converView ==null){
            converView = LayoutInflater.from(getContext()).inflate(resourceId,null);
            holder = new ViewHolder();
            holder.titleview = (TextView) converView.findViewById(R.id.textview);
            holder.image = (ImageView) converView.findViewById(R.id.imageview);
            converView.setTag(holder);

        }
        else{
            holder = (ViewHolder) converView.getTag();

        }

        holder.titleview.setText(lxr.getTextView());
        holder.image.setImageResource(lxr.getimageId());
        return converView;
    }
    public class ViewHolder{
        public TextView titleview;
        public ImageView image;
    }

}
