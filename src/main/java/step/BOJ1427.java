package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1427 {

	public void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();

		Arrays.sort(arr);

		for (int i = arr.length; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) throws IOException {
		new BOJ1427().solution();
	}
}
