package Java03;

import java.util.Locale;
import java.util.Scanner;
import Java03.Product;

public class Getter_Setter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner Scanner = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = Scanner.nextLine();
		
		System.out.print("Price: ");
		double price = Scanner.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = Scanner.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println("Product data: " + product);
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = Scanner.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data: " + product);
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = Scanner.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: " + product);
		Scanner.close();
	}
}
