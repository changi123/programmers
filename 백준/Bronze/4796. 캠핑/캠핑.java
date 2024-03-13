import java.util.*;


public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int i = 1 ;
	    while(true) {
	    	int L = Integer.parseInt(sc.next());
	    	int P = Integer.parseInt(sc.next());
	    	int V = Integer.parseInt(sc.next());
	    	
	    	
	    	if( L == 0 && P == 0 && V == 0) {
	    		break;
	    	}
	    	
	    	
	    	int a = (V/P) *L;
	    	if( V % P >L) {
	    		System.out.println("Case "+i+": "+ ( a+L));
	    	}else {
	    		System.out.println("Case "+i+": "+ ( a + V%P));
	    		
	    	}
	    	
	    	i++;
	    	
	    }
	}

}
