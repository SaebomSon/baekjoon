package baekjoon.practice.level3;

import java.util.Scanner;

// title : �� ��� -1
public class Q_2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
