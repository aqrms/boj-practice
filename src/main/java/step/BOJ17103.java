package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17103 {
	public static boolean[] prime = new boolean[1000001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		markPrimeNumbersAsFalse();

		while (t-- > 0) {
			int cnt = 0;
			int num = Integer.parseInt(br.readLine());
			for (int i = 2; i <= num / 2; i++) {
				if (!prime[i] && !prime[num - i])
					cnt++;
			}
			System.out.println(cnt);
		}
	}

	static void markPrimeNumbersAsFalse() {
		prime[0] = prime[1] = true;

		for (int i = 2; i < Math.sqrt(prime.length); i++) {
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}
