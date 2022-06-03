import java.util.Scanner;


public class Main{

     public static void main(String []args){
        System.out.println("Insira um número hexadecimal");
        System.out.println("");
        
        Scanner ler = new Scanner(System.in);
        String a = ler.nextLine();
        
        String dado[] ={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        
        boolean found = false;

        for(int i = 0; i < dado.length; i++) {
            if(dado[i]==a) {
                found=true;
            }
        }
        
    try {
        
        System.out.println("A conversão de " + a + " em hexadecimal para decimal é igual a:"); 
        int dec = Integer.parseInt(a,16); 
        System.out.println(dec);
        
    }
    
    catch(Exception e){
        
    System.out.println("");        
    System.out.println("Insira uma entrada válida");    
        
    }
        
        
        
     }
}