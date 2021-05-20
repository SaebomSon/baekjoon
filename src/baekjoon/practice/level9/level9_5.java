package baekjoon.practice.level9;

import java.util.*;

class Main {
	public static void main(String[] t) {
		Scanner k = new Scanner(System.in);
		int n = k.nextInt(), i = 0, j, a, c;
		while (i++ < n) {
			for (a = k.nextInt(), a = k.nextInt() - a, j = 1, c = 1; a > c; c += ++j % 2 > 0 ? 1 : 0)
				a -= c;
			System.out.println(j);
		}
	}
}

