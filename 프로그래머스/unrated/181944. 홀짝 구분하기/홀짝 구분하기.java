import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s= "";
        if(n % 2 == 0) {
        	s = Integer.toString(n);
        	System.out.println(n+" is even");
        } else {
        	s = Integer.toString(n);
        	System.out.println(n+" is odd");
        }
    }
}