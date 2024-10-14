import java.util.Scanner;
class area_Radius{

    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        double pi;
        double radi;
        pi = 3.14159;

        System.out.print("Enter the radius(cm): ");
        radi = ali.nextDouble();

        ali.close(); 
        System.out.println("Area: "+((2*radi)*pi));
    }
}
