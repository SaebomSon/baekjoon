package baekjoon.practice.level3;

import java.util.Scanner;

// title : гу
public class Q_8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		for(int i = 0; i <= n; i++) {
			a += i;
		}
		System.out.println(a);
		
	}

}
