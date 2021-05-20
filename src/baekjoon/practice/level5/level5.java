package baekjoon.practice.level5;

import java.util.Scanner;

public class level5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < (num*2)-1; i++) {
			if(i < num) {
				for(int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < (num-i)*2-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int j = 0; j < (num-1)*2-i; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < (i+1-num)*2+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		
		sc.close();

//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//
//		for (int i = 0; i < num * 2; i++) {
//			if(i % 2 == 1) {
//				for(int j = 1; j <= num; j++) {
//					if(j % 2 == 0) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			}else {
//				for(int j = 1; j <= num; j++) {
//					if(j % 2 == 1) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}

	}

}
