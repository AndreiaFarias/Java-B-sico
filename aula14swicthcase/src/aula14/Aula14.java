/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;
import java.util.Scanner;
/**
 *
 * @author Wander
 */
public class Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Entre com um dia da semana: (1-7)");
      int diaSemana = scan.nextInt();
      
      if(diaSemana == 1){
          System.out.println("Domingo");
       }else if(diaSemana == 2){
          System.out.println("Segunda");
       } else if(diaSemana == 3){
          System.out.println("Terça");
       }else if(diaSemana == 4){
          System.out.println("Quarta");
       }else if(diaSemana == 5){
          System.out.println("Quinta");
       }else if(diaSemana == 6){
          System.out.println("Sexta");
       }else if(diaSemana == 7){
          System.out.println("Sabado");
       }else{
            System.out.println("Não é um dia da semana");   
        }
       switch(diaSemana){
       case 1: System.out.println("Domingo");break;
       case 2: System.out.println("Segunda");break;
       case 3: System.out.println("Terça");break;
       case 4: System.out.println("Quarta");break;
       case 5: System.out.println("Quinta");break;
       case 6: System.out.println("Sexta");break;
       case 7: System.out.println("Sábado");break;
       default:System.out.println("Não é um dia da semana");
       }
    }
       
}
       
    


    

