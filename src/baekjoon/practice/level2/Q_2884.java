package baekjoon.practice.level2;

// title : 알람시계
import java.util.Scanner;

public class Q_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		if (m < 45) {
			h = h - 1;
			m = m + 15;
			if (h < 0) {
				h = h + 24;
			}
			System.out.println(h + " " + m);
		} else {
			System.out.println(h + " " + (m - 45));
		}
		sc.close();
	}

}
