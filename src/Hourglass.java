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
	
	FOR THE SCALE:
	To change scale, change what SIZE equals at the beginning of code from
	4 to however tall you want the hourglass to be. As of now, the sloping
	sides of the hourglass are 4 lines tall going up and going down. SIZE
	represents this number.
*/

public class Hourglass {
	public static final int SIZE = 4;
	public static void main(String[] args) {
		fullLine();
		top();
		middle();
		bottom();
		fullLine(); 
	}
	
	//will make both the top and bottom lines
	public static void fullLine() {
		System.out.print("|");
		for(int x = 1; x <= 2 * SIZE + 2; x++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	//will make the top half of the hourglass
	public static void top() {
		for (int y = 1; y <= SIZE; y++) {
			for (int space = 1; space <= y; space++) {		//creating spaces inside
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int dots = (2 * SIZE + 2) - (2 * y); dots >=1; dots--) {	//creating dots inside  
				System.out.print(":");						//if scaling doesn't work, original equation: 10 - (2 * y)
			}
			System.out.println("/");
		}
	}
	
	//will make lines in middle
	public static void middle() {
		for(int space = 1; space <= SIZE + 1; space++) {
			System.out.print(" ");
		}
		System.out.println("||");
	}
	
	//will make bottom half of hourglass
	public static void bottom() {									
		for (int b = SIZE; b >= 1; b--) {
			for (int space = 1; space <= b; space++) {
				System.out.print(" ");
			}
			System.out.print("/");									
			for (int dots = (2 * SIZE + 2) - (2 * b); dots >= 1; dots--) {
				System.out.print(":");
			}
			System.out.println("\\");
		}
	}
}
