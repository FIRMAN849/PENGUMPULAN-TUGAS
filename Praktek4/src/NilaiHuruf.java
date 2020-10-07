
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
public class NilaiHuruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //buat scanner
        Scanner inp = new Scanner(System.in);
        
        //Ambil Nilai
        System.out.print("Masukkan Nilai = ");
        int nilai = inp.nextInt();
        
        //pernyataan kondisi inputan nilai
        
        if( nilai >= 86){
            System.out.println(" A ");
        }else if(nilai >= 76 && nilai <= 86){
        System.out.println(" B ");
        }else if(nilai >= 66 && nilai <=75){
            System.out.println(" C ");
        }else if(nilai >=56 && nilai <=65){
            System.out.println(" D ");
        }else if(nilai >= 0 && nilai <= 55 ){
            System.out.println(" E ");
        }else if(nilai < 0){
            System.out.println(" Error ");
        }else if(nilai > 100){
            System.out.println(" Error ");
        }
    }
    
}
