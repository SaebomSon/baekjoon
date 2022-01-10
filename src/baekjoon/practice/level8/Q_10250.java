package baekjoon.practice.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ACMÈ£ÅÚ
public class Q_10250 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int height = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			int customer = Integer.parseInt(st.nextToken());

			if (customer % height == 0) {
				System.out.println((height * 100) + (customer / height));
			} else {
				System.out.println(((customer % height) * 100) + (customer / height) + 1);
			}
		}
	}
}
