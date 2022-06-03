
package main;

import java.util.Scanner;


public class exercicio20 {
    Scanner armazena = new Scanner(System.in);
       
       double valor = 0;
       double entr = 0;
       double prest = 0;
       
       System.out.println("Digite o valor do produto");
       valor = armazena.nextDouble();

       

       if(valor%3 != 0){
           entr = ((valor/3) + (valor%3));
           prest = ((valor/3) - (valor%3));
        System.out.println("Valor da entrada: " +entr);
        System.out.println("Valor das prestações: " +prest);
       }else{
           entr = (valor/3);
           prest = (valor/3);
        System.out.println("Valor da entrada: " +entr);
        System.out.println("Valor das prestações: " +prest);
}
