package baekjoon.practice.level8;

import java.util.Scanner;
// 문자열 - 알파벳 찾기
public class level8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for(int a : alpha(str)) {
			System.out.print(a + " ");
		}
		sc.close();
	}
	
	public static int[] alpha(String word) {
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		for(int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i)-97;
			
			if(arr[idx] == -1) {
				arr[idx] = i;
			}
		}
		
		return arr;
	}
}
