package com.company;

import Sınıflar.Arabalar;
import Sınıflar.VeriTabaniIslemleri;
public class Main {

    public static void main(String[] args) {
        VeriTabaniIslemleri veritabanı=new VeriTabaniIslemleri();
        veritabanı.Baglan();
       Arabalar araba= veritabanı.VerileriGetirAraba(1);

    }
}
