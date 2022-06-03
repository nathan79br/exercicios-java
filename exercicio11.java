
package main;

import java.util.Scanner;


public class exercicio11 {
    
    
    Scanner armazena = new Scanner(System.in);

double nota1 = 0;
double nota2 = 0;
double bi1 =0;
double bi2 =0;
double semestre =0;

System.out.println(" ");
System.out.println(" ***** Calculo de notas Semestrais ***** ");
System.out.println(" ");
System.out.println(" Digite a nota 1 do primeiro Bimestre ");
nota1 = armazena.nextDouble();

System.out.println("  ");
System.out.println(" Digite a nota 2 do primeiro Bimestre ");
System.out.println("  ");
nota2 = armazena.nextDouble();

bi1 = ((nota1 + nota2) /2);

nota1 = 0;
nota2 = 0;

System.out.println(" ");
System.out.println(" ***** Continuando o calculo de nota do semestre ***** ");
System.out.println(" ");
System.out.println(" Digite a nota 1 do Segundo Bimestre ");
nota1 = armazena.nextDouble();

System.out.println("  ");
System.out.println(" Digite a nota 2 do Segundo Bimestre ");
System.out.println("  ");
nota2 = armazena.nextDouble();

bi2 = ((nota1 + nota2)/2);

semestre = ((bi1 + bi2)/2);

System.out.println("  ");
System.out.println(" Nota do primeiro bimestre: "+ bi1);
System.out.println(" Nota do Segundo bimestre: "+ bi2);
System.out.println(" Nota do Semestre: "+ semestre);   
  
}
