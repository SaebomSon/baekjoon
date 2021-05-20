package baekjoon.practice.level3;

import java.util.Scanner;

// title : A+B -8
public class Q_11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			a[i] = c;
			b[i] = d;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("Case #" + (i+1) + ": " + a[i] + " + " + b[i] + " = " + (a[i]+b[i]));
		}
		
		sc.close();
		
	}
}
