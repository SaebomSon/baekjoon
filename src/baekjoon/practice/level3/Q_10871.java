package baekjoon.practice.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// title : X보다 작은 수
public class Q_10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num < x) {
				sb.append(num + " ");
			}
		}
		System.out.println(sb);
		
	}
}
