import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int maior, n;
		maior = 0;
		
		System.out.print("Qual é a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("Elemento [%d][%d]: ", i,j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i=0; i<n; i++) {
			maior = mat[i][0];
			for(int j=1; j<n; j++) {
				if(mat[i][j] > maior) {
					maior = mat[i][j];
				}
			}			
		}
		
		System.out.println("Maior elemento da linha: ");
		
		
		for(int i=0; i<n; i++) {
			System.out.printf("%d\n", maior);
		}
		
		
		sc.close();

	}

}
