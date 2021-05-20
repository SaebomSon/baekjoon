package baekjoon.practice.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class level8_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		// 단어의 개수
//		String str = sc.nextLine();
//		
//		StringTokenizer st = new StringTokenizer(str, " ");
//		System.out.println(st.countTokens());

		// 단어 공부
		String str = sc.next();
		int[] arr = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			if(65 <= str.charAt(i) && str.charAt(i) <= 90) {
				arr[str.charAt(i) - 65]++;
				
			}else {
				arr[str.charAt(i) - 97]++;
			}
		}
		
		int max = -1;
		char ch = '?';
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65);
			}else if(arr[i] == max){
				ch = '?';
			}
		}
		System.out.println(ch);
		
		
		
		// 상수
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String num = br.readLine();
//		StringTokenizer st = new StringTokenizer(num, " ");
//		StringBuffer sb1 = new StringBuffer();
//		StringBuffer sb2 = new StringBuffer();
//		
//		while(st.hasMoreTokens()) {
//			String num1 = st.nextToken();
//			String num2 = st.nextToken();
//			sb1.append(new StringBuffer(num1).reverse().toString());
//			sb2.append(new StringBuffer(num2).reverse().toString());
//			String a = sb1 + "";
//			String b = sb2 + "";
//			
//			int num3 = Integer.parseInt(a);
//			int num4 = Integer.parseInt(b);
//			int max = num3;
//			if(max < num4) max = num4;
//			else max = num3;
//			System.out.println(max);
//			
//		}
		
		
		
		
		
	}

}
