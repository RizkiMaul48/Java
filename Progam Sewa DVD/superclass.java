package com.latihan;

public class superclass {
    public int kategori;
    public int jml_sewa;
    public int tot_bayar;
    public int total;
    public int diskon;
    public String jenis;
    public int harga;

//            1.DVD FILM ANAK2 -- biaya : 10.000
//            2.DVD FILM ANIMASI -- biaya sewa : 15.000
//            3.DVD FILM DUNIA BINATANG -- biaya sewa : 12.000

        public void hitung(){

            if (kategori == 1){
                harga = 10000;
                jenis = "Anak - Anak";

                total = harga * jml_sewa;
                tot_bayar = total - diskon;

                if (jml_sewa >= 3){
                    diskon = 5000;
                    tot_bayar = total - diskon;
                }
            }

            else if (kategori == 2){
                harga = 15000;
                jenis = "Animasi";

                total = harga * jml_sewa;
                tot_bayar = total - diskon;

                if (jml_sewa >= 3){
                    diskon = 5000;
                    tot_bayar = total - diskon;
                }
            }

            else if (kategori == 3){
                harga = 12000;
                jenis = "Dunia Binatang";

                total = harga * jml_sewa;
                tot_bayar = total - diskon;

                if (jml_sewa >= 3){
                    diskon = 5000;
                    tot_bayar = total - diskon;
                }
            }
        }

        public int getHarga() { return harga; }

        public int getTotal(){
            return total;
        }

        public int getTot_bayar(){ return tot_bayar; }

        public int getJml_sewa(){
            return jml_sewa;
        }

        public int getDiskon(){
            return diskon;
        }

}
