/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders_13;

import java.util.Scanner;

/**
 *
 * @author Barış Adsız
 */
public class Ders_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.print("Vize notunuzu giriniz: ");
        int vizeNotu = input.nextInt();
        
        System.out.print("Final notunuzu giriniz: ");
        int finalNotu = input.nextInt();
        
        double ort = vizeNotu*0.4 + finalNotu*0.6;
        
        if(ort > 50){
            System.out.println("Geçtiniz!");
            System.out.println("Ortalamanız: " + ort);
        }
        else{
            System.out.println("Kaldınız!");
            System.out.println("Ortalamanız: " + ort);
        }
            
    }
    
}
