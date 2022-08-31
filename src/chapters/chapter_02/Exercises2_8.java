package chapters.chapter_02;
import java.util.Scanner;
public class Exercises2_8 {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the time zone offset to GMT: ");
	long zoneOffset = input.nextInt();
	long totalMilliseconds = System.currentTimeMillis();
	long totalSeconds = totalMilliseconds / 1000;
	long currentSecond = totalSeconds % 60;
	long totalMinutes = totalSeconds / 60;
	long currentMinute = totalMinutes % 60;
	long totalHour = totalMinutes / 60;
	long currentHour = totalHour % 24;
	
	currentHour = currentHour + zoneOffset;
	
	if (currentHour > 24)
		System.out.println("The current time is : " + currentHour % 24 + ":" + currentMinute + ":" + currentSecond + " GMT" + zoneOffset );
	else	
	
	System.out.println("The current time is : " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT" + zoneOffset );
	
	
		

	}

}
