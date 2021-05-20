package baekjoon.practice.level1;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
//		int[] array;
//		int[][] commands;
//		
//		array = new int[] {1, 5, 2, 6, 3, 7, 4};
//		commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//		
//		int[] answer = new int[commands.length];
//		
//		for(int i = 0; i < commands.length; i++) {
////			int[] tmp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
////			Arrays.sort(tmp);
////			answer[i] = tmp[commands[i][2]-1];
//			int start = commands[i][0]-1;
//			int end = commands[i][1]-1;
//			int k = commands[i][2];
//			
//			int[] temp = new int[end-start];
//			System.out.println(temp[i]);
//			
//		}

		int[] numbers = new int[] { 6, 10, 2 };
		String ranStr = "";
		int count = 0;
		int tmp = 0;
		int random = 0;
//		random = (int)(Math.random() * numbers.length);
		
		for(int i = 1; i < numbers.length; i++) {
			i = (int)(Math.random() * numbers.length);
			System.out.println(numbers[i]);
		}
		
//		int num;
//		int max = 0;
//		int a = numbers.length * (numbers.length-1) * (numbers.length-2);
//		int[] tmparr = new int[a];
//		for(int i = 0; i < numbers.length; i++) {
//			ranStr += numbers[i];
//			num = Integer.parseInt(ranStr);
//			
//			tmparr[i] = num;
////			System.out.println(tmparr[i]);
//
//			if(num > max) max = num;
//		}
//		System.out.println(max);
////		System.out.println(ranStr);

	}

}
