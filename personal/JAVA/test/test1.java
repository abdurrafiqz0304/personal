import java.util.Scanner;
class test1{
    @SuppressWarnings("unused")
    public static void main(String[] args){

        Scanner test01 = new Scanner(System.in);
        int new1, new2, formula;

        System.out.print("Enter first number: ");
        new1 = test01.nextInt();

        System.out.print("Enter second number: ");
        new2 = test01.nextInt();

        formula = new1 + new2 ;

        test01.close();

        System.out.print("Submition of this two number is: ");
    }
}