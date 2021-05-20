package baekjoon.practice.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// title : OXÄûÁî
public class Q_8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		String[] testArr = new String[test];
		
		for(int i = 0; i < testArr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			testArr[i] = st.nextToken();
		}
		
		for(int i = 0; i < testArr.length; i++) {
			int count = 0;
			int sum = 0;
			for(int j = 0; j < testArr[i].length(); j++) {
				if(testArr[i].charAt(j) == 'O') {
					count++;
				}else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
	}
}
