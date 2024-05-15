import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Double [] d = new Double[n];
		for(int i= 0 ; i < d.length;i++) {
			d[i] = Double.parseDouble(sc.next());
		}
		
		Arrays.sort(d, Collections.reverseOrder());
		
		Double sum = d[0];
		
		for(int i = 1 ; i < d.length;i++) {
			sum+= ( d[i] / 2 ) ;
		}
	    String [] arr = Double.toString(sum).split("") ;
	    
	    if( arr[arr.length-1].equals("0")) {
	    	System.out.println(Math.round(sum));
	    } else {
	    	System.out.println(sum);	    	
	    }
	    
		
	}

}
