import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner SC = new Scanner(System.in);
      int num = SC.nextInt();
      int first_dig = num / 100;
      System.out.println(first_dig);
	}
}