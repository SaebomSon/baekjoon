package baekjoon.practice.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// ū ?? A+B
public class Q_10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BigInteger bi1 = new BigInteger(st.nextToken());
		BigInteger bi2 = new BigInteger(st.nextToken());
		
		bi1 = bi1.add(bi2);
		
		System.out.println(bi1.toString());
		
	}
}
