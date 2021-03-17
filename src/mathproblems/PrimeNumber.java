package mathproblems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int number = 1500000;
		boolean flag = false;
		for (int i = 2; i <= number / 2; ++i) {
			// condition for nonprime number
			if (number % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(number + " is a prime number.");
		else
			System.out.println(number + " is not a prime number.");

	}

}



