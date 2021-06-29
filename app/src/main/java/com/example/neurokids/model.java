package com.example.neurokids;

public class model {

    private int image;
    private String judul;
    private String penjelasan;
    private String penjelasanLengkap;

    public model(int image, String judul, String penjelasan,String penjelasanLengkap) {
        this.image = image;
        this.judul = judul;
        this.penjelasanLengkap = penjelasanLengkap;
        this.penjelasan = penjelasan;

    }



    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenjelasan() {
        return penjelasan;
    }

    public void setPenjelasan(String penjelasan) {
        this.penjelasan = penjelasan;
    }

    public String getPenjelasanLengkap() {
        return penjelasanLengkap;
    }

    public void setPenjelasanLengkap(String penjelasanLengkap) {
        this.penjelasanLengkap = penjelasanLengkap;
    }
}
