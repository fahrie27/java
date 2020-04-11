/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.UTS;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Fahrie
 */
@Entity
@Table (name =  " inventory ")
public class inventory {
    @Id
    @Column ( name = " id_barang ")
    private String id_barang;
    
    @Column ( name = " nama_barang ")
   private String nama_barang;
    
    @Column ( name = " jenis_barang ")
   private String jenis_barang;
    
    @Column ( name = " harga ")
   private String harga;
    
    @Column ( name = " jumlah ")
   private String jumlah;

    public inventory() {
    }
    
     public inventory(String id_barang, String nama_barang, String jenis_barang, String harga, String jumlah) {
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.jenis_barang = jenis_barang;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    public String getId_barang() {
        return id_barang;
    }

    public void setId_barang(String id_barang) {
        this.id_barang = id_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getJenis_barang() {
        return jenis_barang;
    }

    public void setJenis_barang(String jenis_barang) {
        this.jenis_barang = jenis_barang;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }
   
}
