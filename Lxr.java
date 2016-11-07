package com.example.administrator.pyq;

/**
 * Created by Administrator on 2016/11/3 0003.
 */
public class Lxr {
    private int imageId;
    private String textView;
    private int imageButtonId;
    public Lxr(int imageId,String textView){
        this.imageId = imageId;
        this.textView = textView;

    }
    public Lxr(int imageId,String textView,int imageButtonId){
        this.imageId = imageId;
        this.textView = textView;
        this.imageButtonId = imageButtonId;
    }
    public int getimageId(){
        return imageId;
    }
    public String getTextView(){
        return textView;
    }
    public int getImageButtonId(){
        return  imageButtonId;
    }

}
