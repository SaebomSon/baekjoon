package baekjoon.practice.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// title : »ó¼ö
public class Q_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
        String num1 = st.nextToken();
        String num2 = st.nextToken();
        sb1.append(new StringBuilder(num1).reverse().toString());
        sb2.append(new StringBuilder(num2).reverse().toString());

        int num3 = Integer.parseInt(sb1 + "");
        int num4 = Integer.parseInt(sb2 + "");
        int max = num3;
        if(max < num4) max = num4;
        else max = num3;
        System.out.println(max);
		
	}
}
