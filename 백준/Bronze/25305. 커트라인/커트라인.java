import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int [] arr = new int[n];
		
		for(int i =  0 ; i < n; i ++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(arr);
		
		
		System.out.println(arr[arr.length-k]);
	}

}
