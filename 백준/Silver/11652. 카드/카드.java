import java.util.*;


public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		TreeMap<Long,Integer> tm = new TreeMap<>();

		int n = Integer.parseInt(sc.next());
		for(int i = 0  ; i < n ; i++) {
			Long key = Long.parseLong(sc.next());
			if( !tm.containsKey(key)) {
				tm.put(key,  1);
			}else {
				int cnt = tm.get(key);
				tm.put(key, cnt+1);
			}
		}

		int [] arr = new int[tm.size()];
		int index = 0 ;
		for(Long num : tm.keySet()) {
			int cnt = tm.get(num);
			arr[index++] = cnt;
		}

		
		Arrays.sort(arr);
		int maxCnt = arr[arr.length-1];

		for(Long num : tm.keySet()) {
			if( tm.get(num)==maxCnt) {
				System.out.println(num);
				return ;
			}
		}
		
		
	}

}
