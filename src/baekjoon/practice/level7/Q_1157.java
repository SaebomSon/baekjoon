package baekjoon.practice.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// title : 단어공부
public class Q_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] arr = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
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
			}else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
