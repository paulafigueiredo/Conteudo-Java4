package Exerciciosdia4;


import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		
		 int [] A = new int[6];
	     int soma = 0;

	     A[0] = 1;
	     A[1] = 0;
	     A[2] = 5;
	     A[3] = -2;
	     A[4] = -5;
	     A[5] = 7;

	     soma = A[0] + A[1] + A[5];

	     System.out.println("Somas das posi��es: " + soma+"\n\n");

	     A[3] = 100;

	     for(int i = 0; i < 6; i++) {
	         System.out.println("Valor do vetor na Posi��o [" + (i + 1) + "]: " + A[i]);
	     }
		
			

	}

}
