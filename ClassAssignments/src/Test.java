import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter seats");
		String s= scan.nextLine();
		boolean bn=Pattern.matches("[a-zA-Z][1-10,]{n}", s);
		System.out.println(bn);
	}

}
