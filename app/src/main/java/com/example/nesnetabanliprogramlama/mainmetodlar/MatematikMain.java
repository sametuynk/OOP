package com.example.nesnetabanliprogramlama.mainmetodlar;

import com.example.nesnetabanliprogramlama.siniflar.Matematik;

public class MatematikMain {
    public static void main(String[] args) {
        Matematik m=new Matematik();

        m.carpma(10,2);



        int gelenDeger= m.topla(10,15,25);
        System.out.println("Toplam: "+gelenDeger);

    }
}
