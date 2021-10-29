import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;
public class PizzaOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What size pizza would you like today?");
        new PizzaClass().setSize(scanner.next());
        System.out.println("Select a topping.");
        new PizzaClass().setSlice(scanner.nextInt());
        System.out.println("How many slices would you like the pizza to be cut into?");
        new PizzaClass().setTopping(scanner.next());
        System.out.println();
        System.out.println("Your order is on the way!");
        System.out.println("Here are the details of your order: ");
        System.out.println("Size: " + new PizzaClass().getSize());
        System.out.println("Slices: " + new PizzaClass().getSlices());
        System.out.println("Toppings: " + new PizzaClass().getToppings());
    }
}
