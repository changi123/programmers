import java.util.*;


public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = Integer.parseInt(sc.next());
        for(int i= 0 ; i < s.length();i++){
            if (i+1 == n ){
                System.out.println(s.charAt(i));
                break;
            }
        }
	}

}
