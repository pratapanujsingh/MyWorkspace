package samplePackage;

public class Hello {

	public Hello()
	{
		
		System.out.println("Constructor");
	}
	
	void Hello()
	{
		
		System.out.println("method");
	}
	
	public static void main(String[] args) {
		Hello h = new Hello();
		h.Hello();
		
		}

}
