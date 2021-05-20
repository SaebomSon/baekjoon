package baekjoon.practice.level5;

import java.util.Scanner;

public class stamp_symmetric_stars {

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

	}

}
