package baekjoon.practice.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 손익분기점
public class Q_1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line, " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		System.out.println(breakEvenPoint(a, b, c));
	}

	public static int breakEvenPoint(int a, int b, int c) {
		int point = 0;

		if (c <= b) {
			point = -1;
		} else {
			point = (a / (c - b)) + 1;
		}
		return point;
	}

}
