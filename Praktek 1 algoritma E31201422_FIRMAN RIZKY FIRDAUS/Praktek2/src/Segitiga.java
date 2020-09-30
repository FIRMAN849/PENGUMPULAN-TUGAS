
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LOL
 */
public class Segitiga {
    //memanggil buffered reader dari libraris
    public static BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("Masukkan Alas : ");
        String input = st.readLine();
        int a = Integer.parseInt(input);
        System.out.println("Masukkan Tinggi : ");
        input = st.readLine();
        int t = Integer.parseInt(input);
 
        //rumus luas segitiga
        System.out.println("Luas"+ " = " +(0.5 * a * t));
        
    }

    
    }



