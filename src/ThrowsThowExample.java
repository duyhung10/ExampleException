
public class ThrowsThowExample {
	public static void main(String[] args) {
		try {
			Fraction fra = new Fraction(2, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) throws Exception {
		if (denominator == 0)
			throw new Exception(); // Tao ra mot doi tuong Exception va nem no toi noi goi phuong thuc.
		this.numerator = numerator;
		this.denominator = denominator;
	}
}