package first;

public class PatternTri extends Pattern {

	public static void main(String[] args) {
		private int num;
		
		public PatternTri(int num) {
			this.num = num;
		}

	
		public void run() {
			
			for(int i=1;i<=num;i++)
				System.out.println();
		
				for(int j=num;j>=i;j--) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.print("* ");
					}
			
			
		}
	}
		
	
