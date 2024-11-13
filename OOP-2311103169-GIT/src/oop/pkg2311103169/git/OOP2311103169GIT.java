/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.pkg2311103169.git;

import javax.swing.JOptionPane;

/**
 *
 * @author MSI
 */
public class OOP2311103169GIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String username = JOptionPane.showInputDialog("Masukin usernamenya buru:");

        String password = JOptionPane.showInputDialog("Masukin Password LUH dulu:");

        String[] options = {"Biasa", "Premium", "VIP"};
        int userType = JOptionPane.showOptionDialog(null, "Pilih Kelas LU :", "Kelas LU",
        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        int billing = Integer.parseInt(JOptionPane.showInputDialog("Masukin billingnya sob :"));

        String namaWarnet = "Satria Net Kebondalem";

        float hargaPerJam;
        switch (userType) {
            case 0:
                hargaPerJam = 3000;
                Komputer komputerBiasa = new Komputer(billing, namaWarnet, hargaPerJam);
                JOptionPane.showMessageDialog(null, "Username LUH: " + username + "\n" + "Password LUH: " 
                        + password + "\n" + komputerBiasa.Inpo(), "Info LU", JOptionPane.INFORMATION_MESSAGE);
                break;
                
            case 1:
                hargaPerJam = 8000;
                KomputerPremium komputerPremium = new KomputerPremium(billing, namaWarnet, hargaPerJam, true);
                JOptionPane.showMessageDialog(null, "Username LUH: " + username + "\n" + "Password LUH: " 
                        + password + "\n" + komputerPremium.Inpo(), "Info LU", JOptionPane.INFORMATION_MESSAGE);
                break;
                
            case 2:
                hargaPerJam = 5000;
                KomputerVIP komputerVIP = new KomputerVIP(billing, namaWarnet, hargaPerJam, true);
                JOptionPane.showMessageDialog(null, "Username LUH: " + username + "\n" + "Password LUH: " 
                        + password + "\n" + komputerVIP.Inpo(), "Info LU", JOptionPane.INFORMATION_MESSAGE);
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Kelas Tidak Valdi.");
                break;
        }
    }
}
