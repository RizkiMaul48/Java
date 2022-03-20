package com.belajar7;

public class Data {
    String pilihan;
    int a, b;
    int hasil;

    Data(int a, int b, String pilihan){
        this.a = a;
        this.b = b;
        this.pilihan = pilihan;
    }

    public int gethasil(){
        if (pilihan.equalsIgnoreCase("+")){
            hasil = a + b;
            return hasil;
        } else if (pilihan.equalsIgnoreCase("-")){
            hasil = a - b;
            return hasil;
        } else if (pilihan.equalsIgnoreCase("*")){
            hasil = a * b;
            return hasil;
        } else if (pilihan.equalsIgnoreCase("/")){
            hasil = a / b;
            return hasil;
        }

        return hasil;
    }

    void show(){
        System.out.println("+--------------------------------------+");
        System.out.println(" Hasil           : " + this.hasil);
        System.out.println("+--------------------------------------+");
    }


}
