import java.util.*;
import java.io.*;



class Solution {
    public int solution(int k, int m, int[] score) {
			int answer = 0;

		// 1, 2 3 / 4 5 6 / 7 8 9 / 10 11 12 /
		// 길이 / m
		// p == 가장 낮은 점수
		// m == 한 상자에 담을 사과 수
		// 한 상자의 가격 = p*m
		// 내림차순으로 정렬하고 m 개 만큼 뽑아보자
		// [4, 4, 4 /, 4, 4, 4 /, 2, 2, 2 / , 2, 1, 1]

		// 상자 수 = 길이 / m
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < score.length; i++) {
			list.add(score[i]);
		}
		list.sort(Collections.reverseOrder());
		// 한상자당 사과수 
		int one = m;
		// p*m
		// m개씩 잘랐으니까 길이만큼 상자 나온다
		while (m <= score.length) {
			// 자른 거 각각 끝에 최저점수
			int rowsc = (int) list.get(m - 1);
			// 최대이익 중첩
			answer = answer + (rowsc * one);
			m += one;
		}
		return answer;
}
}