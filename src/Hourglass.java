/*  Declare a constant that will 
	Top/bottom line
		print a line with | and "
	Top of hourglass
		use nested for loop for the : in the middle
		surround by \ and / with concatenation
	Middle of hourglass
		print a line with ||
	Bottom of hourglass
		use nested for loop for the : in the middle
		surround by / and \ with concatenation
	Use the top/bottom line to finish
*/

public class Hourglass {
	public static final int HEIGHT =
	
	public static void main(String[] args) {
		fullLine();
		top();
		middle();
		bottom();
		fullLine();
	}
	
	//will make both the top and bottom lines
	public static void fullLine() {
		System.out.print("+");
		for(int x = 1; x <= 10; x++) {
			System.out.print("\"");
		}
		System.out.println("+");
	}
	
	//will make the top half of the hourglass
	public static void top() {
		for (int y = 1; y <= 4; x++) {
			for (int space = 1; space <= y; space++) {		//creating spaces inside
				System.out.print(" ");
			}
			for (int dots = 1; dots <= ) {	//creating slashes and dots inside
				
			}
		}
	}
}
