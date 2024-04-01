import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int [] arr = new int[26];

		for(int i= 0 ; i < s.length();i++) {
			arr[s.charAt(i)-'A']++;
		}
		int cnt = 0 ;
		int num = 0;
		for(int i= 0 ; i < arr.length;i++) {
			if( arr[i] % 2 !=0) {
				cnt++;
				num = i ; 
			}
			if( cnt >=2) {
				System.out.println("I'm Sorry Hansoo");
				return ;
			}
		}
		  StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i] / 2; j++) {
                sb.append((char)(i+'A'));
            }
        }
        String result = sb.toString();
        if (cnt == 1) {
            result += (char) (num + 'A');
        }
        result += sb.reverse().toString();
        System.out.println(result);
	}

}
