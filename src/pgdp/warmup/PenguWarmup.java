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
		int final_n = 0;
		boolean sevenyears = false;
		int sevenyears_c = 0;
		boolean sevenyears_f = false;
		for (int r = 0; r < years; r++) {
			if (sevenyears) {
				sevenyears_c++;
				if (sevenyears_c == 6) {
					sevenyears = false;
					sevenyears_f = true;
				}
			} else {
				if (penguin % 2 == 0) {
					for (int i = 2; i <= penguin; i = i * 2) {
						if (i == penguin) {
							penguin = 1;
						}
					}
					if (penguin % 2 == 0) {
						penguin = penguin / 2;
					}
				} else if (penguin % 2 != 0) {
					if (penguin % 7 == 0 && !sevenyears_f) {
						sevenyears = true;
						sevenyears_c = 1;
					} else {
						penguin = penguin * 3 + 1;
						sevenyears_f = false;
					}
				}
			}
		}
		final_n = penguin;
		return final_n;
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
		penguEvolution(9, 100);
	}

}
