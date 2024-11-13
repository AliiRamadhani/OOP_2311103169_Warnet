/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.pkg2311103169.git;

/**
 *
 * @author MSI
 */
public class KomputerVIP extends Komputer {
    protected boolean vipCard;

    public KomputerVIP(int billing, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(billing, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    @Override
    public String Inpo() {
        String info = super.Inpo() + "\nStatus          : " + (vipCard ? "Member VIP" : "Non VIP");
        if (vipCard) {
            info += "\nBenefit Member VIP:\n" + "- Diskon 10% kalo mesen billing 3 jam atau lebih\n" +
                    "- Gratis minuman kalo billing 3 jam bermain\n" + "- Bisa Booking lewat WA";
        }
        return info;
    }
}
