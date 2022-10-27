package pgdp.warmup;

public class PenguWarmup {

	protected PenguWarmup() {
		throw new UnsupportedOperationException();
	}

	public static void penguInfoOut(int penguin) {
		if (penguin < 0) {
			System.out.println("Penguin " + penguin + " is not a known penguin!");
		} else {
			System.out.println("Penguin: " + penguin);
			if (penguin % 2 == 0) {
				System.out.println("This penguin is a male.");
			} else {
				System.out.println("This penguin is a female.");
			}
		}
	}

	public static int penguEvolution(int penguin, int years) {
		// TODO
		return 0;
	}

	public static int penguSum(int penguin) {
		// TODO
		return 0;
	}

	public static long penguPermutation(long n, long k) {
		// TODO
		return 0;
	}

	public static long penguPowers(int x, int i) {
		// TODO
		return 0;
	}

	/*	Die Inhalte der main()-Methode beeinflussen nicht die Bewertung dieser Aufgabe
	 *	(es sei denn natürlich, sie verursachen Compiler-Fehler).
	 */
	public static void main(String[] args) {

		// Here is a place for you to play around :)

		penguInfoOut(2);
	}

}
