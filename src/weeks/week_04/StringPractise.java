package weeks.week_04;

public class StringPractise {

	public static void main(String[] args) {
		
		
	}

	
		

		
		
	
	

		

		


		
	
		


	
	

		
	

	
	
	
		interview2();
	}
	public static void interview2() {

	}
	
	public static void unluCharacters() {
		String s = "abhsdey";
		int l = s.length();
		
		for (int i=0; i<l; i++) {
			char harf = s.toLowerCase().charAt(i);
			
			if(harf == 'a' || harf == 'e' || harf == 'o' || harf == 'i' || harf == 'u') {
				System.out.println(harf);
			}
			
		}
		public static void sadeceUnsuzler() {
			String s = "academy";
			int l = s.length();
			String result = "";
			
			for(int i=0; i<l; i++) {
				char harf = s.toLowerCase().charAt(i);
				
				if(!(harf == 'a' || harf == 'e' || harf == 'o' || harf == 'i' || harf == 'u')) {
					System.out.println(harf);
					
					isPalindrome();
			}
		}
	}

		public static void isPalindrome() {
			
			removeRepeatedOnes();
		}
		private static void removeRepeatedOnes(String first) {
		
			first = "aarehue";
			String last = "";
			
			for(int i=0; i < first.length(); i++) {
				char ch = first.charAt(i);
				if (last.contains("" + ch) == false) {
					last += ch;
				}
					
				}
			
				System.out.println(last);
			
		}
		
		
		
}