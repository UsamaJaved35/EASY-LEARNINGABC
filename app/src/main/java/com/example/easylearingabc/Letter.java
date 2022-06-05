package com.example.easylearingabc;
public class Letter {
    private int imgId;
    private String alphabet;

    public Letter(int imgId, String alphabet) {
        this.imgId = imgId;
        this.alphabet = alphabet;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }
}