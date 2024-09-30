import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    double itemPrice;
    double totalPrice;
    double shippingCost;

        System.out.println("What was the price of your items");
        itemPrice = scan.nextDouble();
        if (itemPrice >= 100) {
            shippingCost = itemPrice * 5 / 100;
            totalPrice = itemPrice + shippingCost;
            System.out.println("your total cost is " + totalPrice);
        }else{
            totalPrice = itemPrice;
            System.out.println("your total cost is " + totalPrice);
        }
    }
}