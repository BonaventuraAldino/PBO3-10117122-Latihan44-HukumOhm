/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan44.hukumohm;

/**
 *
 * @author Aldy Senda
 * Nama  : Bonaventura Aldino Senda Seni
 * NIM   : 10117122
 * Kelas : IF-3
 * Deskripsi Program : Menghitung kuat arus dan menampilkan hasilnya.
 * 
 */
public class PBO310117122Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai object = new Baterai();
       System.out.println("=====Hukum Ohm=====");
       System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar"
                + "akan berbanding lurus dengan beda potensial "
                + "pada ujung ujung kawat penghantar tersebut "
                + "asalkan suhu kawat dijaga konstan.");
        
        System.out.println("Kuat Arus : " + object.getKuatArus() + " ampere");
        System.out.println("Hambatan  : " + object.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : "+object.hitungTegangan() + " volt");
        System.out.println();
        System.out.println("(Developed By : Bonaventura Aldino Senda Seni)");
    }
}
