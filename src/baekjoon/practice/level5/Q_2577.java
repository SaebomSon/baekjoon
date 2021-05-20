package baekjoon.practice.level5;

import java.util.Scanner;

// title : 숫자의 개수
public class Q_2577 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//0~9까지 담을 배열
		int[] count = new int[10];
		
		int arr = 0;
		String num = String.valueOf(a*b*c);
		
		for(int i = 0; i < num.length(); i++) {
			arr = (num.charAt(i) - '0');
			count[arr]++;
		}
		
		for(int k : count) {
			System.out.println(k);
		}
		
		sc.close();
		
	}
}
