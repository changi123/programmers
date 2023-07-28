class Solution {
    public String solution(String phone_number) {
               String answer = "";
        
        int num = phone_number.length()-4;
        
       
        
        for(int i= 0; i < phone_number.length(); i++) {
        	if(num == i ) {
        		break;
        	}
        	
        	String a  = "";
        	a = a+ phone_number.charAt(i);
        	phone_number = phone_number.replaceFirst(a, "*");
        }
        
        return phone_number;
    }
}