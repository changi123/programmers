import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String x = Integer.toString(a);
        String y = Integer.toString(b);
        
        System.out.println(x+" + "+y+" = "+(a+b));
    }
}