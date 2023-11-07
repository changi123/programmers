import java.util.*;
import java.io.*;


class Solution {
    public String solution(String s) {
    	String answer = "";
		ArrayList<Integer> list = new ArrayList();

		// 공백 기준으로 a 배열에 넣기
		String[] a = s.split(" ");
		int[] arr = new int[a.length];
		// 배열에 각 값 넣고 리스트에 넣기
		for (int i = 0; i < a.length; i++) {
			list.add(Integer.parseInt(a[i]));
		}
		list.sort(null);
		answer += Integer.toString( list.get(0))+" " +Integer.toString( list.get(list.size() - 1));
		return answer;
    }
}