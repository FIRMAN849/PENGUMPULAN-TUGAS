/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

import java.util.Scanner;

/**
 *
 * @author LOL
 */
public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // kamus
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1,s2,r = 0;
        
        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran(); 
        
        //program
        //panggil methode
        mainMenu();
        
        //kondisioanal untuk pilihan menu yang dimasukkan
        switch(pilihan){
            case '1':{
                System.out.print("Masukkan Panjang Persegi :");
                s1 = scanner.nextInt();
                System.out.print("Masukkan Lebar Persegi :");
                s2 = scanner.nextInt();
                System.out.println("Luas Persegi panjang :" + opersegi.luas(s1, s2));
                System.out.println("Keliling Persegi Panjang :" + opersegi.keliling(s1, s2));
                break;
            }
            case '2':{
                System.out.print("Masukkan alas Segitiga Siku :");
                s1 = scanner.nextInt();
                System.out.print("Masukkan tinggi Segitiga Siku :");
                s2 = scanner.nextInt();
                System.out.println("Luas Segitiga Siku :" + osegitiga.luas(s1, s2));
                System.out.println("Keliling Segitiga Siku :" + osegitiga.keliling(s1, s2));
                break;
            }
            case '3':{
                System.out.print("Masukkan alas Segitiga Siku :");
                s1 = scanner.nextInt();
                System.out.print("Masukkan tinggi Segitiga Siku :");
                s2 = scanner.nextInt();
                System.out.println("Luas Segitiga Siku :" + olingkaran.luas(r));
                System.out.println("Keliling Segitiga Siku :" + olingkaran.keliling(r));
                break;
            }
            default:{
                System.out.println("tidak ada pilihan");
                break;  
            }
        }
    }
    
    private static void mainMenu(){
        //pilihan menu
        System.out.println("=============");
        System.out.println("Hitung luas dan keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan Menu :");
        pilihan = scanner.next().charAt(0);
    }
    
    
    
}
