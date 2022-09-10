package weeks.week_04;

public class Deneme {

	public static void main(String[] args) {
		System.out.println("Welcome to Java".indexOf("java", 5));
		System.out.println("Welcome to Java".indexOf("Java", 5));
		
		//CheckPoint04_16
		String s1 = "Welcome to Java";
		String s2 = "Programming is fun";
		String s3 = "Welcome to Java";
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.lastIndexOf("o", 100));
		//CheckPoint04_19
		System.out.println(1 + "Welcome " + ('\u0001' + 1));
		System.out.println(1 + "Welcome " + (1 + 1));
		System.out.println(1 + "Welcome " + 1 + 1);
		System.out.println(1 + "Welcome " + 'a' + 1);
		//CheckPoint04_18
		System.out.println("1" + 1);
		System.out.println("1" + (1 + 1));
		System.out.println("1" + 1 + 1);
		System.out.println('1' + 1 + 1);
		System.out.println('1' + 1);
		//CheckPoint04_20
		String d1 = " Welcome ";
		String d2 = " welcome ";
		boolean isEqual = d1.equals(d2);
		System.out.println(isEqual);
		isEqual = d1.equalsIgnoreCase(d2);
		System.out.println(isEqual);
		int x = d1.compareTo(d2);
		System.out.println(x);
		int y = d1.compareToIgnoreCase(d2);
		System.out.println(y);
		boolean b = d1.contains("AAA");
		System.out.println(b);
		boolean c = d1.endsWith("AAA");
		System.out.println(c);
		int z = d1.length();
		System.out.println(z);
		char k = d1.charAt(0);
		System.out.println(k);
		String d3 = d1 + d2;
		System.out.println(d3);
		System.out.println(d1.substring(1));
		System.out.println(d1.substring(1, 4));
		String d4 = d1.toLowerCase();
		System.out.println(d4);
		String d5 = d2.toUpperCase();
		System.out.println(d5);
		String d6 = d1.trim();
		System.out.println(d6);
		int t = d1.indexOf('e');
		System.out.println(t);
		int e = d1.lastIndexOf("abc");
		System.out.println(e);
	}

}
