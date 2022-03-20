package com.belajar7;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
    Scanner UserInput = new Scanner(System.in);

    String pilihan;
    int a, b;
    int hasil;

        System.out.println("+======================================+");
        System.out.println("|         Kalkulator dengan OOP        |");
        System.out.println("+======================================+");
        System.out.print(" Masukan Nilai A : ");
        a = UserInput.nextInt();
        System.out.println("+======================================+");
        System.out.println("| Pilihan ( + ) ( - ) ( * ) ( / )      |");
        System.out.println("+======================================+");
        System.out.print(" Masukan Pilihan : ");
        pilihan = UserInput.next();
        System.out.print(" Masukan Nilai B : ");
        b = UserInput.nextInt();

        Data perhitungan = new Data(a,b,pilihan);
        perhitungan.gethasil();
        perhitungan.show();




    }
}
