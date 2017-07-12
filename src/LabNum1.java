import java.util.Scanner;

/**
 * Created by DELL on 7/10/2017.
 */
public class LabNum1
{

    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);

        double length;
        double width;

        System.out.println("Enter Length:");
        length = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter Width:");
        width = scan.nextDouble();
        scan.nextLine();

        double area = length * width;
        double perimeter = (2 * length + width);

        System.out.println("The area is " + area);
        System.out.println("Your perimeter is " + perimeter);




    }
}
