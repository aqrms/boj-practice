package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2485 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] trees = new int[N];
		for (int i = 0; i < N; i++) {
			trees[i] = Integer.parseInt(br.readLine());
		}

		int gcd = 0;
		for (int i = 0; i < N - 1; i++) {
			int distance = trees[i + 1] - trees[i];
			gcd = getGcd(distance, gcd);
		}

		int totalTrees = (trees[N - 1] - trees[0]) / gcd + 1;
		int existTrees = trees.length;
		int result = totalTrees - existTrees;

		System.out.println(result);
	}

	static int getGcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
