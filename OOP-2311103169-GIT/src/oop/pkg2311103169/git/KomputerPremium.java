/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.pkg2311103169.git;

/**
 *
 * @author MSI
 */
public class KomputerPremium extends Komputer {
    protected boolean inpoPremium;

    public KomputerPremium(int billing, String namaWarnet, float hargaPerJam, boolean inpoPremium) {
        super(billing, namaWarnet, hargaPerJam);
        this.inpoPremium = inpoPremium;
    }

    @Override
    public String Inpo() {
        String info = super.Inpo() + "\nStatus          : " + (inpoPremium ? "Ruangan Privat" : "Ruangan Standar");
        if (inpoPremium) {
            info += "\nFasilitas Ruang Privat:\n" + "- AC pribadi sob, yakali gerah\n" + "- Kursi Gaming kayak yutuber\n" + 
                    "- Komputer speek dewa\n" + "- Internet gabakal lag, suer dah";
        } else {
            info += "\nFasilitas Ruang Standar:\n" + "- Ruangan gerah + sumuk\n" + "- Kursi Kondangan\n" +
                    "- Komputer spek fotokopian\n" + "- Berdoa supaya internet mu lancar";
        }
        return info;
    }
}
