package baekjoon.practice.level6;

// title : ¼¿ÇÁ ³Ñ¹ö
public class Q_4673_ver1 {
	public static void main(String[] args) {
		int[] arr = new int[10000];
		int sum = 0;
		int count = 0;

		for (int i = 1; i <= arr.length; i++) {
			sum += i;
			String str = String.valueOf(i);
			for (int j = 0; j < str.length(); j++) {
				sum += str.charAt(j) - '0';
			}
			if (sum < 10000) {
				arr[sum] = 1;
			}
			sum = 0;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.println(i);
			}
		}
	}
}
