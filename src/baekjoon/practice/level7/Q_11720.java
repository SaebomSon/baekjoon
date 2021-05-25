package baekjoon.practice.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// title : 숫자의 합
public class Q_11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String numbers = br.readLine();
		
		int sum = 0;
		
		for(int i = 0; i < numbers.length(); i++) {
			sum += numbers.charAt(i) - '0';
		}
		System.out.println(sum);
	}
}
