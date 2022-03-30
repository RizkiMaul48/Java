package com.latihan;

public class Main {

    public static void main(String[] args) {

        subclass output = new subclass();
        output.show();

        System.out.println("+=======================================+");
        System.out.println("  Jenis DVD   : " + output.jenis);
        System.out.println("  Harga DVD   : " + output.getHarga());
        System.out.println("  Jumlah Sewa : " + output.jml_sewa);
        System.out.println("+=======================================+");
        System.out.println("  Harga Sewa  : " + output.getTotal());
        System.out.println("  Diskon      : " + output.getDiskon());
        System.out.println("  Total Bayar : " + output.getTot_bayar());


    }
}
