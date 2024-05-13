import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		
		int da = Integer.parseInt(sc.next());
		if( n == 1) {
			System.out.println(0);
			return ;
		}
		int [] arr = new int[n-1];
		for(int i= 0 ; i < arr.length;i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		int cnt = 0;
		while(true) {
			Arrays.sort(arr);
			if( arr[arr.length-1] < da) {
				System.out.println(cnt);
				return ;
			} else {
				da++;
				arr[arr.length-1]-=1;
				cnt++;
			}
		}
	}

}
