import java.util.Scanner;

public class SolveQuadratics {
    public static void main(String[] args) {

        //Prompt user to enter values a, b, and c
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        //Calculate the disciminant
        double disciminant = Math.pow(b, 2) - 4 * a * c;

        //Use disciminant to determine the number of solutions and solve
        if (disciminant > 0) { //two real roots
            double solution1 =  (-b + Math.sqrt(disciminant)) / (2 * a);
            double solution2 =  (-b - Math.sqrt(disciminant)) / (2 * a);
            System.out.println("The equation has two real roots " +
                solution1 + " " + solution2);
        }
        else if (disciminant == 0) { //one real root
            double solution = -b / (2 * a);
            System.out.println("The equation has one real solution " + 
                solution);
        } 
        else { //no real roots
            System.out.println("The equation has no real roots");
        }


    }
}