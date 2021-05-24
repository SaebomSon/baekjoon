package baekjoon.practice.level6;

// title : 셀프 넘버
public class Q_4673_ver2 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		
		for(int i = 1; i < check.length; i++) {
			int number = d(i);
			if(number < 10001) {
				check[number] = true;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < check.length; i++) {
			if(! check[i]) {
				sb.append(i + "\n");
			}
		}
		System.out.println(sb);
	}
	static int d(int num) {
		int sum = num;
		while(num != 0) {
			// 첫째 자리수
			sum += (num % 10);
			// 나머지 자리수
			num = num / 10;
		}
		return sum;
	}
}
