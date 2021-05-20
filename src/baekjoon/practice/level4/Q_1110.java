package baekjoon.practice.level4;

import java.util.Scanner;

// title : 더하기 사이클
public class Q_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		int a = n / 10;
		int b = n % 10;
		int tmp = 0;
		while (true) {
			count++;
			tmp = b;
			b = (a + b) % 10;
			a = tmp;
			if((a*10) + b == n) break;

		}
		System.out.println(count);
		
		sc.close();
		
	}
}
