package Java02;

import java.util.Locale;
import java.util.Scanner;
import Java02.Product;

public class Product_Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner Scanner = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter Product Data:");
		System.out.println("Name:");
		product.name = Scanner.nextLine();
		System.out.println("Price: ");
		product.price = Scanner.nextDouble();
		System.out.println("Quantity in Stock: ");
		product.quantity = Scanner.nextInt();
			
		System.out.println(product.toString());
		
		Scanner.close();
	}

}
