package com.example.bai2_de2;

public class Student  {
    int img;
    String id;
    String ten;
    String gender;
    String dob;

    public Student(int img, String id, String ten, String gender, String dob) {
        this.img = img;
        this.id = id;
        this.ten = ten;
        this.gender = gender;
        this.dob = dob;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
