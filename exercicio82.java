
package main;

import java.util.Scanner;

public class exercicio82 {
        Scanner armazena = new Scanner(System.in);
       
       String frase = ""; 
       String pal = ""; 
       int a = 0;
       
       System.out.println("Digite uma frase: ");
       pal = armazena.nextLine();
 
       String[] palavras = pal.split(" ");
       
       for(int i=0; i < palavras.length; i++){
           
           if(a < palavras[i].length()){
           a = palavras[i].length();
           pal = palavras[i];
           }    
       }
       
        System.out.println("Essa foi a maior palavra da frase: "+pal);  
}
