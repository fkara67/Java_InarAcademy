package chapters.chapter_04;

public class Exercises04_06 {

	public static void main(String[] args) {
		
		double radius = 40;
		
		double angle1 = Math.random() * 2 * Math.PI;
		double angle2 = Math.random() * 2 * Math.PI;
		double angle3 = Math.random() * 2 * Math.PI;
		 
		double x1 = radius * Math.cos(angle1);
		double y1 = radius * Math.sin(angle1);
		double x2 = radius * Math.cos(angle2);
		double y2 = radius * Math.sin(angle2);
		double x3 = radius * Math.cos(angle3);
		double y3 = radius * Math.sin(angle3);
		
		double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y3 - y2, 2));
		double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		double c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		double A = Math.toDegrees(Math.acos((a *a - b * b - c * c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
		
		A = Math.round(A * 100) / 100.0;
		B = Math.round(B * 100) / 100.0;
		C = Math.round(C * 100) / 100.0;
		
		
		System.out.println("The angles are " + A + "  " + B + "  " + C);
		System.out.println("total " + (A + B + C));
		
		
	}

}
