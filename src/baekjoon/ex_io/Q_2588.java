package baekjoon.ex_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2588 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		문제
		
		(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
		
		
		
		(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		
		입력
		첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
		
		출력
		첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
		
		예제 입력 1 
		472
		385
		예제 출력 1 
		2360
		3776
		1416
		181720
		 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int [] arr = new int[2];
		
		arr[0] = Integer.parseInt(str1);
		arr[1] = Integer.parseInt(str2);
				
		int n1 = arr[0];
		int n2 = arr[1];
		
		int [] result = new int[4];
		result[0] = n1 * (n2%10); // 472*5
		result[1] = n1 * ((n2%100)/10); // 472*8
		result[2] = n1 * (n2/100); // 472*3
		result[3] = n1 * n2;
		
		for(int i=0; i<4; i++) {
			System.out.println(result[i]);
		}
		
	}

}
