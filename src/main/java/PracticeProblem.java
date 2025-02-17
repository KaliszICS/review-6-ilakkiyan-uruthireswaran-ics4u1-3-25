import java.util.Scanner;

public class PracticeProblem {

	public static int sum(int num1, int num2) {
		return num1 + num2;

	}

	public static int difference(int a, int b) {
		return a - b;
	}

	public static double product(double var1, double var2) {
		return var1 * var2;
	}

	public static String removeFirst(String str) {
		if (str == null || str.length() <= 1){
			return "";
		}
		return str.substring(1);
	}

	public static int combinedLength(String str1, String str2) {
		return str1.length() + str2.length();
	}

	public static boolean isEven(int x) {
		return x % 2 == 0;
	}

	public static boolean isOdd(int y) {
		return y % 2 != 0;
	}

	public static boolean isPositive(int z){
		return z > 0;
	}

	public static boolean isNegative(int m) {
		return m < 0;
	}
	

	public static void main(String[] args) {
		int result = sum(5, 3);
		System.out.println(result);

		int result1 = difference(9, 3);
		System.out.println(result1);

		double result2 = product(3, 3);
		System.out.println(result2);

		String result3 = removeFirst("Neither");
		System.out.println(result3);

		int result4 = combinedLength("Hello", "World");
		System.out.println(result4);

		System.out.println(isEven(8));
		System.out.println(isOdd(4));
		System.out.println(isPositive(-10));
		System.out.println(isNegative(-1));


		}

}


	

