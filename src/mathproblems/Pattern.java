package mathproblems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */

		for(int i = 100; i >= 0; i--) {
			System.out.println(i);
			if(i == 90) {
				break;
			}
		}
		for(int i = 88; i >= 0; i=i-2) {
			System.out.println(i);
			if(i == 70) {
				break;
			}
		}
		for(int i = 67; i >= 0; i=i-3) {
			System.out.println(i);
			if(i == 40) {
				break;
			}
		}
		for(int i = 36; i >= 0; i=i-4) {
			System.out.println(i);
		}

	}
}
		


