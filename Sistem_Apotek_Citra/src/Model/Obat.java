/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author praktek
 */
public class Obat {
    private Integer kodekategori;
    private String namakategori;
    private String kodebarang;
    private String namabarang;
    private String kodepemasok;
    private String namapemasok;
    private String satuan;
    private Integer harga;
    private Integer stok;

    public Integer getKodekategori() {
        return kodekategori;
    }

    public void setKodekategori(Integer kodekategori) {
        this.kodekategori = kodekategori;
    }

    public String getNamakategori() {
        return namakategori;
    }

    public void setNamakategori(String namakategori) {
        this.namakategori = namakategori;
    }

    public String getKodebarang() {
        return kodebarang;
    }

    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }
    
    public String getKodepemasok() {
        return kodepemasok;
    }

    public void setKodepemasok(String kodepemasok) {
        this.kodepemasok = kodepemasok;
    }

    public String getNamapemasok() {
        return namapemasok;
    }

    public void setNamapemasok(String namapemasok) {
        this.namapemasok = namapemasok;
    }    

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }
    
}
