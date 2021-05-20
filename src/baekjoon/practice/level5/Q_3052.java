package baekjoon.practice.level5;

import java.util.Scanner;

// title : ³ª¸ÓÁö
public class Q_3052 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int[] count = new int[42];
		int different = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			count[arr[i] % 42]++;
		}
		
		for(int i = 0; i < count.length; i++) {
			if(count[i] != 0) different++;
		}
		System.out.println(different);
		
		
		
	}
}
