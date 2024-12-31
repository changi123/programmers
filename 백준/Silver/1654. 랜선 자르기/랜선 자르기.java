import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		int [] arr = new int[k];
		for(int i= 0 ; i < arr.length;i++) {
			arr[i] = Integer.parseInt(sc.next());
		}

		Arrays.sort(arr);

		long right = arr[arr.length-1];
		long left = 1;
		long half = 0;

		while(left <= right ) {
			long cnt = 0 ; 
			half = (left+right) / 2; 

			for(int i = 0 ; i <k ; i++ ) {
				cnt+= arr[i] / half;
			}
			
			if( cnt < n ) {
				right = half-1;
			}else {
				left = half+1;
			}
		}
		System.out.println(right);

	}

}
