package main;



import java.util.Arrays;
import javax.swing.JOptionPane;






public class exe95 {
static int matriz [][];
static int vetor [];



public static void main(String args[]){





matriz = new int [6][6];
vetor = new int [36];
int i;
int j;
for ( i = 0; i < 6 ; i++){
for ( j = 0; j < 6 ; j++)
{
matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DA MATRIZ " + i + "," + j)); vetor[i]=matriz[i][j]; }
}
for ( i =0 ; i < 6 ; i++){
System.out.println(vetor[i]);
System.out.println(Arrays.deepToString(matriz));
}
}




}