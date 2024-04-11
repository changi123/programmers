import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		
		Set<Integer> set = new HashSet();
		
		for(int i= 0 ; i < n ; i ++) {
			set.add(Integer.parseInt(sc.next()));
		}
		
		int m = Integer.parseInt(sc.next());
		
		int [] arr = new int[m];
		
		Arrays.sort(arr);
		for(int i= 0 ; i < m ; i++) {
			int num = Integer.parseInt(sc.next());
			if( set.contains(num)) {
				arr[i]++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int num : arr) {
			sb.append(num+" ");
		}
		
		System.out.println(sb.toString());
	}

}
