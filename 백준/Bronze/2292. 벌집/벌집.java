import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		if(  n== 1) {
			System.out.println(1);
			return  ;
		}
		int first = 2; 
		int i = 1 ;
		while(true) {
			
			if( first+ ( (6*i) -1) < n  ) {
				first+= (6*i);
				i++;
			} else {
				break;
			}
			
			
		}
		
		System.out.println(i+1);
	}

}
