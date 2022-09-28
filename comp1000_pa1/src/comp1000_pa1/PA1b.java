package comp1000_pa1;
import java.util.Scanner;

public class PA1b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

    System.out.println("Enter number of inches: ");
    int inches = input.nextInt();
    
    int yards = inches/36;
    int feet = (yards)%12;
    int new_inches = feet*2;
    
    
    System.out.print("That would be " + yards + " yards, " + feet + " feet, and " + new_inches + " inches");
	}

}
