package classesandobjects;

class Emp
{
	int eid;
	int salary;
	static String ceo; // Now the variable ceo is not in heap memory, it is in Class Loader Memory
	
	static  // when you load a class .   special block in java. It will execute only once no matter how many objects you create
	{
		ceo = "Larry";
	}
	
	public Emp()  // when you create a object
	{
		eid = 1;
		salary = 3000;
	}
	
	
	public void show()
	{
		System.out.println(eid+" : "+salary+" : "+ceo);
	}
}


public class Statickeyword {

	public static void main(String[] args) // We can even make a function static. It means we dont need object to access main function
	{
		Emp navin = new Emp();
		navin.eid = 8;
		navin.salary = 4000;
		navin.ceo = "Nikhil";
		
		Emp rahul = new Emp();
		rahul.eid = 9;
		rahul.salary = 5000;
		rahul.ceo = "Nikhil";
		
		rahul.ceo = "NIkita";
		
		Emp.ceo = "Nikhillll"; // We can directly use class name instead of object because its common to all objects 
		// It shows we dont need object
		navin.show();
		rahul.show();

	}

}
