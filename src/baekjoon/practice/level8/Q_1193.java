package baekjoon.practice.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 분수찾기
public class Q_1193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		boolean flag = false;
		int x = 1;
		int y = 1;

		for (int i = 0; i < n - 1; i++) {
			if (flag) {
				x++;
				y--;
				if (y == 0) {
					flag = false;
					y++;
				}
			} else {
				x--;
				y++;
				if (x == 0) {
					flag = true;
					x++;
				}
			}
		}
		System.out.println(x + "/" + y);
	}
}
