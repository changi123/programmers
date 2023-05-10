class Solution {
    public String solution(String s) {
  	     String answer = "";
	        int lastIndex = s.length()-1;
	        int cnt = 0;
	        while(s.charAt(lastIndex) == ' ') {
	        	if(s.charAt(lastIndex) == ' ') {   
	        		cnt++;
	        	}
	        	lastIndex --;
	        	
	        	if(s.charAt(lastIndex)!= ' ') {
	        		break;
	        		
	        	}
	        		
	        	
	        }
	        
	        String [] sr = s.split(" ");
	        
	        String [] sr2 = new String [sr.length+cnt];
	        
	        for(int i= 0 ; i< sr2.length;i++) {
	        	if(i>sr.length-1) {
	        		sr2[i] = " ";
	        		continue;
	        		
	        	} else if(sr[i].equals("")) {
	        		sr2[i] = " "
	        				+ "";
	        		continue;
	        	} else
	        	sr2[i] = sr[i];
	        }

	        for(int i= 0; i< sr2.length;i++) {
	        	String fir= "";
	        	String change = "";
	        	
	        	fir+=sr2[i].charAt(0);
	        	change += Character.toUpperCase(sr2[i].charAt(0));
	        	// 첫번째  알파벳 대문자로 바꾼 것 change
	        	
//	        	fir += Character.toUpperCase(sr[i].charAt(0));
	        	
	        
	        	sr2[i] = sr2[i].replaceFirst(fir, change);
	        	
	        	for(int j = 1; j<sr2[i].length();j++) {
	        	
	        	change += Character.toLowerCase(sr2[i].charAt(j));
	        	
	        	
	        	
	      
	        	
	        	}
	        	sr2[i] = change ;
	        	
	        	

	        }
	        
	        
	        
//			[A A A A A A A A A  A ]
//	        [3people, Unfollowed, Me]
	        for(int i= 0; i<sr2.length;i++) {
	        	if(i==sr2.length-1 && sr2[i].equals(" ")) {
	        	
	        		
	        		break;
	        	}
	        	if(sr2[i].equals(" ")) {
	        		answer+=sr2[i];
	        		continue;
	        	} else if(i==sr2.length-1 && !(sr2[i].equals(" "))) {
	        		answer+=sr2[i];
	        		break;
	        		
	        		
	        	}
	        	answer+=sr2[i]+ " ";

	        }
	        return answer;
    }
}