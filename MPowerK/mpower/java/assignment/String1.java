package mpower.java.assignment;
import java.util.*;
public class String1
{
	
	public static void main(String[] args)
	{
	String first = "ABC#1234*DEF";
	System.out.println(first.substring(4,8));
	
	String second = "AAAAAAAAAAAA:BBBBBBBBBBB;CCCCCCCCCCC:DDDDDDDDDDDDD;EEEEEEEEEEEE:FFFFFFFFFFFFF";
	String [] ar1= second.split(":");
	String [] ar2 = second.split(";");
	System.out.println(Arrays.toString(ar1));
	System.out.println(Arrays.toString(ar2));
	}

}
