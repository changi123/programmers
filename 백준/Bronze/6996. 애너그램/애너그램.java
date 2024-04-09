import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Main {

    private static boolean solveAnagrams(String first, String second ) {
        /* ------------------- INSERT CODE HERE --------------------
         *
         * Your code should return true if the two strings are anagrams of each other.
         *
         * */

        return false;

        /* -------------------- END OF INSERTION --------------------*/
    }

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);

		int n= Integer.parseInt(sc.next());
		boolean flag = true;
		for(int i= 0 ; i < n ; i++) {
			String a = sc.next();
			String b = sc.next();
			StringBuilder sb = new StringBuilder();
			char [] aArr = a.toCharArray();
			char [] bArr = b.toCharArray();
			
			if( check(aArr,bArr) ) {
				sb.append(a+" & "+b+" are anagrams.");
			}else {
				sb.append(a+" & "+b+" are NOT anagrams.");
			}

			System.out.println(sb.toString());
	        }
		}
  public static boolean check(char [] aArr , char [] bArr) {
		if( aArr.length != bArr.length) {
			return false;
		}
		Arrays.sort(aArr);
		Arrays.sort(bArr);
		for(int i= 0 ; i< aArr.length;i++) {
			if( aArr[i] != bArr[i]) {
				return false;
			}
		}
		
		return true; 
	}
}
