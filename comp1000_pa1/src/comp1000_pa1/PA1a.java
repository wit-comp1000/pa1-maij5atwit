import java.util.Scanner;

public class PA1a {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int yards, feet, inches;
    double total_num;

    System.out.println("Enter number of yards: ");
    yards = input.nextInt();
    System.out.println("Enter number of feet: ");
    feet = input.nextInt();
    System.out.println("Enter number of inches: ");
    inches = input.nextInt();

    int new_yards = yards*36;
    int new_feet = feet*12;

    int sum = new_yards + new_feet+inches;

    System.out.println("The total number of inches is: " + sum);
    
  }

}
