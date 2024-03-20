import java.util.*;


public class Main {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		String [] arr = sc.next().split("");
		int sum = 0 ;
		
		for(int i= 0 ; i < arr.length ; i++) {
			sum+= Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);
				
	}

}
