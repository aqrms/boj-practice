package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4134 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());

		for (int i = 0; i < N; i++) {
			long num = Long.parseLong(br.readLine());
			if (num <= 2) {
				System.out.println(2);
				continue;
			}
			while (true) {
				boolean flag = true;
				for (int j = 2; j <= Math.sqrt(num); j++) {
					if (num % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println(num);
					break;
				}
				num++;
			}

		}
	}
}
