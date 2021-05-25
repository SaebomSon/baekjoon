package baekjoon.practice.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// title : 아스키 코드
public class Q_11654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = input.charAt(0);
		System.out.println(num);
	}
}
