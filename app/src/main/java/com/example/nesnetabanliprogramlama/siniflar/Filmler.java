package com.example.nesnetabanliprogramlama.siniflar;

public class Filmler {

    private int film_id;
    private String film_ad;
    private  int film_yil;
    private Kategoeriler kategoeriler;
    private YonetmenlerTablosu yonetmenler;

    public Filmler() {
    }

    public Filmler(int film_id, String film_ad, int film_yil, Kategoeriler kategoeriler, YonetmenlerTablosu yonetmenler) {
        this.film_id = film_id;
        this.film_ad = film_ad;
        this.film_yil = film_yil;
        this.kategoeriler = kategoeriler;
        this.yonetmenler = yonetmenler;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getFilm_ad() {
        return film_ad;
    }

    public void setFilm_ad(String film_ad) {
        this.film_ad = film_ad;
    }

    public int getFilm_yil() {
        return film_yil;
    }

    public void setFilm_yil(int film_yil) {
        this.film_yil = film_yil;
    }

    public Kategoeriler getKategoeriler() {
        return kategoeriler;
    }

    public void setKategoeriler(Kategoeriler kategoeriler) {
        this.kategoeriler = kategoeriler;
    }

    public YonetmenlerTablosu getYonetmenler() {
        return yonetmenler;
    }

    public void setYonetmenler(YonetmenlerTablosu yonetmenler) {
        this.yonetmenler = yonetmenler;
    }
}
