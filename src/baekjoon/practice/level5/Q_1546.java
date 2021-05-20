package baekjoon.practice.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// title : ЦђБе
public class Q_1546 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		double max = 0;
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
