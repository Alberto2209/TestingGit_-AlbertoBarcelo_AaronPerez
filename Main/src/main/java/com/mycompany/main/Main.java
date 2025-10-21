/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Main {

    public static void main(String[] args) {
        int mes;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Introduce el mes que quieras: ");
        mes = teclado.nextInt();
        
        switch (mes){
            case 1 :
            {
                System.out.println("Enero");
                break;
                
            }
            case 2 :
            {
                System.out.println("Feb");
                break;
            }
            case 3 :
            {
                System.out.println("Marz");
                break;
            }
            case 4 :
            {
                System.out.println("Abr");
                break;
            }
            case 5 :
            {
                System.out.println("May");
                break;
            }
            case 6 :
            {
                System.out.println("JUn");
                break;
            }
            case 7 :
            {
                System.out.println("Jul");
                break;
            }
            case 8 :
            {
                System.out.println("Ago");
                break;
            }
            case 9 :
            {
                System.out.println("Sep");
                break;
            }
            case 10 :
            {
                System.out.println("Oct");
                break;
            }
            case 11 :
            {
                System.out.println("NOv");
                break;
            }
            case 12 :
            {
                System.out.println("Diciembre");
                break;
            }
            default:{
                System.out.println("este mes no existe");
            }
               
            
        }
        
        
        
    }
    
}
    

