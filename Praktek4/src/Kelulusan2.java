
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
public class Kelulusan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        
        //input nama
        System.out.print("Masukkan Nama   :");
        String nama = inp.next();
        //input nama
        System.out.print("Masukkan jenis kelamin   :");
        String jenis_kelamin = inp.next();
        //input nama
        System.out.print("Masukkan Tinggi Badan   :");
        int tinggi_badan = inp.nextInt();
        
        if("LAKILAKI".equals(jenis_kelamin)){
            if(tinggi_badan >= 171 && tinggi_badan <=230){
                System.out.println("Anda Lulus");
            }else{
                System.out.println("Anda Gagal");
            }
    }else if("PEREMPUAN".equals(jenis_kelamin)){
        if(tinggi_badan >= 161 && tinggi_badan <= 210){
            System.out.println("Anda Lulus");
        }else{
            System.out.println("Anda GAGAL");
        }
    }
        
        
        
    }
    
}
