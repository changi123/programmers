import java.util.*;


public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
		String s = sc.next();

		Set<String> set = new HashSet();
		
		for(int i = 0 ; i <s.length() ; i++) {
			
			for(int j = i+1 ; j <=s.length();j++) {
				set.add (s.substring(i,j));
				
			}
		}
		System.out.println(set.size());
	}
	//public static String check(int index , int index2, String[] arr) {
	//	StringBuilder sb = new StringBuilder();
	//	for(int i = index ; i<= index2;  i++) {
	//		sb.append(arr[i]);
	//	}
	//	return sb.toString();
	//}
	
	
	
}
