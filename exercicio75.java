
package main;

public class exercicio75 {
 
    int arr[] ={22,36,46,76,100,207,354,58,37,8,5595,75,42,65,211};

                System.out.println("Vetor bagunçado: ");
                for(int i=0; i < arr.length; i++){
                        System.out.print(arr[i] + " ");
                }
                System.out.println();

                
            int n = arr.length;
            int temp = 0;
                for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                          if(arr[j-1] > arr[j]){
                                 
                                 temp = arr[j-1];
                                 arr[j-1] = arr[j];
                                 arr[j] = temp;
                         }

                 }
                 } 

                System.out.println("Vetor arrumado com metodo BubbleSort");
                for(int i=0; i < arr.length; i++){
                        System.out.print(arr[i] + " ");
                }

}
