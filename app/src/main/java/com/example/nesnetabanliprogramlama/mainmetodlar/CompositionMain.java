package com.example.nesnetabanliprogramlama.mainmetodlar;

import com.example.nesnetabanliprogramlama.siniflar.CompositionAdresler;
import com.example.nesnetabanliprogramlama.siniflar.CompositionKisiler;

public class CompositionMain {
    public static void main(String[] args) {

        CompositionAdresler adres = new CompositionAdresler("Adana","kozan");

        CompositionKisiler kisi=new CompositionKisiler("Samet",542,adres);

        System.out.println("Kişi ad  :"+kisi.getIsim());
        System.out.println("Kişi tel :"+kisi.getTel());
        System.out.println("Kişi il  :"+kisi.getAdresler().getIl());
        System.out.println("Kişi ilçe:"+kisi.getAdresler().getIlce());
    }
}
