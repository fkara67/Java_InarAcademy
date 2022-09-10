package weeks.week_04;

public class StringPractise {

	public static void main(String[] args) {
		
		length();
	}

	public static void length() {
		
		String temp = "I love Inar Academy";
		int length = temp.length();
		System.out.println(length);
		
		substring();
	}
	public static void substring() {
		String temp = "Inar Academy";
		String yeni = temp.substring(3,9);
		System.out.println(temp);
		System.out.println(yeni);
		
		equalsIgnoreCase();
	}
	public static void equalsIgnoreCase() {
		String temp = "Inar Academy";
		String temp2 = "inar academy";
		System.out.println(temp.equalsIgnoreCase(temp2));
		
		contains();
	}
	public static void contains( ) {
		String temp = "Inar Academy";
		String temp2 = "Inar";
		System.out.println(temp.contains(temp2));
		
		trim();
	}
	public static void trim() {
		String temp ="  Inar Academy\n";
		System.out.println(temp.trim());
		
		charAt();
	}
	public static void charAt() {
		String temp = "Inar Academy";
		System.out.println(temp.charAt(5));
		
		toLowerCase();
	}
	public static void toLowerCase() {
		String temp = "Inar Academy";
		System.out.println(temp.toLowerCase());
		
		toUpperCase();
	}
	public static void toUpperCase() {
		String temp = "Inar Academy";
		System.out.println(temp.toUpperCase());
	
	interview1();
	}
	public static void interview1() {
	
		int a = -25;
		String b = a + "";
		System.out.println(b);
	
		interview2();
	}
	public static void interview2() {
		String temp = "Java is Fun";
		String result = temp.replace('a','X');
		result = temp.replace('a','X');
		temp.replace('a','X');
		temp.replace('a','X');
		temp.replace('a','X');
		temp.replace('a','X');
		temp.replace('a','X');
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