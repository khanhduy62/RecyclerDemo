package com.example.hp.recycleview_demo;

/**
 * Created by hp on 27/05/2017.
 */

public class Person {
    private int hinh;
    private String ten;
    private boolean isCheck;

    public Person(int hinh, String ten, boolean isCheck) {
        this.hinh = hinh;
        this.ten = ten;
        this.isCheck = isCheck;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }
}
