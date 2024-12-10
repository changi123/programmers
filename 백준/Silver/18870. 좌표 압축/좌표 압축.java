import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		
		Integer [] arr = new Integer[n];
		Integer [] sortArr = new Integer[n];
		for(int i = 0 ; i <arr.length; i++) {
			int num = Integer.parseInt(sc.next());
			arr[i] = num;
			sortArr[i] = num;
		}
		
		Arrays.sort(sortArr);
		int cnt = 0 ; 
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i= 0 ; i < arr.length;i++) {
			if( hm.containsKey(sortArr[i] )) {
				int val = hm.get(sortArr[i]);
				int size = hm.size();
				hm.put(sortArr[i], val);
				if( size != hm.size()) {
					cnt++;
				}
			} else {				
				hm.put(sortArr[i], cnt);
				cnt++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i =0 ;  i< arr.length; i++ ) {
			int val = hm.get(arr[i]) ;
			sb.append(val+" ");
		}

		System.out.println(sb.toString());
		
	}

}
