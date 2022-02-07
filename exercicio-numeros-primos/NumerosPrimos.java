
public class NumerosPrimos {

	public static void numeroPrimo(int numero) {

		boolean primo = true;

		for (int i = 2; i < numero; i++) {

			if (numero % i == 0) {
				System.out.println(numero + " não é primo.");

				primo = false;

				break;
			}
		}

		if (primo == true) {
			System.out.println(numero + " é primo.");
		}
	}

	public static void numeroPrimo(int vetor[]) {
		for (int c = 0; c < vetor.length; c++) {
			numeroPrimo(vetor[c]);
		}
	}
}