
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
public class Bilangan {
    
    public static void main(String[] args) {
     
        int input;
        boolean isTrue = false;
        Scanner user = new Scanner(System.in);
        
        System.out.println("Masukkan Angka ");
        input = user.nextInt();
        if(input%2==0){
            System.out.println(input + " Adalah bilangan genap");
        }else{
            System.out.println(input + " Adalah bilangan ganjil");
        }
    }
}
