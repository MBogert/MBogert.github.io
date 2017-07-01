/**
 * 
 * @author Matthew Bogert, Brian Smith
 *
 */
public class Multiply implements Expression
{
	private Expression g;
	private Expression h;
	
	
	public Multiply(Expression g, Expression h)
	{
		this.g = g;
		this.h = h;
	}
	
	@Override
	public double evaluate(double x, double y) 
	{
//		if(g.evaluate(x,y) == x && g.evaluate(x,y) == y && h.evaluate(x,y) == x && h.evaluate(x,y) == y)
//		{
//			return x*y;
//		}
//		else
//		{
			return g.evaluate(x,y)*h.evaluate(x,y);
//		}
	}
	
	public String toString()
	{
		return "("+g.toString()+ " * " + h.toString()+")";
	}

}
