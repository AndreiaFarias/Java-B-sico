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
public class exerc2 {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Entre com  um número ");
             int num = scan.nextInt(); 
             
             if (num >= 0){
                 System.out.println("Este número é positivo!: "+ num);
                
             }else{
                  System.out.println("Este número não é positivo: "+ num);
   
         }
     }
}
