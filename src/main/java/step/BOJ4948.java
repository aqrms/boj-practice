package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4948 {

	public static boolean[] prime = new boolean[123456 * 2 + 1];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				return;
			}
			int count = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (prime[i] == false) {
					count++;
				}
			}
			System.out.println(count);
		}

	}
}
