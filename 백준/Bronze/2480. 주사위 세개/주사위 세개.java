	import java.util.Scanner;
	
	/**
	 * @author hong
	 * @data 2023. 1. 29. - 오후 2:47:56
	 * @subject
	 * @content
	 *
	 */
	public class Main {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int a= sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			
			int win ;
			
			if(a==b && b==c) {
				win = 10000+(a*1000);
				System.out.println(win);
			}
			
			if(a==b && b!=c) {
				win = 1000+(a*100);
				System.out.println(win);
			}else if(b==c && a!=c) {
				win = 1000+(b*100);
				System.out.println(win);	
			}else if(a==c && b!=c){
				win = 1000+(c*100);
				System.out.println(win);	
			}
			
			
			if(a!=b && a!=c && b!=c) {
				if(a>b && a>c) {
					win = a*100;
					System.out.println(win);	
				}else if (b>a && b>c){
					win = b*100;
					System.out.println(win);	
				}else if(c>a && c>b){
					win = c*100;
					System.out.println(win);	
				}
			}
			
			}
	
	}