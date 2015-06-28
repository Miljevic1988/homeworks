package ba.bitcamp.task5;

public class Task5 {

	public static boolean temp = false;
	public static double pow = 1;

	public static void main(String[] args) {
		System.out.println(getPower(2, 4));
	}

	public static double getPower(double a, double b) {
		if (b == 0) {
			if (temp == false) {
				return pow;
			}
			return 1 / pow;
		}
		if (b < 0) {
			b *= -1;
			temp = true;
		}
		if (b % 1 != 0) {
			pow = Math.pow(a, (b % 1));
			b -= (b % 1);
		}
		if (b != 0) {
			pow *= a;
		}
		b -= 1;
		return getPower(a, b);
	}
}