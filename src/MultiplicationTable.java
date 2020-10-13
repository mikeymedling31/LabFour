import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String restart = null;

		do {
			System.out.println("Enter any integer:");
			int number = input.nextInt();
			System.out.println("Number   Squared   Cubed");
			System.out.println("======   =======   =====");

			// Power table
			for (int i = 1; i <= number; i++) {
				System.out.printf("%6s %9s %7s\n", i, i * i, i * i * i);
			}

			// the 1 2 3 4 5
			System.out.print("\n ");
			System.out.print("  ");
			for (int i = 1; i <= number; i++) {
				System.out.printf("%4s", i);
			}

			// the = = = =
			System.out.print("\n ");
			System.out.print("  ");
			for (int i = 1; i <= number; i++) {
				System.out.printf("%4s", "=");
			}

			System.out.print("\n");

			// the * |
			for (int f = 1; f <= number; f++) {
				System.out.print(f + " |");
				// Multi
				for (int j = 1; j <= number; j++) {

					System.out.printf("%4s", j * f);

					if (j == number) {
						System.out.print("\n");
					}
				}
			}

			System.out.println("\n");
			System.out.println("Do you want to continue?(Y/N)");
			restart = input.next();
		} while (restart.equalsIgnoreCase("Y"));
		input.close();
	}
}
