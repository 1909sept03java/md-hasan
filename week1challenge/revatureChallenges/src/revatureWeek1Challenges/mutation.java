package revatureWeek1Challenges;

import java.util.ArrayList;

public class mutation {
	
		public static int count=0;
		
		public static void main(String[] args) {

			
			ArrayList<String> bank= new ArrayList<String>();
			bank.add("AABBCCDD");
			bank.add("ABBCCBCD");
			bank.add("ABBCCBCC");
			bank.add("ABDCCBCD");
			String starts="AABBCCDD";
			String ends="ABDCCBCD";
			int num=geneMutation(starts,ends,bank);
			System.out.println("Mutation: "+count);
			if(num==1) 
				System.out.println("Valid mutation");
			else
			System.out.println("Invalid Mutation");
			
			
		}
		
		
		public static int geneMutation(String starts, String ends, ArrayList<String> bank) {
			
			if(starts.length()!=8) return -1;
			if(ends.length()!=8)return -1;
			
			for(int j=0;j<starts.length();j++) { //check each letter of starts and ends String
				
				if( starts.charAt(j)!=(ends.charAt(j))) count++ ;
						
			}
			for(int i=0;i<bank.size();i++) { //
		
				if(starts.equals(ends))return 0;
				if(ends.equals(bank.get(i))) return 1 ;				
		}
		
		return 0;	
			
		}

	}




