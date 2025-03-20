import java.util.Scanner;  // Import the Scanner class

public class Wk9Ex2 {
    public static void main(String[] args) {

        //creates a scanner oject to get user input
        Scanner input = new Scanner(System.in);

        //prompts user; gets user input
        System.out.println("Enter the length of the rectangle:");
        double length = input.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = input.nextDouble();

        double area = length * width;
        double perimeter = (length*2)+(width*2);

        System.out.println("Results:\n"+
        "Area of the rectangle: " +area+
        "\nPerimeter of the rectangle: "+perimeter);
    }
}