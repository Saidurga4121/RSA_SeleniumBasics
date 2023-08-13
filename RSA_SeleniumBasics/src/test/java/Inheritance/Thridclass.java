package Inheritance;

public class Thridclass extends Fourthclass
{
	int classVariable;
	
	// the scope of instance varibale is only within the constructor
	// once the block is over , the value menas nothing
	// so we have to assign that to class variable in order to make it useful
	// this is used to define current class variable
	// super keyword is used to call parent class constructor.
	// cannot use super in static methods
	// super method must be the first statement.
	public Thridclass(int instanceVariable)
	{
		super(instanceVariable);
		this.classVariable=instanceVariable;
	}
	
	public int increment()
	{
		classVariable=classVariable+1;
		return classVariable;
	}
	
	public int decrement()
	{
		classVariable=classVariable-1;
		return classVariable;
	}

}
