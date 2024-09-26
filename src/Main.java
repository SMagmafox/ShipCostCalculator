import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shipCost = 0;
        double totalCost = 0;
        final double SHIP_RATE = 0.02;
        final double FREE_SHIP = 100;
        String trash = "";


        System.out.print("Enter the price of your item: ");
        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();//clears the buffer

            if (itemPrice >= FREE_SHIP)
            {
                shipCost = 0;
                totalCost = itemPrice + shipCost;
                System.out.println("You got free shipping!");
            }
            else //has to pay ship costs
            {
                shipCost = itemPrice * SHIP_RATE;
                System.out.println("The ship cost is: $" + shipCost);
            }
            totalCost = itemPrice + shipCost;
            System.out.println("The total cost is: $" + totalCost);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You need to enter an item price not " + trash);
            System.out.println("RUN THE PROGRAM AGAIN!");
        }
    }
}