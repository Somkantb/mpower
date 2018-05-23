package loopsnConditional;
import java.util.Scanner;

public class MultiplyI {
	static Scanner f = new Scanner(System.in);
	public void mul(int i) {
		for (int j =1; j<11;j++ ) {

			System.out.println(i*j);
		}

	}

	public static void main(String[] args) {
		MultiplyI obj1 = new MultiplyI();
		System.out.println("Pls enter the integer to create a table: ");
		int num= f.nextInt();
		obj1.mul(num);

	}

}
