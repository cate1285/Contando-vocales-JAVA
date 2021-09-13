/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos;

import java.util.Scanner;
import java.text.Normalizer;
/**
 *
 * @author robin
 */
public class reto1 {
    public static String remove1(String input) {
        String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
        // Cadena de caracteres ASCII que reemplazarán los originales.
        String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
        String output = input;
        for (int p=0; p<original.length(); p++) {
            // Reemplazamos los caracteres especiales.
            output = output.replace(original.charAt(p), ascii.charAt(p));
        }//for i
        return output;
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println();
        String palabra = sc.nextLine();
        palabra = palabra.toLowerCase();
        palabra = remove1(palabra);
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0; 
        
        for(int n=0; n <= palabra.length()-1;n++){            
            switch (palabra.charAt(n)) {
                case 'a':
                    a+=1;
                    break;
                case 'e':
                    e+=1;
                    break;                    
                case 'i':
                    i+=1;
                    break;                    
                case 'o':
                    o+=1;
                    break;                    
                case 'u':
                    u+=1;
                    break;
            }
        }
        System.out.println("La vocal a aparece "+ a +" veces" );
        System.out.println("La vocal e aparece "+ e +" veces" );
        System.out.println("La vocal i aparece "+ i +" veces" );
        System.out.println("La vocal o aparece "+ o +" veces" );
        System.out.println("La vocal u aparece "+ u +" veces" );
        // TODO code application logic here
    }
    
}
