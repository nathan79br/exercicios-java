
package main;

import java.util.Scanner;

public class exercicio29 {
    Scanner armazena = new Scanner(System.in);
       
       double salario = 0;
       double desconto = 0;
       double descontomax = 0;
       
       System.out.println("Digite algum valor");
       salario = armazena.nextDouble();

       desconto = (salario*0.11);

       if(desconto >= 334.29){
        System.out.println("11% do salario: " +salario);
        System.out.println("é: " +desconto+ " Mas esse valor passa o teto do desconto salarial então foi descontado:" +descontomax);
       }else{
        System.out.println("11% do salario " +salario);
        System.out.println("é: " +desconto+ " Valor o qual foi descontado");
    }
}
