
package main;

import java.util.Scanner;


public class exercicio37 {
    
    Scanner armazena = new Scanner(System.in);
       
       double valor = 0;
       double tipo = 0;
       int taman = 0;
       
       System.out.println("Tipo 1 - ervas daninhas R$ 50,00 por acre. ");
       System.out.println("Tipo 2 – gafanhotos R$ 100,00 por acre. ");
       System.out.println("Tipo 3 – broca R$ 150,00 por acre. ");
       System.out.println("Tipo 4 – todos acima R$ 250,00 por acre. ");
       System.out.println(" ");
       System.out.println("De acordo com a tabela que tipo de inceticida deseja solicitar? ");
       tipo = armazena.nextDouble();
       
       System.out.println("Digite o tamanho da terra em Acres: ");
       taman = armazena.nextInt();
       
       if (tipo == 1){
           System.out.println("Tipo 1 - ervas daninhas R$ 50,00 por acre. ");
           System.out.println("Selecionado... ");
           System.out.println("tamanho da terra em acres, "+taman);
           valor = taman*50;     
           
       }else if(tipo == 2){
           System.out.println("Tipo 2 – gafanhotos R$ 100,00 por acre. ");
           System.out.println("Selecionado... ");
           System.out.println("tamanho da terra em acres, "+taman);
           valor = taman*100; 
           
       }else if (tipo == 3){
           System.out.println("Tipo 3 – broca R$ 150,00 por acre. ");
           System.out.println("Selecionado... ");
           System.out.println("tamanho da terra em acres, "+taman);
           valor = taman*150;
           
       }else if(tipo == 4){
           System.out.println("Tipo 4 – todos acima R$ 250,00 por acre. ");
           System.out.println("Selecionado... ");
           System.out.println("tamanho da terra em acres, "+taman);
           valor = taman*250;   
       }

       if(taman > 1000 && valor > 750.00){
        valor = (valor - (valor*0.15));
        System.out.println("O tamanho da terra é grande e o valor tambem voce recebeu 15% de desconto, valor final: " +valor);
       
       }else if(valor > 750.00){
        valor = (valor - (valor*0.10));
        System.out.println("O tamanho do valor a ser pago é grande voce recebeu 10% de desconto, valor final: " +valor);
       
       }else if(taman > 1000){
        valor = (valor - (valor*0.05));
        System.out.println("O tamanho da terra é grande voce recebeu 5% de desconto, valor final: " +valor);
       
       }
    
}
