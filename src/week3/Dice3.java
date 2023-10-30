package week3;

import java.util.Arrays;


public class Dice3 {
	/*
	 * 주사위 4개 1. 4개 모두 P인 경우 1111*p 2. 3개가 p, 1개 q 인경우 (10 * p + q)^ 3. 2개가 p, 2개 q
	 * 인경우 (p + q) * |p-q| 4. 2개 p, 1개 q, 1개 r인 경우 Q*r 5. 다 다른경우 가장 작은 수
	 */

	public static void main(String[] args) {
		int p = 6;
		int q = 3;
		int r = 3;
		int e = 3;
		
		System.out.println();
		
	}

	public int dice(int p, int q, int r, int e) {
		
	
		int answer = 0;
		if (p == q && q == r && r == e) {// 1번
			return answer = 1111 * p;
		
		} else if (p == r && p == e && p != q) { // 2번
			return answer = (10 * p + q) * (10 * p + q);

		} else if ((p == r && q == e) || (p == e && q == r)) {// 3번
			return answer = (p + q) * Math.abs(p - q);
			
		} else if (p == q && p != r && p != e) {
			return answer = e * r;

		} else if (p == r && p != q && p != e) {
			return answer = q * e;
			
		} else if (p == e && p != q && p != r) {
			return answer = q * r;
			
		} else {
			int array[] = { p, q, r, e };
			int min = array[0];
			Arrays.sort(array);
			return answer = min;
		}

	}
}
