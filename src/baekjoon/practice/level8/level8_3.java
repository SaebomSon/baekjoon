package baekjoon.practice.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class level8_3 {
	public static void main(String[] args) throws IOException {
		// ���ڿ� �ݺ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int num = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			for(int j = 0; j < str.length(); j++) {
				for(int k = 0; k < num; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
		
		
		
	}

}
