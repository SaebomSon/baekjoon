package baekjoon.practice.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// title : 한수
public class Q_1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(hansu(num));
	}

	static int hansu(int num) {
		int count = 0;
		
		if (num < 100) {
			return num;
		} else {
			count = 99;
			if (num == 1000) {
				num = 999;
			}
			for (int i = 100; i <= num; i++) {
				// 100의 자리
				int a = i / 100;
				// 10의 자리
				int b = (i / 10) % 10;
				// 1의 자리
				int c = i % 10;
				
				if ((a - b) == (b - c)) {
					count++;
				}
			}
		}
		return count;
	}
}
