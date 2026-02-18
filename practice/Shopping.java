package practice;
import java.util.Scanner;
import java.util.ArrayList;



public class Shopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> cart = new ArrayList<Double>();
		Double input_price;
		
		while (true) {
			System.out.println("--------------------");
			System.out.println("1. Add Price to Cart\n2. Remove Last Product\n3. View Cart\n4. Checkout\n5. Exit");
			System.out.println("--------------------");
			int inp = sc.nextInt();
			
			if (inp == 1) {
				System.out.println("Enter the price of the product: $");
				input_price = sc.nextDouble();
				cart.add(input_price);
				
			} else if (inp == 2) {
				System.out.println("Removing last product from cart...");
				if (!cart.isEmpty()) {
                    cart.remove(cart.size() - 1);
                } else {
                    System.out.println("Cart is already empty.");
                }
				
			} else if (inp == 3) {
				System.out.println("Cart Contents:");
                for (int i = 0; i < cart.size(); i++) {
                    System.out.println((i + 1) + ". $" + String.format("%.2f", cart.get(i)));
                }
				
			} else if (inp == 4) {
				double total = 0.0;
				for (int i = 0; i < cart.size(); i++) {
                    total += cart.get(i);
                }
				System.out.println("Total: $" + String.format("%.2f", total));
				
			} else if (inp == 5) {
            	System.out.println("Thank you for shopping with us!");
            	break;
            	
			} else {
            		System.out.println("Invalid input. Please try again.");
            	}
		}
	}

}
