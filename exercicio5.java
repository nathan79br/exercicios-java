package main;

import java.util.Scanner;

public class exercicio5 {
    Scanner armazena = new Scanner(System.in);
        
        int num = 0;
        System.out.println("Digite Um numero e te direi seu sucessor ");
        num = armazena.nextInt();
        
        num = num + 1;
        
        System.out.println("O sucessor do numero digitado é: " +num);
}
}

