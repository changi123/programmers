import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; 
		int [] arr = new int[9]; 
		
		for(int i= 0 ; i <arr.length;i++) {
			arr[i] = Integer.parseInt(sc.next());
			sum+=arr[i];
		}
		
		boolean flag = true;
		for(int i= 0 ; i < arr.length ; i++) {
			int a = arr[i];
			for(int j = i+1  ; j <arr.length;j++) {
				if(  sum -(a+ arr[j]) == 100 )  {
					arr[i] = 0 ;
					arr[j] = 0;
					flag =false;
					break;
				}
				
			}
			if( !flag ) {
				break;
			}
		}
		Arrays.sort(arr);
		for(int i= 0 ; i < arr.length ; i++) {
			if( arr[i]  == 0 ) {
				continue;
			}
			System.out.println(arr[i]);
		}
	}

}
