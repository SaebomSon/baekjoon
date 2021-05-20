package baekjoon.practice.level2;

import java.util.Scanner;

// title : 두 수 비교하기
public class Q_1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(">");
		}else if(a < b) {
			System.out.println("<");
		}else if(a == b) {
			System.out.println("==");
		}
		
		sc.close();
	}
}
