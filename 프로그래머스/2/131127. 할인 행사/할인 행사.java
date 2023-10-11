import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
 int answer = 0;
		   List<String> slist = Arrays.asList(want);
	
		   aa: for(int i= 0  ; i < discount.length;i++) {
			   int [] comNum = new int [number.length];
			   String s = "";			   
			   if( 10+ i > discount.length) {
				   for(int j = i; j< discount.length ; j++) {
						  
					   s+= discount[j] + ",";
				   }
				   continue;
			   } else {
				   for(int j = i; j< 10+i ; j++) {
					   
					   s+= discount[j] + ",";
				   }
				   
			   }
			   
			   
			   ///chicken,apple,apple,banana,rice,apple,pork,banana,pork,rice
			   String [] srr = s.split(",");
			   List<String> srrList = new ArrayList<String>();
			   for(int j= 0 ; j <srr.length;j++) { 
				   srrList.add(srr[j]);
			   }
			   
			   
			   List<String> wantList = new ArrayList<String>();
			   int index = 0 ;
			   for(int j = 0 ; j<number.length;j++) {
				   
				   for(int k = 0; k <number[j];k++) {
					   wantList.add(want[index]);
				   }
				   index++;
				   
			   }
			   
			   // wantList [banana, banana, banana, apple, apple, rice, rice, pork, pork, pot]
			   
			   // srr = [chicken, apple, apple, banana, rice, apple, pork, banana, pork, rice]
			   // srrList = [chicken, apple, apple, banana, rice, apple, pork, banana, pork, rice]
			   // slist = [banana, apple, rice, pork, pot]
			   
			   for(int j = 0 ; j<want.length;j++) {
				   
				   for(int k = 0 ; k <srrList.size();k++) {
					   if(srrList.get(k).equals(want[j])) {
						   comNum[slist.indexOf(slist.get(j))]++;
						   
					   }
				   }
			   }
			   
			   for(int j = 0 ;  j < number.length;j++) {
				   if( number[j] > comNum[j]) {
					   continue aa;
				   } 
				   
			   }
			   
			   answer++;

		   }
		   return answer;
    }
}