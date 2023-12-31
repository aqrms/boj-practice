package step;

import java.util.Scanner;

public class BOJ13241 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		long gcd = gcd(a, b);
		System.out.println(a * b / gcd);
	}

	static long gcd(long a, long b) {
		while (b != 0) {
			long r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
