/**
 * 
 * @author  Matthew Bogert, Brian Smith
 *
 */
public class Average implements Expression
{
	Expression g;
	Expression h;
	
	public Average(Expression g, Expression h)
	{
		this.g = g;
		this.h = h;
	}
	
	@Override
	public double evaluate(double x, double y) {
//		if(g.evaluate(x,y) == x && g.evaluate(x,y) == y && h.evaluate(x,y) == x && h.evaluate(x,y) == y)
//		{
//			return (x+y)/2;
//		}
//		else
//		{
			return (g.evaluate(x,y)+h.evaluate(x,y))/2;
//		}
	}

	public String toString()
	{
		return "avg("+ g.toString()+","+h.toString()+")";
	}
}
