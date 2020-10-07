
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LOL
 */
public class KonversiNilai {
    
    public static void main(String[] args){
        
        Scanner inp = new Scanner(System.in);
        
        //Ambil Angka
        System.out.print("Masukkan Huruf = ");
        String angka = inp.next();
        
        
         //pernyataan kondisi inputan nilai
        switch (angka) {
            case "A":
                System.out.println("4");
                break;
            case "B":
                System.out.println("3");
                break;
            case "C":
                System.out.println("2");
                break;
            case "D":
                System.out.println("1");
                break;
            case "E":
                System.out.println("0");
                break;
            default:
                break;
        }
    }
    
}
