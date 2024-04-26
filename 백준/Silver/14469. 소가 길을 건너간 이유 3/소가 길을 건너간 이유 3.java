import java.util.*;


public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int [][] arr = new int[n][2];
		sc.nextLine();
		for(int i= 0 ; i < n ; i++) {
			String s = sc.nextLine();
			String [] sr = s.split(" ");
			arr[i][0] = Integer.parseInt(sr[0]);
			arr[i][1] = Integer.parseInt(sr[1]);
		}

		Arrays.sort(arr, (a1,a2)->a1[0]-a2[0]);
		int check = 0 ;
		for(int i= 0 ; i < arr.length;i++) {
			if( arr[i][0] >= check) {
				check = arr[i][0]+arr[i][1] ;
			}else {
				check+=arr[i][1];
			}

		}

		System.out.println(check);
	}

}
