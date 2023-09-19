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

//	int a = 0;
//	for(int i= arr2.length-1 ; i >= 0;i--) {
//		if(arr2[i]!=0) {
//			a= i ;
//			break;
//		}
//	}
//	int b = 0;
//	for(int i= arr3.length-1 ; i >= 0;i--) {
//		if(arr3[i]!=0) {
//			b= i ;
//			break;
//		}
//	}
	
	for (int i = 0; i < arr2.length; i++) {
		if (arr2[i] >= arr3[i]) {
			arr4[i] = arr3[i];
		} else {
			arr4[i] = arr2[i];
		}
		
//		for (int j = 0; j < arr4[i]; j++) {
//			if (arr4[i] != 0) {
//
//				list.add(i);
//			}
//		}

	}

	
//	list.sort(Collections.reverseOrder());
	int index = 0;
	for(int i = arr4.length-1 ; i>=0 ; i--) {
		if(arr4[i] !=  0) {
			index = i;
			break;
		}
	}
	
	for(int i = index  ;i >=0; i--) {
		
		for(int j = 0; j <arr4[i] ; j++) {
			list.add(i);
			if (list.get(0) == 0) {
				return answer.append("0").toString();
			}
		}
	}
	if (list.size() == 0) {
		return answer.append("-1").toString();
	} 
//	else if (list.get(0) == 0) {
//		return answer+="0";
//	}
	else {
		for(int i= 0 ; i <list.size();i++) {
			answer.append(list.get(i));
		}
	}
	
	
	

//	for (int i = 0; i < arr4.length; i++) {
//
//		for (int j = 0; j < arr4[i]; j++) {
//			if (arr4[i] != 0) {
//
//				list.add(i);
//
//			}
//		}
//	}

//	list.sort(Collections.reverseOrder());

	
//	if (list.size() == 0) {
//		return answer += "-1";
//	}
//	for (int i = 0; i < list.size(); i++) {
//		if (i == 0 && list.get(i) == 0) {
//			return answer += "0";
//		}
//		answer += Integer.toString(list.get(i));
//	}	
	
//	String zero = ""; 
//	
//	for(int i = 0 ; i<arr4[0] ; i++) {
//		zero+="0";
//	}
	
//	for(int i= list.size()-1; i >= 0 ;i--) {
//		if( list.get(list.size()-1) == 0  ) {
//			return answer = "0";
//		}else if( list.get(i)==0){
//			break;
//		}
//		answer+=Integer.toString(list.get(i)) ;
//	
//		
//	}
	
	

	return answer.toString();
    }
}