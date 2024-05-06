/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author 2201010614
 * tgl:2024-04-06
 */
public class Pertemuan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        induk a2 = new induk("ss",8);
        turunan a1 = new turunan();
        
        
        System.out.println("1. isi dari Variabel nama"+a1.getNAMA());
        a1.setNAMA("Magdalena Indri");
        System.out.println("2. isi dari Variabel nama"+a1.getNAMA());
        
        
        a1.setNAMA();
        System.out.println("3. isi dari Variabel nama"+a1.getNAMA());
        
        a2.cetakNAMA();
        a1.cetakNAMA();
        
        
    }
    
}
