package Inheritance;

import org.testng.annotations.Test;

public class Subclass extends Superclass
{
	@Test
	public void subclass()
	{
		doThis();
		Thridclass obj= new Thridclass(3);
		 int b=obj.increment();
		 int c=obj.multiply();
		 System.out.println(c);
		 System.out.println(b);
	}

}
