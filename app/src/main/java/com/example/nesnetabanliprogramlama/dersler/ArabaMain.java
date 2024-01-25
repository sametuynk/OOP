package com.example.nesnetabanliprogramlama.dersler;

import com.example.nesnetabanliprogramlama.dersler.Araba;

public class ArabaMain {

    public static void main(String[] args) {
        //Normal değişken
        int yas=30;
        //nesne oluşturma
        Araba bmw=new Araba();

        bmw.renk="kırmnızı";
        bmw.hiz=250;
        bmw.uzunluk=3.20;
        bmw.calisiyorMu=true;

        Araba sahin=new Araba();

        sahin.renk="kırmnızı";
        sahin.hiz=250;
        sahin.uzunluk=3.20;
        sahin.calisiyorMu=true;

        System.out.println("Bmw Hiz: "+bmw.hiz);
        System.out.println("Şahin Hiz: "+sahin.hiz);
    }
}
