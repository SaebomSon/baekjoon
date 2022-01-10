package baekjoon.practice.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// title : 그룹 단어 체커
public class Q_1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		int count = 0;

		for (int i = 0; i < num; i++) {
			boolean[] arr = new boolean[26];
			String str = br.readLine();
			boolean group = true;
			char first = str.charAt(0);
			arr[first - 97] = true;

			for (int j = 1; j < str.length(); j++) {
				char next = str.charAt(j);
				if (!arr[next - 97] && first != next) {
					arr[next - 97] = true;
					first = str.charAt(j);

				} else if (arr[next - 97] && first != next) {
					group = false;
					break;
				}
			}
			if (group) count++;
		}
		System.out.println(count);
	}

}
