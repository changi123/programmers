import java.util.*;


public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		sc.nextLine();
		for(int i= 0 ; i < n ; i++) {
			
			String s = sc.nextLine();
			String [] sr = s.split(" ");
			
			double d = 0.00;
			
			for(int j= 0 ; j <sr.length;j++) {
				if( j == 0 ) {
					d+=Double.parseDouble(sr[j]);
					continue;
				}
				if( sr[j].equals("@")) {
					d *= 3;
				} else if( sr[j].equals("%")) {
					d+= 5;
				}else if( sr[j].equals("#")) {
					d-=7;
				}
			}
			
			String ds = Double.toString(d+.001);
			int index = ds.indexOf(".");
			
			System.out.println(ds.substring(0,index+3));
			
			
			
		}
			
	}

}
