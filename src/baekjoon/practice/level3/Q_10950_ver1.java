package baekjoon.practice.level3;

import java.util.Scanner;

// title : A+B -3
public class Q_10950_ver1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[t];
		
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a + b;
		}
		sc.close();
		
		for(int r : arr) {
			System.out.println(r);
		}
		
	}

}
