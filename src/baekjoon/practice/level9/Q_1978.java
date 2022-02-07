package baekjoon.practice.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// �Ҽ� ã�� : 1�� �ڱ� �ڽŸ� ����� ������.
public class Q_1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			boolean isPrime = true;
			int num = Integer.parseInt(st.nextToken());
			
			// 1�� �Ҽ��� �ƴϱ� ������ ���� ó��
			if(num == 1) {
				continue;
			}
			// ������ ������ �������� �˻�(2����)
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
