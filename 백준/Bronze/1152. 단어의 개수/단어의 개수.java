import java.util.*;


public class Main {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String [] arr = sc.nextLine().split(" ");
		int cnt = 0 ;
		if( arr.length == 0) {
			System.out.println(0);
			return;
		}
		if( arr[0].equals("") ) {
			cnt++;
		} 
		if( arr[arr.length-1].equals("") ) {
			cnt++;
		} 
		System.out.println(arr.length-cnt);
	}

}
