package Java_Core;

public class LoopProject {

	public static void main(String[] args) {
		 System.out.println("Multiplication Table of 7:");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("7 x " + i + " = " + (7 * i));
	        }

	     System.out.println("\nFirst number greater than 1 whose square is > 500:");
         int num = 2;

            while (true) {
             if (num * num > 500) {
             System.out.println("Number: " + num);
             System.out.println("Square: " + (num * num));
             break;
             }
            num++;
          }
            
          System.out.println("\nTriangle Pattern:");
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
          }
	}
}
