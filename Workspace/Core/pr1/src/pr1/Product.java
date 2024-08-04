package pr1;

public class Product {

	private int pid,quantity;
	private float price;
	public Product() {}
	public Product(int pid, int quantity, float price) {
		super();
		this.pid = pid;
		this.quantity = quantity;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public int getQuantity() {
		return quantity;
	}
	public float getPrice() {
		return price;
	}
	
	public void display() {
		System.out.println( "Product [pid=" + pid + ", quantity=" + quantity + ", price=" + price + "]");
	}
	public float getTotal() {
		return price*quantity;
	}
	public void highestPrice(Product[] p) {
		
		float temp=0;
		int k =0;
		temp = p[0].getPrice();
		for (int i = 1; i < p.length; i++) {
			if(temp<p[i].getPrice())
			temp =p[i].getPrice();
			k=i;
		}
		System.out.println("Highest price: "+temp+"\n Pid: "+p[k].getPid());
	}
	public void productTotal(Product[] p) {
		for (int  i = 0; i < p.length; i++) {
			System.out.println("pid: "+p[i]+"\t Total price: "+p[i].getTotal() );
		}
	}
	public double getAmount(Product[] p) {
		 double total =0;
		 for (int i = 0; i < p.length; i++) {
			total += p[i].getTotal();
			
		}
		return total;
	}
	
}
