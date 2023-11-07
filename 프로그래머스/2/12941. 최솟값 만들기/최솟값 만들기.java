import java.util.*;
import java.io.*;
class Solution
{
    public int solution(int []A, int []B)
    {
    int answer = 0;
		// 가장 작은 경우 === 하나는 내림차순 하나는 오름차순 후 각 인덱스 곱하여 더한 것 
		ArrayList<Integer> list1 = new ArrayList();
		ArrayList<Integer> list2 = new ArrayList();

		for (int i = 0; i < A.length; i++) {

			list1.add(A[i]);
			list2.add(B[i]);
		}

		list1.sort(null);// 오름차순
		list2.sort(Collections.reverseOrder()); // 내림차순
		for (int i = 0; i < list1.size(); i++) {
			answer += list1.get(i)*list2.get(i);
		}
		return answer;
    }
}