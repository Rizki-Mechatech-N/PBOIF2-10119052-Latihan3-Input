package pboif2.pkg10119052.latihan3.input;

import java.util.Scanner;

/**
 *
 * Nama : Rizki Dwi Nugraha
 * Kelas : IF-2
 * NIM : 10119052
 * 
 */
public class PBOIF210119052Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
    
}
