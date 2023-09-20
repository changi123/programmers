import java.util.*;

class Solution {
    public String solution(String X, String Y) {
		StringBuilder answer = new StringBuilder();

//char [] arr = {'0','1','2','3','4','5','6','7','8','9'};
		List<Integer> list = new ArrayList<Integer>();
		int[] arr2 = new int[10];
		int[] arr3 = new int[10];
		int[] arr4 = new int[10];
		for (int i = 0; i < X.length(); i++) {
			String index = X.charAt(i) + "";
			arr2[Integer.parseInt(index)]++;
		}

		for (int i = 0; i < Y.length(); i++) {
			String index = Y.charAt(i) + "";
			arr3[Integer.parseInt(index)]++;
		}

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] >= arr3[i]) {
				arr4[i] = arr3[i];
			} else {
				arr4[i] = arr2[i];
			}

		}

		int index = 0;
		for (int i = arr4.length - 1; i >= 0; i--) {
			if (arr4[i] != 0) {
				index = i;
				break;
			}
		}

		for (int i = index; i >= 0; i--) {

			for (int j = 0; j < arr4[i]; j++) {
				list.add(i);
				if (list.get(0) == 0) {
					return answer.append("0").toString();
				}
			}
		}
		if (list.size() == 0) {
			return answer.append("-1").toString();
		}

		else {
			for (int i = 0; i < list.size(); i++) {
				answer.append(list.get(i));
			}
		}

		return answer.toString();
    }
}
