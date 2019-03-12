import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner SC = new Scanner(System.in);
      int num = SC.nextInt();
      int sec_last_dig = (num % 100) / 10;
      System.out.println(sec_last_dig);
	}
}