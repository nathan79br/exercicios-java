
package main;

import java.util.Scanner;


public class exercicio38 {
   
    Scanner armazena = new Scanner(System.in);
       
       int ano = 0;
       
       System.out.println("Digite o ano que deseja saber se é Bissexto ou não... ");
       System.out.println(" ");
       ano = armazena.nextInt();
 
       
       if ((ano%4 == 0) && (ano%400 == 0)){
           System.out.println("O ano digitado foi: "+ano);
           System.out.println("E é divisivel por 4 e por 400 tornando ele um ano Bissexto");
              
           
       }else if(ano%100 == 0){
           System.out.println ("O ano digitado foi: "+ano);
           System.out.println("E é divisivel por 100 tornando ele um ano Bissexto");
           
           
       }else{
           System.out.println("O ano digitado foi: "+ano);
           System.out.println("Ele não é divisivel por 4 ou 400 fazendo que com que ele não seja um ano Bissexto");
       }
}
