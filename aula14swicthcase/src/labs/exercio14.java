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
public class exercio14 {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Entre com  primerio número ");
             int num1 = scan.nextInt();
    
        System.out.println("Entre com o segundo número");
             int num2 = scan.nextInt(); 
        
        if(num1>num2){
        System.out.println("O num1 :" + num1 + "é maior.");
        
        }else{
               System.out.println("O num2  :" + num2 + "é maior. "); 
             }
    
           }
}
