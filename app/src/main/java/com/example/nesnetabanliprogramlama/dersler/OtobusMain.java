package com.example.nesnetabanliprogramlama.dersler;

import com.example.nesnetabanliprogramlama.dersler.Otobus;

public class OtobusMain {
    public static void main(String[] args) {

        Otobus kamilKoc=new Otobus();
        System.out.println("Kamilkoç");
        kamilKoc.kapasite=100;
        kamilKoc.mevcutYolcu=70;
        kamilKoc.nereden="ADANA";
        kamilKoc.nereye="BURSA";

        kamilKoc.bilgiAl();
        System.out.println();

        System.out.println("Metro");
        Otobus metro=new Otobus();
        metro.kapasite=80;
        metro.mevcutYolcu=40;
        metro.nereden="RİZE";
        metro.nereye="ORDU";
        metro.bilgiAl();

        kamilKoc.yolcuAl(30);
        kamilKoc.yolcuIndir(25);

    }
}
