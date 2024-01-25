package com.example.nesnetabanliprogramlama.siniflar;

public class CompositionKisiler {

    private String isim;
    private int tel;
    private CompositionAdresler adresler;

    public CompositionKisiler() {
    }

    public CompositionKisiler(String isim, int tel, CompositionAdresler adresler) {
        this.isim = isim;
        this.tel = tel;
        this.adresler = adresler;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public CompositionAdresler getAdresler() {
        return adresler;
    }

    public void setAdresler(CompositionAdresler adresler) {
        this.adresler = adresler;
    }
}
