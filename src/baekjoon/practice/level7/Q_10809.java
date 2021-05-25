package baekjoon.practice.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// title : ¾ËÆÄºª Ã£±â
public class Q_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for(int arr: alpha(str)) {
			System.out.print(arr + " ");
		}
		
	}
	static int[] alpha(String word) {
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for(int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if(arr[idx] == -1) {
				arr[idx] = i;				
			}
		}
		return arr;
	}
}
