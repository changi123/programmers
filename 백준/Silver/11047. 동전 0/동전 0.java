import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int [] arr = new int[N];
		ArrayList<Integer> list = new ArrayList<>();
		for(int i= 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(sc.next());
			if( K -arr[i]  >= 0 ) {
				list.add(arr[i]);
			}
		}
		

		list.sort(Collections.reverseOrder());
		

		int cnt = 0 ;
		
		
		for(int i= 0; i < list.size();i++) {
			cnt += K / list.get(i);
			K = K% list.get(i);
			
		}
		
		System.out.println(cnt);
	}

}
