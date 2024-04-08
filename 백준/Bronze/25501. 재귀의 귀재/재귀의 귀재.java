import java.util.*;


public class Main {
	static int [][] arr ;
	static int cnt  ; 
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		int n= Integer.parseInt(sc.next());
		arr = new int[n][1];
		for(int i= 0 ; i < n ; i++) {
			cnt = 0 ;
			String s=  sc.next();
			System.out.println(isPalindrome(s)+" "+ cnt);
		}
	}
    public static int recursion(String s, int l, int r){
    	cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
    	
        return recursion(s, 0, s.length()-1);
    }
}
