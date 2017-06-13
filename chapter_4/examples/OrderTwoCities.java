/** Has user enter names of two cities and displays them in alphabetical order.

    @author Brian McEntee */
import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city name: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city name: ");
        String city2 = input.nextLine();

        if(city1.compareTo(city2) > 0) { //not in alphabetical order
            String tempCity = city1;
            city1 = city2;
            city2 = tempCity;
        }
        else {
            //already in alphabetical order
        }

        System.out.println(city1 + "\n" + city2);
    }
}