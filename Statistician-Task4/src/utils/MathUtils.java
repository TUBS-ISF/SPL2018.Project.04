package utils;

public class MathUtils {
	public static boolean isInteger(double number) {
		return number == Math.floor(number) && !Double.isInfinite(number);
	}
}
