/**
 * 
 * @author  Matthew Bogert, Brian Smith
 *
 */
public class Y implements Expression
{
	
	public Y()
	{
	}
	
	
	
	@Override
	public double evaluate(double x, double y) 
	{
		return y;
	}
	
	public String toString()
	{
		return "y";
	}

}
