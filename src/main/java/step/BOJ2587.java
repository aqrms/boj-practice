package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2587 {
	public void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = 5;
		int[] arr = new int[size];
		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			total += arr[i];
		}

		Arrays.sort(arr);
		System.out.println(total / arr.length);
		System.out.println(arr[2]);
	}

	public static void main(String[] args) throws IOException {
		new BOJ2587().solution();
	}
}
