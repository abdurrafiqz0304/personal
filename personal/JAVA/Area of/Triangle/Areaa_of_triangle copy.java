import java.util.Scanner;
class Area_of_triangel5{
    public static void main(String[] args){

        //declaire for user input
        Scanner abu = new Scanner(System.in);

        //declaire for variable in decimal places (double)
        double num1 , num2, area;
 
        //ask for height of triangle
        System.out.println("Enter the height: ");
        num1 = abu.nextDouble();

        //ask for length of triangle
        System.out.println("Enter the length: ");
        num2 = abu.nextDouble();

        //Formula area of triangle
        area = 0.5*num1*num2 ;

        //close the abu
        abu.close();

        //Display the output
        System.out.println("The area of triangle is: "  + area );
    }
}