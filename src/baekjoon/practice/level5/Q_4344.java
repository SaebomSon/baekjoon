package baekjoon.practice.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// title : 평균은 넘겠지
public class Q_4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int totalcase = Integer.parseInt(br.readLine());
		int[] arr;
		StringTokenizer st;

		for (int i = 0; i < totalcase; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int student = Integer.parseInt(st.nextToken());
			arr = new int[student];
			double sum = 0;

			for (int j = 0; j < student; j++) {
				int score = Integer.parseInt(st.nextToken());
				arr[j] = score;
				sum += score;
			}
			double avg = sum / student;

			double count = 0;
			for (int j = 0; j < student; j++) {
				if (arr[j] > avg) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n", (count / student) * 100);
		}
	}
}
