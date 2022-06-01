package iterationandswitch;

public class iterations {
	public static void main(String[] args)
	{
		//while,do while,for,for-each
		
		int k= 1;
		while(k<=5)
		{
			System.out.println("Hello");
			k++;
		}
		
		
		//NESTED LOOPS
		
		for(int i =1; i<=4;i++)
		{
			
		for(int j=1;j<=4;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		}
	}
}
