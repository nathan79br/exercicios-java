import java.util.Scanner;


public class Main{

     public static void main(String []args){
         
         System.out.println("Insira valores inteiros para preencher uma matriz 5x5");
         
         Scanner leitor = new Scanner(System.in);
         
        int matriz[][] = new int[5][5];
        
        int linhas[] = new int[5];
        int colunas[] = new int[5];
        
        for(int i = 0; i <= 4; i++){
            for(int ii = 0; ii <= 4; ii++){
                matriz[i][ii] = leitor.nextInt();
                
            }
        }
        
        System.out.println("");
        
        for(int i = 0; i <= 4; i++){
            for(int ii = 0; ii <= 4; ii++){
                System.out.print(matriz[i][ii] + " ");
            }
            
            System.out.println("");
        }
        
        System.out.println("");
        
        for(int i = 0; i <= 4; i++){
            for(int ii = 0; ii <= 4; ii++){
               linhas[i] = linhas[i] +  matriz[i][ii];
                
            }
        }
        
        System.out.println("A soma das linhas da matriz é igual a:");
        
        for(int i = 0; i <= 4; i++){
               System.out.print(linhas[i] + " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        for(int i = 0; i <= 4; i++){
            for(int ii = 0; ii <= 4; ii++){
               colunas[i] = colunas[i] +  matriz[ii][i];
                
            }
        }
        
        System.out.println("A soma das colunas da matriz é igual a:");
        
        for(int i = 0; i <= 4; i++){
               System.out.print(colunas[i] + " ");
        }
        
        
        
        
     }
}