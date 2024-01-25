package com.example.nesnetabanliprogramlama.mainmetodlar;

import com.example.nesnetabanliprogramlama.siniflar.Filmler;
import com.example.nesnetabanliprogramlama.siniflar.Kategoeriler;
import com.example.nesnetabanliprogramlama.siniflar.YonetmenlerTablosu;

public class FilmlerMain {
    public static void main(String[] args) {

        Kategoeriler kategoeri=new Kategoeriler(1,"Dram");
        YonetmenlerTablosu yonetmenlerTablosu=new YonetmenlerTablosu(1,"Nuri Bilge Ceylan");
        Filmler film=new Filmler(1,"Django",2018,kategoeri,yonetmenlerTablosu);

        System.out.println("Film İd         :"+film.getFilm_id());
        System.out.println("Film Adı        :"+film.getFilm_ad());
        System.out.println("Film Yıl        :"+film.getFilm_yil());
        System.out.println("Film Yönetmen   :"+film.getYonetmenler().getYonetmen_ad());
        System.out.println("Film Kategori   :"+film.getKategoeriler().getKategori_ad());


    }
}
