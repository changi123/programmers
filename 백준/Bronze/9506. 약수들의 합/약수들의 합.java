import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = Integer.parseInt(sc.next());			
			if( num == -1) {
				break;
			}
			
			ArrayList<Integer> list = new ArrayList();
			int sum = 0 ;
			for(int i= 1 ; i < num ;i++) {
				if( i == 1 ) {
					System.out.print(num);
				}
				
				if( num % i == 0) {
					sum+=i;
					list.add(i);
				}
			}
			
			list.sort(null);
			if( sum == num) {
				for(int i = 0 ; i < list.size(); i++) {
					if( i == 0 ) {						
						System.out.print(" = "+ list.get(0));
					} else {
						System.out.print(" + "+ list.get(i));						
					}
				}
				
				System.out.println();
			} else {
				System.out.println(" is NOT perfect.");
			}
			
			
		}
	}

}
