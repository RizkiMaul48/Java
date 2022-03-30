package com.latihan;

import java.util.*;

public class subclass extends superclass {
    Scanner userInput = new Scanner(System.in);

    int harga, total, tot_bayar, diskon, kategori, jml_sewa;

    public void show(){

        System.out.println("+=======================================+");
        System.out.println("|               Sewa DVD                |");
        System.out.println("+=======================================+");
        System.out.println("| [1] DVD FILM ANAK ANAK                |");
        System.out.println("| [2] DVD FILM ANIMASI                  |");
        System.out.println("| [3] DVD FILM DUNIA BINATANG           |");
        System.out.println("+=======================================+");
        System.out.println("| Pilih Jenis DVD [1] [2] [3]           |");
        System.out.println("+=======================================+");
        System.out.print("  Kategori DVD : ");
        kategori = userInput.nextInt();
        System.out.print("  Jumlah Sewa  : ");
        jml_sewa = userInput.nextInt();

        super.total = total;
        super.jml_sewa = jml_sewa;
        super.kategori = kategori;
        super.hitung();

    }
}
