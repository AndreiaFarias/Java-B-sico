/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs;

import java.util.Scanner;

/**
 *
 * @author Wander
 */
public class exerc5 {
     public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Entre com a primeira nota ");
           double num1 = scan.nextDouble();
    
        System.out.println("Entre com a segunda nota");
             double num2 = scan.nextDouble(); 
        double media = (num1+num2)/2;
        
        if(media == 10){
            System.out.println("Aprovado com distinção! Média = " + media);
        }else if(media >= 7){
            System.out.println("Aprovado  Média = " + media);
        }else{
            System.out.println("Reprovado Média = " + media);
        }
     }
    
}
