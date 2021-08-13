package com.e.a10118317_uas_wisatabandungraya;
// Rabu, 11 Agustus 2021, 10118317, Muhammad Fikri Juan R, IF8
public class ModelWisata {
    private String nama;
    private String deskripsi;
    private String key;


    public ModelWisata(){

    }

    public ModelWisata(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
