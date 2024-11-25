package com.example.th;

import android.media.Image;

public class Book {
    private Image img;
    private String title;
    private String mota;

    public Book(Image img, String title, String mota) {
        this.img = img;
        this.title = title;
        this.mota = mota;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
