package poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int quantidade = sc.nextInt();
		int vetor[] = new int[quantidade];
		
		for(int i=0; i<quantidade; i++) {
			vetor[i] = sc.nextInt();
		}
		
		System.out.println();
		for(int i=0; i<quantidade; i++) {
			System.out.println(vetor[i]);
		}
		
		
		sc.close();
   
		
		
		
		
	}

}
