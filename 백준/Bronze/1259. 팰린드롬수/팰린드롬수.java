import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);


		while(sc.hasNextLine()) {
			String s= sc.next();

			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();

			if( s.equals("0")) {
				break;
			}
			if( s.length() % 2 ==0) { // 짝수				
				int index = s.length() /2 -1;
				for(int i= 0 ; i < s.length();i++) {
					if( i<=index) {
						sb1.append(s.charAt(i));
					} else {
						sb2.append(s.charAt(i));
					}

				}


				//				System.out.println(sb1.toString());
				//				System.out.println(sb2.reverse().toString());
				if( sb1.toString().equals(sb2.reverse().toString())) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}

			}else if( s.length() % 2 ==1){
				int index = s.length() /2 ;
				for(int i= 0 ; i < s.length();i++) {
					if( i<index) {
						sb1.append(s.charAt(i));
					} else if ( i>index) {
						sb2.append(s.charAt(i));
					}

				}


				//				System.out.println(sb1.toString());
				//				System.out.println(sb2.reverse().toString());
				if( sb1.toString().equals(sb2.reverse().toString())) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}

			}
		}
	}

}
