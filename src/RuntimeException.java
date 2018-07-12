import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeException {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Numerator: ");
			int numerator = scanner.nextInt();
			System.out.println("Denomirator: ");
			int denomirator = scanner.nextInt();
			float result = numerator / denomirator;
			System.out.println(numerator + "/" + denomirator + " = " + result);
		}
		catch (InputMismatchException e) {
			System.out.println("Input error.");
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic error.");
		}
		finally {
			System.out.println("finally....");
		}
	}
}
