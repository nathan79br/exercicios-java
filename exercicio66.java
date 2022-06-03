/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;


public class exercicio66 {
 
    
    int [] a = new int [10];
       int [] b = new int [10];
       int insert = 0;

        for (int cont=0; cont <= 9; cont++){
            
            Scanner armazena = new Scanner(System.in);
            
            
           System.out.println("Digite os valores da vetor A: ");
           System.out.println(" ");
            
            insert = armazena.nextInt();
            a[cont] = insert;
            
            b[cont] = a[cont];
            
           }        
        
                System.out.println("Vetor A: ");
                for(int i=0; i < a.length; i++){
                        System.out.print(a[i] + " ");
                }
                
                System.out.println(" ");
                
                System.out.println("Vetor B copiado do A: ");
                for(int i=0; i < b.length; i++){
                        System.out.print(b[i] + " ");
                } 
}
