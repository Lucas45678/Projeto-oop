package poo;

import java.util.Scanner;

public class ArrayUnidimensional {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int linhas = sc.nextInt();
		int colunas = sc.nextInt();
		sc.nextLine();
		
		int matrizUnidimensional[][] = new int[linhas][colunas];
		
		for(int i=0; i<matrizUnidimensional.length; i++) {
			for(int j=0; j<matrizUnidimensional[i].length; j++) {
				
				int incluir = sc.nextInt();
				matrizUnidimensional[i][j] = incluir;
				
			}
		}
		
		for(int i=0; i<matrizUnidimensional.length; i++) {
			
			for(int j=0; i<matrizUnidimensional[i].length; j++) {
				System.out.println(matrizUnidimensional[i][j] + " ");
				
			}
		}
		
		
		
		sc.close();
		
	}
}
