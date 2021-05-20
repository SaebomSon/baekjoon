package baekjoon.practice.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level9_3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		int[][] apart = new int[15][15];
		
		for(int i = 0; i < 15; i++) {
			apart[i][1] = 1;
			apart[0][i] = i;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) {
				apart[i][j] = apart[i-1][j] + apart[i][j-1];
			}
		}
		
		for(int i = 0; i < test; i++) {
			int n = Integer.parseInt(br.readLine());
			int k = Integer.parseInt(br.readLine());
			System.out.println(apart[n][k]);
		}
		
	}
}
