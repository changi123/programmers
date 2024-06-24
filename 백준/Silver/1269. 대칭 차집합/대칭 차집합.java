import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		HashSet<Integer> h1 = new HashSet<>();
		HashSet<Integer> h2 = new HashSet<>();
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int answer =0 	 ;
		for(int i= 0 ; i < n ; i++) {
			h1.add(Integer.parseInt(sc.next()));
		}
		ArrayList<Integer> list1 = new ArrayList<>(h1);
		for(int i= 0 ; i < m ; i++) {
			h2.add(Integer.parseInt(sc.next()));
		}
		ArrayList<Integer> list2 = new ArrayList<>(h2);
		
		for(int i= 0 ; i < list1.size() ; i++) {
			int num = list1.get(i);
			if( !h2.contains(num)) {
				answer++;
			}
		}
		for(int i= 0 ; i < list2.size() ; i++) {
			int num = list2.get(i);
			if( !h1.contains(num)) {
				answer++;
			}
		}
		
		
		
		System.out.println(answer);
		
	}

}
