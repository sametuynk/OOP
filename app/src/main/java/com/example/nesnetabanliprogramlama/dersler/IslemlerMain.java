package com.example.nesnetabanliprogramlama.dersler;

import com.example.nesnetabanliprogramlama.dersler.Islemler;

public class IslemlerMain {


    public static void main(String[] args) {
        Islemler i=new Islemler();

        double sonuc=i.ortalamaHesapla(54.6,54.7,69,35.25,36.48,45,44.3);

        System.out.println("Ortalama:"+sonuc);
    }
}
