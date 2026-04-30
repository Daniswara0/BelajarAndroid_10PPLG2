package com.example.belajarandroid_10pplg2;

public class SiswaModel {
    String nama;
    String absen;
    String alamat;
    int imageUser;
    String detailInfo;



    public SiswaModel(String nama, String absen, String alamat, int imageUser, String detailInfo) {
        this.nama = nama;
        this.absen = absen;
        this.alamat = alamat;
        this.imageUser = imageUser;
        this.detailInfo = detailInfo;
    }



    public String getNama() {
        return nama;
    }

    public String getAbsen() {
        return absen;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getImageUser() {
        return imageUser;
    }

    public String getDetailInfo() {
        return detailInfo;
    }



    //constructor
}
