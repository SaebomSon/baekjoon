package baekjoon.practice.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// title : 단어의 개수
public class Q_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str);
		System.out.println(st.countTokens());
	}
}
