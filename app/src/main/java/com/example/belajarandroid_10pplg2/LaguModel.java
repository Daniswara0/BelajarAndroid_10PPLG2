package com.example.belajarandroid_10pplg2;

public class LaguModel {

    String judulLagu;
    String namaPenyanyi;
    String durasiLagu;
    int imageLagu;
    String detailLagu;
    String linkLagu;

    public LaguModel(String judulLagu, String namaPenyanyi, String durasiLagu, int imageLagu, String detailLagu){
        this.judulLagu = judulLagu;
        this.namaPenyanyi = namaPenyanyi;
        this.durasiLagu = durasiLagu;
        this.imageLagu = imageLagu;
        this.detailLagu = detailLagu;
        this.linkLagu = linkLagu;
    }

    public String getJudulLagu() {
        return judulLagu;
    }

    public String getNamaPenyanyi() {
        return namaPenyanyi;
    }

    public String getDurasiLagu() {
        return durasiLagu;
    }

    public int getImageLagu() {
        return imageLagu;
    }

    public String getDetailLagu() {
        return detailLagu;
    }

    public String getLinkLagu() {
        return linkLagu;
    }
}
