package baekjoon.practice.level1;

public class practice1 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int k = 5;	//�ݺ��� ��
		int n = 0;	//value��
		int s = 1;	//������ ��
		
		int i = 0;	//��
		int j = -1;	//��
		
		
		while(k > 0) {
			for(int p = 0; p < k; p++) {
				n++;
				j+=s;
				arr[i][j] = n;
				
			}
			k--;
			
			if(k < 0) break;
			
			for(int p = 0; p < k; p++) {
				n++;
				i+=s;
				arr[i][j] = n;
			}
			s *= -1;
		}
		
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr[x].length; y++) {
				System.out.print(arr[x][y] + "\t");
			}
			System.out.println();
		}
		
	}

}
