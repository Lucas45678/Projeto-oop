package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> lista = new ArrayList<>();
		
		System.out.print("Quantos funcionarios serão registrados? ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=quantidade; i++) {
			System.out.print("Id# " + i + ": ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			sc.nextLine();
			
			lista.add(new Employee(id, nome, salario));
		}
		
		for(Employee x: lista) {
			System.out.println(x.getId());
			System.out.println(x.getNome());
			System.out.println(x.getSalario());
		}
		
		sc.close();
	
	}
}
