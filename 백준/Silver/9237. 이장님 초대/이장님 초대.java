import java.util.*;


public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		Integer [] arr = new Integer[t];
		for(int i= 0 ; i <t ; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		int max = 0 ;
		for(int i = 0 ; i<arr.length;i++) {
			max = Math.max(max, arr[i] + i + 1);
		}
		
		System.out.println(max+1);

	}

}
