import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc=  new Scanner(System.in);
		int n  = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int [][] arr = new int[m][2];
		
		for(int i= 0 ; i < arr.length; i++) {
			arr[i][1] = Integer.parseInt(sc.next());
		}
		
		for(int i= 0 ; i <arr.length;i++) {
			int num = arr[i][1];
			int sum = 0 ;
			int cnt = 0 ; 
			for(int j = 0 ; j < arr.length;j++) {
				if( cnt == n ) {
					break;
				}
				if(arr[j][1] >=num) {
					sum+=num;
					cnt++;
				}
			}
			
			arr[i][0] = sum;
			
		}
		
		Arrays.sort(arr,(a1,a2)-> a1[0]-a2[0]);
		
		System.out.print(arr[arr.length-1][1]+ " "+arr[arr.length-1][0]);
	}

}
