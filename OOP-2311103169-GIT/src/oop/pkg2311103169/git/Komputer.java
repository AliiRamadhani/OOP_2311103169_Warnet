/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.pkg2311103169.git;

/**
 *
 * @author MSI
 */
public class Komputer {
    protected int billing;
    protected String namaWarnet;
    protected float hargaPerJam;

    public Komputer(int billing, String namaWarnet, float hargaPerJam) {
        this.billing = billing;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }

    public String Inpo() {
        float totalHarga = billing * hargaPerJam;
        return "INFORMASI KOMPUTER:\n" + "Nama Warnet     : " + namaWarnet + "\n" + "Harga Per Jam   : Rp" + hargaPerJam + "\n" +
               "Billing (jam)   : " + billing + "\n" + "Total Harga     : Rp" + totalHarga;
    }
}
