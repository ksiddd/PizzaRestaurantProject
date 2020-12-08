package com.company;
import java.util.Scanner;
// Karan Sidhu
//Karan4@umbc.edu
public class Main {

    public static void main(String[] args) {
        int pizza;
        double pizzaPrice = 0;
        String name;
        String pizzaSize;
        String delivery;
        int topping;
        double deliveryFee = 2.50;
        Scanner sc = new Scanner(System.in);


        System.out.println("Please provide a name");
        name = sc.nextLine();
        System.out.println("Hello " + name + " What size pizza would you like? 1:large = 14.99" + //records users pizza size
                "  2: medium = 12.99 3:small = 10.99");
        pizza = sc.nextInt();

        if (pizza == 1) {

            pizzaSize = "Large";
            pizzaPrice = 14.99;
        }
        if (pizza == 2) {
            pizzaSize ="Medium";
            pizzaPrice = 12.99;
        }
        if (pizza == 3) {
            pizzaSize ="Small";
            pizzaPrice = 10.99;
        }
        double toppingPrice = 0;

        int count = 0;
        do

        {

            System.out.println("What toppings would you like? Choose 2  1: Olives = 1.29" +//do while loop for toppings
                    "  2:  Mushrooms = 1.49  3: Pepperoni = 1.79" +
                    "  4) Pineapple = 1.59  5) Done with toppings");
            topping = sc.nextInt();


            if (topping == 1)  //if Olives are chosen, initialize toppingPrice to 1.29
                toppingPrice = 1.29;
            if (topping == 2)
                toppingPrice = 1.49;// if  Mushrooms are chosen initialize value of toppingPrice too 1.49
            if (topping == 3)
                toppingPrice = 1.79;//if Mushrooms are chosen initialize value of toppingPrice to 1.79
            if (topping == 4)
                toppingPrice = 1.59;//If pineapple is chosen initialize value of toppingPrice to 1.59







        }  while (topping < 5); //get the topping Int, aslong as its under 5 loop will continue to run

        double totalCost1 = pizzaPrice +toppingPrice;
        double totalCost = pizzaPrice +toppingPrice +deliveryFee;
        sc.nextLine();
        System.out.println("Do you want delivery?\n Enter yes or no");
        delivery = sc.nextLine();


        if (delivery.equals("yes")) {
            System.out.println("Hello"+"  " + name + " here is your order:" +"\n" + pizzaPrice +
                    "\nToppings:" + toppingPrice + "\ndelivery 2.50"
                    + "\nTotal cost  "+ totalCost  );
        }



        if (delivery.equals("no")) {
            System.out.println("Hello"+"  " + name + " here is your order:" +"\n" + pizzaPrice +
                    "\nToppings:" + toppingPrice +
                    "\nTotal cost: "+ totalCost1  );
        }

    }

}
