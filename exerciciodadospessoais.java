/* Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.  */

import java.util.Locale;
import java.util.Scanner;

public class exerciciodadospessoais {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();

		int qtndhomens, qtndmulheres;
	    double menoraltura, maioraltura, alturamediaf, alturatotalf;
		double[] altura =  new double[n];
		char[] genero = new char[n];
		
		for (int i=0; i < n; i++) {
			System.out.printf("Altura da %da pessoa:", i+1);
			altura[i] = sc.nextDouble();
			System.out.printf("Gênero da %da pessoa:", i+1);
			genero[i] = sc.next().charAt(0);
		}
		
		 menoraltura = altura[0];
		 maioraltura = altura[0];
		
		for (int i=1; i < n; i++) {
			if (altura[i] > maioraltura) {
				maioraltura = altura[i];
			}
			if (altura[i] < menoraltura) {
				menoraltura = altura[i];
		}
		
			qtndhomens = 0;
			qtndmulheres = 0;
			alturatotalf = 0;
			alturamediaf = 0;
		
		for (i=0; i < n; i++) {
			if (genero[i] == 'M') {
				qtndhomens++;
			}
			else {
				qtndmulheres++;
				alturatotalf = alturatotalf + altura[i];
			}
		}
		
		alturamediaf = alturatotalf / qtndmulheres;
	
		
		System.out.printf("Maior altura %s\n", maioraltura);
		System.out.printf("Menor altura %s\n", menoraltura);
	    System.out.printf("Media das alturas das mulheres = %.2f\n", alturamediaf);
	    System.out.printf("Numero de homens = %s\n", qtndhomens);

		sc.close();
	}
	
}
}