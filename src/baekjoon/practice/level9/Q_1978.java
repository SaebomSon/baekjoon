package baekjoon.practice.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 소수 찾기 : 1과 자기 자신만 약수로 가진다.
public class Q_1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			boolean isPrime = true;
			int num = Integer.parseInt(st.nextToken());
			
			// 1은 소수가 아니기 때문에 따로 처리
			if(num == 1) {
				continue;
			}
			// 제곱근 이하의 수까지만 검사(2부터)
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) count++;
		}
		System.out.println(count);
	}

}
