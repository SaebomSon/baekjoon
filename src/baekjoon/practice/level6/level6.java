package baekjoon.practice.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

public class level6 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		int max = 0;
//		int idx = 0;
//		
//		for(int i = 0; i < 9; i++) {
//			int val = Integer.parseInt(br.readLine());
//
//			if(val > max) {
//				max = val;
//				idx = i+1;
//				
//				System.out.println("1 >>" + i);
//				System.out.println("1 >> " + idx);
//			}
//			System.out.println("2 >>" + i);
//			System.out.println("2 >> " + idx);
//		}
//		
//		System.out.println(max);
//		System.out.println(idx);
		
//		Scanner sc = new Scanner(System.in);
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		//0~9까지 담을 배열
//		int[] count = new int[10];
//		
//		int arr = 0;
//		String num = String.valueOf(a*b*c);
//		
//		for(int i = 0; i < num.length(); i++) {
//			arr = (num.charAt(i) - '0');
//			count[arr]++;
//		}
//		
//		for(int k : count) {
//			System.out.println(k);
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		// 입력 받을 배열
//		int[] arr = new int[10];
//		
//		// 나머지를 담을 배열
//		int[] count = new int[42];
//		
//		// 나머지 개수
//		int different = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			count[arr[i] % 42]++;
//		}
//		
//		for(int i = 0; i < count.length; i++) {
//			if(count[i] != 0) different++;
//		}
//		System.out.println(different);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		double max = 0.0;
		double total = 0;
		double[] arr = new double[count];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			if(arr[i] > max) max = arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / max * 100;
			total += arr[i];
		}
		double avg = total / count;
		System.out.println(avg);
		
		
		
		
		
		
		
		
		
		
		
	}

}
