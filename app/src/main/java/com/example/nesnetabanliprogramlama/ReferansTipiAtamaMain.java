package com.example.nesnetabanliprogramlama;

public class ReferansTipiAtamaMain {
    public static void main(String[] args) {

        Ogrenciler ogr1=new Ogrenciler();
        ogr1.isim="Ahmet";
        System.out.println(ogr1.isim);

        Ogrenciler ogr2=ogr1; //ogr1 ile ogr2 aynı aslında adresleri paylaşıldı.
                             // ikiside aynı adresi işaret ettiğinden isim değişikliği gerçekleşti.
                            //kopyalanmadı adresteki yerleri değişti

        ogr2.isim="Zeynep";
        System.out.println(ogr1.isim);

        System.out.println();

        System.out.println(ogr1.hashCode()); //hafızadaki adresin yeri
        System.out.println(ogr2.hashCode());


    }
}
