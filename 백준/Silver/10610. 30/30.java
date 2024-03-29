import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		StringBuilder s= new StringBuilder( sc.next());
		
		String [] arr = s.toString().split("");
		Long [] arrLong = new Long [arr.length] ;
		Long l = (long) 0 ; 
		for(int i= 0 ; i < arr.length ; i ++) {
			l+= Long.parseLong(arr[i]);
			arrLong[i] = Long.parseLong(arr[i]);
		}
		
		
		Arrays.sort(arrLong);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = arrLong.length-1 ; i>=0 ; i--) {
			sb.append(Long.toString(arrLong[i]));
		}

		if( l % 3 == 0 && sb.charAt(sb.length()-1) == '0') {
			System.out.println(sb.toString());
		}else {
			System.out.println(-1);
		}
		
		

		


	}

}
