import java.util.*;


public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        for(int i= 0 ;  i < 5 ; i++){
            int num = Integer.parseInt(sc.next());
            if( num < 40 ){
                sum+= 40;
            } else{
                sum+= num;
            }
               
        }
        
        System.out.println(sum / 5 );
        
        
	}

}
