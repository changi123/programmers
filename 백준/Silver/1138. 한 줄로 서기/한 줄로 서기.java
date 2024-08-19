import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		
		int [] arr = new int[N+1];
		
		List<Integer> list = new ArrayList();
		
		for(int i= 1 ; i <= N; i++) {
			arr[i]= Integer.parseInt(sc.next());
		}
		
		for(int i = N ; i>=1 ; i--) {
			list.add(arr[i], i);
		}
		
		for(int i = 0 ; i < list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
