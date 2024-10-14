import java.util.Scanner;
class Area_of_reactangle{
    public static void main(String[] args){
    Scanner ali = new Scanner(System.in);
    int num1 , num2, area;
        //ask for height
        System.out.print("Enter the height: ");
        num1 = ali.nextInt();

        //ask for length
        System.out.print("Enter the length: ");
        num2 = ali.nextInt();
        
        //formula area of reactangle
        area = num1*num2 ;

        //close ali
        ali.close();
        
        //user friendly messages
        System.out.print("The area of reactangle is: " + area);
    }
}