import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
			
		ArrayList<Integer> list = new ArrayList();
		for(int i= 0 ; i < n ; i++) {
			int num = Integer.parseInt(sc.next());
			if( !list.contains(num)) list.add(num); 
		}
		list.sort(null);
		StringBuilder sb = new StringBuilder();
		for(int num : list) {
			sb.append(num+" ");
		}
		
		System.out.println(sb.toString());
	}

}
