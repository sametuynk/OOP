package com.example.nesnetabanliprogramlama.siniflar;

public class MatematikOverloading {


    //Methodların aşırı yüklenmesi
    public void topla(int s1,int s2){
        System.out.println("Toplam: "+s1+s2);
    }
    public void topla(int s1,double s2,int s3){
        System.out.println("Toplam: "+s1+s2+s3);
    }
    public void topla(float s1,int s2,String isim){
        System.out.println("Toplam: "+s1+" : "+isim);
    }
    public void topla(double s1,int s2){
        System.out.println("Toplam: "+s1+s2);
    }

}
