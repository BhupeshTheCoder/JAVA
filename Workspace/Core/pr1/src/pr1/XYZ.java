package pr1;

import java.util.Scanner;

public class XYZ {
	
	public static void main(String[] args) {
		int size, i;
		Scanner s = new Scanner(System.in);
		size = s.nextInt();
		Product p[] = new Product[size];
		for (i = 0; i < p.length; i++) {
			System.out.println("Enter Pid");
			int pid = s.nextInt();
			System.out.println("Enter quantity");
			int qty = s.nextInt();
			Float price = s.nextFloat();
			p[i] = new Product(pid, qty, price);
			System.out.println("Details of all product");
			for (i = 0; i < p.length; i++) {
				p[i].display();
				new Product().highestPrice(p);
				System.out.println("\n Total Amount= "+new Product().getAmount(p));
			}
		}
		
	    
	}

}
