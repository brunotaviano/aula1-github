package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		list.add("Adriana");
		list.add("Amanda");
		list.add("Bruna");
		list.add("Lisa");
		
		for(String nome : list) {
			System.out.println(nome);
		}
		System.out.println();
		System.out.print("Remover nomes iniciados com a letra: ");
		char letra = scan.next().charAt(0);
		System.out.println("----------------------");
		
		list.removeIf(x -> x.charAt(0) == letra);
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
	}

}
