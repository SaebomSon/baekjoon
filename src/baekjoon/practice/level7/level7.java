package baekjoon.practice.level7;

import java.util.Scanner;

public class level7 {
	public static void main(String[] args) {
		// ¼¿ÇÁ³Ñ¹ö
		
		int[] arr = new int[10000];
		
		int sum = 0;
		
		int count = 0;
		
		for(int i = 1; i <= arr.length; i++) {
			sum += i;
			String str = String.valueOf(i);
			for(int j = 0; j < str.length(); j++) {
				sum += str.charAt(j) - '0';
				}
			if(sum < 10000) {
				arr[sum] = 1;
			}
			sum = 0;
		}
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == 0) {
				System.out.println(i);
			}
		}
		
	}
	
}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(hansu(num));
//	}
//
//	static int hansu(int num) {
//		int count = 0;
//
//		for (int i = 1; i <= num; i++) {
//			if (i < 100) {
//				count++;
//			} else {
//				if(num == 1000) {
//					num = 999;
//				}
//				int a = i / 100;
//				int b = (i / 10) % 10;
//				int c = i % 10;
//
//				if ((a - b) == (b - c)) {
//					count++;
//				}
//			}
//		}
//		return count;
//	}
//}

//class Test {
//	long sum(int[] a) {
//		long ans = 0;
//		
//		for(int i = 0; i < a.length; i++) {
//			ans += a[i];
//		}
//		
//		return ans;
//	}
//}


