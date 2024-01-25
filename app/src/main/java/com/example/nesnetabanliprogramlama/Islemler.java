package com.example.nesnetabanliprogramlama;

public class Islemler {

    public double ortalamaHesapla(double...sayilar){ //dizi görevi ve her zaman sona yazılır.
                                                    //public double ortalamaHesapla(int sayi1,double...sayilar)
        double toplam=0;

        for (double s:sayilar){
            toplam=toplam+s;
        }
        return toplam/sayilar.length;
    }



}
