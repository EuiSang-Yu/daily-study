package baekjoon.ex_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q_2438 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 문제 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		 * 
		 * 입력 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		 * 
		 * 출력 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		 * 
		 * 예제 입력 1 5 예제 출력 1
		 *
		 **
		 ***
		 ****
		 *****
		 * 
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
