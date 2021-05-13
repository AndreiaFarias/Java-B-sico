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
public class exerc3 {
    public static void main(String[] args) { 
       
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Entre com  uma letra F ou M");
             
        String letra = scan.next(); 
        
             /*comparação de string pode ser feita com "equals ou equalsIgnoreCase", porque a string em java é uma classe*/
             
             if(letra.equalsIgnoreCase("F")){
                 System.out.println("F - Feminino");
             }else if(letra.equalsIgnoreCase("M")){ 
                 System.out.println("M- Masculino");
             }else{
                 System.out.println("Sexo inválido");
                 
             }
                 
        }
    
}
