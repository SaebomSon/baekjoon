package fastcampus;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 4, 5, 2, 1 };
		// �ִ밪�� ã�� 1�� ��ȯ : 4 3 1 2 5 (1ȸ��)
		// 0~3�� �ε������� �ִ밪 ã�� 2�� ��ȯ : 2 3 1 4 5 (2ȸ��)
		// 0~2������ �ִ밪 ã�� 1�� ��ȯ : 2 1 3 4 5(3ȸ��)
		for (int i = 4; i > 0; i--) {
			System.out.println(i + "ȸ�� ��� : ");
			boolean swap = false;
			int maxIndex = arr[0];
			for (int j = 0; j <= i; j++) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
					swap = true;
				}
				int tmp = arr[maxIndex];
				arr[maxIndex] = arr[i];
				arr[i] = tmp;

				for (int e : arr) {
					System.out.print(e + " ");
				}
				System.out.println();
			}
			if (swap == false) {
				break;
			}
			System.out.println();
		}

		for (int e : arr) {
			System.out.print(e + " ");
		}

		// �ּҰ� ã��
		int[] arr2 = new int[] { 4, 3, 5, 1, 2 };
		for (int i = 0; i < arr2.length - 1; i++) {
			boolean swap = false;
			int minIndex = i;
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[j] < arr2[minIndex]) {
					minIndex = j;
					swap = true;
				}
			}
			int tmp = arr2[minIndex];
			arr2[minIndex] = arr2[i];
			arr2[i] = tmp;
			
			if (swap == false) {
				break;
			}
		}
		for (int e : arr2) {
			System.out.print(e + " ");
		}

	}

}
