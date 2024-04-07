import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<Character> st = new Stack();
		StringBuilder sb = new StringBuilder();
		boolean sbFlag = false;

		char c ='a';
		for(int i= 0 ; i < s.length(); i++) {
			if( s.charAt(i) == '<') {
				while(!st.isEmpty()) {
					System.out.print(st.pop());
				}

				sbFlag = true;
				sb.append(s.charAt(i));
				continue;
			}else if( s.charAt(i) == '>' && sbFlag ==true) {
				sb.append(s.charAt(i));
				System.out.print(sb.toString());
				sb.delete(0,sb.length());
				sbFlag = false;
				continue;
			} 

			if( sbFlag ) {
				sb.append(s.charAt(i));
			} else{

				st.push(s.charAt(i));
				if( s.charAt(i) == ' ' || i == s.length()-1) {
					while(!st.isEmpty()) {
						if(st.peek() == ' ') {
							st.pop();
							continue;
						}
						System.out.print(st.pop());
					}
					System.out.print(' ');

				}

			} 



		}

		}
	}

