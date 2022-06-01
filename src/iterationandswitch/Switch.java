package iterationandswitch;

public class Switch {
	public static void main(String args[])
	{
		//SWITCH
		
		int num = 3;
		
		//Switch supports string only in version above 1.7
		//Switch doesn't supports double
		
		switch(num) // We can even use string in switch
		{
		case 1:
			System.out.println("One");
			break;
		case 2:	
			System.out.println("Two");
			break;
		case 3:	
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("No Match");

	}

	}
}

