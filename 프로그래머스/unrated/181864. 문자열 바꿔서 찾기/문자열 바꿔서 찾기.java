class Solution {
    public int solution(String myString, String pat) {
       	        int answer = 0;
	        String convert = "";
	        
	        for(int i= 0; i<myString.length() ; i++){
	            if(myString.charAt(i) == 'A'){
	                convert += "B";
	            } else {
	            	convert += "A";
	            }
	        }
	        
	        String s = convert;
	        
	        convert  = convert.replace(pat, "");
	        
	        
	        if(convert.equals(s)) {
	        	return 0;
	        }else {
	        	return 1;
	        }
	        
    }
}