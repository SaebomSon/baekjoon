package baekjoon.practice.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//import java.util.Scanner;



public class level6_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner sc = new Scanner(System.in);
//		
//		int test = sc.nextInt();
//		
//		String[] testarr = new String[test];
//		
//		
//		for(int i = 0; i < testarr.length; i++) {
//			testarr[i] = sc.next();
//		}
//		sc.close();
//		
//		for(int i = 0; i < testarr.length; i++) {
//			int count = 0;
//			int sum = 0;
//			
//			for(int j = 0; j < testarr[i].length(); j++) {
//				if(testarr[i].charAt(j) == 'O') {
//					count++;
//				}else {
//					count = 0;
//				}
//				sum += count;
//			}
//			System.out.println(sum);
//		}	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int totalcase = Integer.parseInt(br.readLine());
		int[] arr;
		StringTokenizer st;
		
		for(int i = 0; i < totalcase; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int student = Integer.parseInt(st.nextToken());
			arr = new int[student];
			double sum = 0.0;
			
			for(int j = 0; j < student; j++) {
				int score = Integer.parseInt(st.nextToken());
				arr[j] = score;
				sum += score;
			}
			double avg = sum / student;
			
			double count = 0;
			for(int j = 0; j < student; j++) {
				if(arr[j] > avg) {
					count++;
				}
				
			}
			
			System.out.printf("%.3f%%\n",(count / student)*100);
			
		}
		
		
		
		
	}

}
