package curso_programacao;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("N° de linhas: ");
		int m = scan.nextInt();
		
		System.out.print("N° de colunas: ");
		int n = scan.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = scan.nextInt();
			}
		}
		
		System.out.print("N°: ");
		int x = scan.nextInt();
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] == x) {
					System.out.println("# Posição "+i+", "+j+":");
					if(j > 0) {
						System.out.println("Esquerda: "+mat[i][j-1]);
					}if(j < n-1) {
						System.out.println("Direita: "+mat[i][j+1]);
					}if(i > 0) {
						System.out.println("Acima: "+mat[i-1][j]);
					}if(i < m-1) {
						System.out.println("Abaixo: "+mat[i+1][j]);
					}
					System.out.println();
				}
				
				}
			}
		}

	}

