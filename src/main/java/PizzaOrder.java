import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;
public class PizzaOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What size pizza would you like today?");
        String sizeOrder = scanner.next();
        System.out.println("Select a topping.");
        String toppingOrder = scanner.next();
        System.out.println("How many slices would you like the pizza to be cut into?");
        int sliceOrder = scanner.nextInt();

        System.out.println();

        new PizzaClass(toppingOrder, sliceOrder, sizeOrder).getOrder();


    }
}
