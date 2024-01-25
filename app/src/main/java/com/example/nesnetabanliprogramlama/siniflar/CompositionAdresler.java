package com.example.nesnetabanliprogramlama.siniflar;

public class CompositionAdresler {

    private String il;
    private String ilce;

    public CompositionAdresler() {
    }

    public CompositionAdresler(String il, String ilce) {
        this.il = il;
        this.ilce = ilce;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }
}
