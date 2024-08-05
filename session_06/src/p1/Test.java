package session_10;

public class Test {
	
	int i;
	
	Test(int i)
	{
		this.i=i;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i;
	}

	@Override
	public String toString() {
		return i+"";
	}	
}
