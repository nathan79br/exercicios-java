
package main;

import java.util.Scanner;

public class exercicio54 {
 
    
    Scanner armazena = new Scanner(System.in);
       
       int valor = 0;
       int i = 2;
       
       System.out.println("Digite um valor: ");
       System.out.println(" ");
       valor = armazena.nextInt();
 
       while( (i*(i+1)*(i+2)) <= valor ){
    
        
        
        if(i*(i+1)*(i+2) == valor)
        {
           System.out.println("é um numero triangular ");
        }
        else
        {
            System.out.println("Não é um numero triangular ");
        }    
        i++;
    } 
}
