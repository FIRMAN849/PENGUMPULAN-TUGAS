
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
public class Kelulusan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // buat scanner
        Scanner inp = new Scanner(System.in);
        
        //Ambil nama
        System.out.print("Masukkan nama anda = ");
        String Nama = inp.nextLine();
        
        //Ambil NIM
        System.out.print("Masukkan NIM = ");
        String nim = inp.next();
        
        //Ambil Nilai
        System.out.print("Masukkan Nilai = ");
        int nilai = inp.nextInt();
        
        //print
        if(nilai > 70){
            System.out.println("Selamat Anda Lulus");
        }else{
            System.out.println("Anda Tidak Lulus");
        }
                
    }
    
}
