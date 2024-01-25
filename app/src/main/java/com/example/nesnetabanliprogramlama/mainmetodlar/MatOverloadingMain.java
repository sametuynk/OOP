package com.example.nesnetabanliprogramlama.mainmetodlar;

import com.example.nesnetabanliprogramlama.siniflar.MatematikOverloading;

public class MatOverloadingMain {
    public static void main(String[] args) {
        MatematikOverloading mo=new MatematikOverloading();

        mo.topla(15.4,1);
        mo.topla(16,69,"Mehmet");
        mo.topla(56,89);
        mo.topla(15,14.49,89);
    }
}
