/* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */


	import java.util.Locale;
	import java.util.Scanner;


	public class exercicioalturas {
		
			public static void main(String[] args) {
				
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Quantas pessoas serão digitadas?");
			int n = sc.nextInt();
			
			String[] nomes = new String[n];
			int[] idades = new int[n];
			double[] alturas = new double[n];
			
			// Leitura dos dados
			for (int i = 0; i < n; i++) {
				System.out.printf("Dados da %da pessoa:\n", i+1);
				System.out.print("Nome: ");
				nomes[i] = sc.next();
				System.out.println("Idade: ");
				idades[i] = sc.nextInt();
				System.out.println("Altura: ");
				alturas[i] = sc.nextDouble();
			}
			
			int nmenores = 0;
			double alturatotal = 0;
			
			for (int i=0; i<n; i++) {
				if (idades[i] < 16) {
					nmenores++;
				}
				alturatotal = alturatotal + alturas[i];
			}
			
			double alturamedia = alturatotal / n;
			double percentualMenores = ((double)nmenores / n) * 100.0;
			
			System.out.printf("\nAltura media = %.2f\n", alturamedia);
		    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

		    for(int i=0; i<n; i++) {
		        if (idades[i] < 16) {
		        	System.out.printf("%s\n", nomes[i]);
		        }
		    }
			
			sc.close();
		}
}

