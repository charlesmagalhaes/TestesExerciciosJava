package Aplicacao;

import java.util.Scanner;

import Entidades.Clientes;


public class programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Clientes[] vetor = new Clientes[10];
		
		
		System.out.print("Quantos quartos serão alugados: ");
		int reservas = sc.nextInt();
		
		for (int i=0; i<reservas;i++) {
			System.out.println("Rent #"+i);
			
			System.out.print("Nome: ");
			String nome= sc.next();
			
			System.out.print("email: ");
			String email= sc.next();
			
			System.out.print("Quarto: ");
			int posicao = sc.nextInt();
			
			vetor[posicao] = new Clientes(nome, email);
			
			System.out.println();
			
			
		}
		
		
		for (int i=0; i<vetor.length;i++)
		
			if (vetor[i]!= null) {
				
				System.out.println("Quartos reservados:");
				System.out.println(i+": "+vetor[i].nome+", "+vetor[i].email);
			}
		
		for (int i=0; i<vetor.length;i++) {
			
			System.out.println("Quarto: "+i+" Status: "+vetor[i]);
		}
		
		
		sc.close();

	}

}
