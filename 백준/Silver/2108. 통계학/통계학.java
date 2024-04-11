import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int n= Integer.parseInt(sc.next());
		double sum = 0 ; 
		int [] arr = new int[n];
		TreeMap<Integer,Integer> map = new TreeMap();
		ArrayList<Integer> list = new ArrayList();
		for(int i= 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(sc.next());
			
			if( !map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				int cnt = map.get(arr[i]);
				map.replace(arr[i], ++cnt);
			}
			
			sum+=arr[i];
		}
		
		// 최빈값 어렵다 ...
		
		
		
		
		for(int num : map.keySet()) {
			list.add(map.get(num));
		}
		
		list.sort(null);
		
		int cnt = 0 ;
		int a = 0; // 최빈값
		int lotNum = list.get(list.size()-1);
//		System.out.println(map.toString());
//		System.out.println(list);
		boolean flag = true;
		if( list.size() >1) {			
			if( list.get(list.size()-1) == list.get(list.size()-2)) {
				flag = false;
			}
		}
		for(int num : map.keySet()) {
			if( lotNum == map.get(num)) {
				if( cnt == 1) {
					a = num ; 
					break;
				}
				if( flag) {
					a = num;
					break;
				}else {
					cnt++;
				}
				
			}
		}
		
	 
		Arrays.sort(arr);
		System.out.println(Math.round(sum/n)); 
		System.out.println(arr[arr.length/2]);
		System.out.println(a);
		
		System.out.println(arr[arr.length-1]-arr[0]);
	}

}
