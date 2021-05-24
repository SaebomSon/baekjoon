package baekjoon.practice.level6;

// title : 정수 N개의 합
// class name = Test
public class Q_15596 {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20, 30 };
		Test test = new Test();
		long total = test.sum(arr);
		System.out.println(total);
	}
}

class Test {
	long sum(int[] a) {
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
