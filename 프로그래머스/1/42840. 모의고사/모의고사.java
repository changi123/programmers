import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] answers) {
	
		int[] std1 = { 1, 2, 3, 4, 5 };
		int[] std2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] std3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		List<Integer> list = new ArrayList();
		List<Integer> list2 = new ArrayList();

		int[] cnt = new int[3];

		// 학생 각각 맞은 개수 확인
		for (int i = 0; i < answers.length; i++) {
			if (std1[i % std1.length] == answers[i]) {
				cnt[0]++;
			}
			if (std2[i % std2.length] == answers[i]) {
				cnt[1]++;
			}
			if (std3[i % std3.length] == answers[i]) {
				cnt[2]++;
			}
		}

		for (int i = 0; i < cnt.length; i++) {
			list.add(cnt[i]);
			list2.add(cnt[i]);
		}
		list.sort(Collections.reverseOrder());
		int max = (int) list.get(0);
		int check = 0;
		// 리스트에서 최대점수 (동점) 이 몇명인지 확인
		for (int i = 0; i < cnt.length; i++) {
			if (list.contains(max)) {
				list.remove(0);
				check++; // 1
			} else {
				break;
			}
		}
		// check == 1이면 한명
		// check == 2 이명 두명
		/// check 가 3이면 다 똑같음
		int[] answer = new int[check];
		if (check == 1) {
			// 한명이라면 최대점수 가진 한명
			for (int i = 0; i < list2.size(); i++) {
				if (list2.get(i) == max) {
					answer[0] = i + 1;
					break;
				}
			}
		} else if (check == 2) {
			// 두명이라면 앞에 한명 뒤에 한명
			answer[0] = list2.indexOf(max) + 1;
			answer[1] = list2.lastIndexOf(max) + 1;
		} else {
			// 세명이라면 전부
			answer[0] = 1;
			answer[1] = 2;
			answer[2] = 3;
		}
		return answer;
    }
}