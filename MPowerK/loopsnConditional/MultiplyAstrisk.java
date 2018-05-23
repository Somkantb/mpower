package loopsnConditional;
import java.util.Scanner;
public class MultiplyAstrisk {
	String s = "";
	static Scanner f = new Scanner(System.in);
	public void mul(int i) {
		for (int j =1;j<=i;j++ ) {
			s = s+ "*";
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		MultiplyAstrisk obj1 = new MultiplyAstrisk();
		System.out.println("Pls enter the integer to repeat the * in a table manner: ");
		int num = f.nextInt();
		obj1.mul(num);
}
}