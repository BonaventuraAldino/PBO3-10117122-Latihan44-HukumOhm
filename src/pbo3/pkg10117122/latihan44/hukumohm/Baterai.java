/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan44.hukumohm;

/**
 *
 * @author Aldy Senda
 */
public class Baterai {
    private float kuatArus = 3, hambatan = 12;
    
    public Baterai (){
        
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
    
}
