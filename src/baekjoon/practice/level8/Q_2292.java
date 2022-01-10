package baekjoon.practice.level8;

import java.util.Scanner;

// ¹úÁý
public class Q_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 1;
		int range = 2;

		if (n == 1) {
			System.out.println(1);
		} else {
			while (range <= n) {
				range = (count * 6) + range;
				count++;
			}
			System.out.println(count);
		}
	}
}
