package Java_Core;

public class ShoppingBillIfElse {
	
	 public static void main(String[] args) {

	        // Prices
	        final double RICE = 250;
	        final double OIL = 180;
	        final double BREAD = 45;
	        final double MILK = 90;
	        final double EGGS = 84;

	        // Step 1: Subtotal
	        double subtotal = RICE + OIL + BREAD + MILK + EGGS;

	        // Step 2: GST
	        double gst = 0;
	        if (subtotal > 500) {
	            gst = subtotal * 0.05;
	        }

	        // Step 3: Total after GST
	        double total = subtotal;
	        total += gst;

	        // Step 4: Discount
	        double discount = 0;
	        if (total > 600) {
	            discount = total * 0.10;
	        }
	        total -= discount;

	        // Step 5: Print bill
	        System.out.println("Subtotal: Rs. " + subtotal);
	        System.out.println("GST: Rs. " + gst);
	        System.out.println("Discount: Rs. " + discount);
	        System.out.println("TOTAL: Rs. " + total);
	    }

}
