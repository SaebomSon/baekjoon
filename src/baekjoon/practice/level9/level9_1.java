package baekjoon.practice.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level9_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//false : 아래로 이동
		boolean flag = false;
		int x = 1;
		int y = 1;
		
		//14를 입력 받으면 13번 칸 이동
		for (int i = 0; i < n-1; i++) {
			if (flag) {
				x++;
				y--;
				if (y == 0) {
					flag = false;
					y++;
				}
			} else {
				x--;
				y++;
				if (x == 0) {
					flag = true;
					x++;
				}
			}
		}
		System.out.println(x + "/" + y);

	}

}
