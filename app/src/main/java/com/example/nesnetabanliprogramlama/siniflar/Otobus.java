package com.example.nesnetabanliprogramlama.siniflar;

public class Otobus {
    public int kapasite;
    public int mevcutYolcu;
    public String nereden;
    public String nereye;

    public void bilgiAl(){
        System.out.println("Kapasite     :"+kapasite);
        System.out.println("Mevcut Yolcu :"+mevcutYolcu);
        System.out.println("Nereden      :"+nereden);
        System.out.println("Nereye       :"+nereye);
    }

    public void yolcuAl(int yolcuMiktari){
        mevcutYolcu=mevcutYolcu+yolcuMiktari;
        if (mevcutYolcu>kapasite||mevcutYolcu==kapasite){
            System.out.println("Otobüs dolu");
        }else{
            System.out.println("Yolcu sayısı :"+mevcutYolcu);
        }
    }


    public void yolcuIndir(int mevcutMiktari){
        mevcutYolcu=mevcutYolcu-mevcutMiktari;
        if (mevcutYolcu==0){
            System.out.println("Otobüs boş");
        }else {
            System.out.println("Yolcu sayısı :"+mevcutYolcu);
        }
    }




}
