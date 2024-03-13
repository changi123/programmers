import java.util.*;


public class Main {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
		int money = 1000 - Integer.parseInt(sc.next());


		int cnt  = 0;

		cnt  += money /500 ; 
		money = money % 500;
	
		cnt  += money /100 ; 
		money = money % 100;

		cnt  += money /50 ; 
		money = money % 50;
		
		cnt  += money /10 ; 
		money = money % 10;
		

		cnt  += money /5 ; 
		money = money % 5;
		
		cnt  += money /1 ; 
		money = money % 1;


		
		System.out.println(cnt);
	}

}
