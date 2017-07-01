/**
 * 
 * @author  Matthew Bogert, Brian Smith
 *
 */
public class X implements Expression
{
	
	
	public X()
	{
		
	}
	
	
	
	@Override
	public double evaluate(double x, double y) 
	{
		// TODO Auto-generated method stub
		return x;
	}
	
	public String toString()
	{
		return "x";
	}

	
//	f(x) = x
//			
//	f(3) => 3
//	f(x,y) = x
//	f(3,4) => 3
//	
//	f(x,y) = cos(x)
//	f(3,4) => cos(3) => 1.23
//	f(x,y) = cos(sin(x+y))
}
