package baekjoon.practice.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Fly me to the Alpha Centauri
public class Q_1011 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int distance = y - x;
			int max = (int)Math.sqrt(distance);
			
			if(max == Math.sqrt(distance)) {
				sb.append((max * 2 - 1) + "\n");
			}else if(distance <= max * max + max) {
				sb.append((max * 2) + "\n");
			}else {
				sb.append((max * 2 + 1) + "\n");
			}
		}
		System.out.println(sb);
	}

}
