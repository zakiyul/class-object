package com.company;

import java.util.Scanner;

public class HitungLuas {
    Scanner input = new Scanner(System.in);

    public void hitungLuas(){
        System.out.println("== Program hitung luas Segitiga ==");
        System.out.print("Input alas = ");
        double luas = input.nextDouble();
        System.out.print("Input tinggi = ");
        double tinggi = input.nextDouble();
        double hasil = luas * tinggi;
        System.out.println("Luas = "+hasil);
    }
}
