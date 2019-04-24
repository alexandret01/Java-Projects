package Java07;

import java.util.Date;

public class Status_Main {

	public static void main(String[] args) {
		Order order = new Order();

		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println("OS1: "+os1+" OS2: "+os2);
		
	}

}
