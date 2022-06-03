/*
 59.	O número e (número de Euler) pode ser representado
e calculado por meio da utilização da série de Taylor para e quando x=1, 
como a soma da seguinte série infinita: NT 

𝑒 = 1 + 1 + 1 + 1 + ⋯ + 1
 	 	 	 
        1!  2!	3!      𝑛!

Escreva um programa, que leia o número de termos da série (n)
e imprima como saída, o cálculo do número de Euler para 
cada um dos n primeiros elementos da série.
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Double e = 1.0;

       System.out.println("Digite o enésimo numero da série a ser aplicada(n)");
       System.out.println(""); 
       Scanner val = new Scanner(System.in);

       int termos = val.nextInt();


       for(int ii = termos; ii > 1; ii--){

            Long fatorial = Long.valueOf(ii);

            for (Long i = fatorial - 1; i >= 1; i--)
            {
                fatorial = fatorial * i;
            }

        Double div = fatorial.doubleValue();

        e = e + (1/div);

       }

    System.out.println("");
    System.out.println("Utilizando a Série de Taylor com " + termos + " termos obtemos a seguinte aproximação para e:");
    System.out.println(e);


    }
}