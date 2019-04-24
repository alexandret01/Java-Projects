	package Java06;

import java.util.Scanner;

public class Array_Main {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Digite o Tamanho do Array: ");
		int n= Scanner.nextInt();
		
		double [] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite o valor do vetor %d : ", i);
			vect[i] = Scanner.nextDouble();
		}

	}

}
