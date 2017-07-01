/**
 * 
 * @author  Matthew Bogert, Brian Smith
 *
 */
public class Sine implements Expression
{
	private Expression g;
	
	public Sine(Expression g)
	{
		this.g = g;
	}
	
	@Override
	public double evaluate(double x, double y) {
		return Math.sin(Math.PI * g.evaluate(x,y));
	}
	
	public String toString()
	{
		return "sin(PI * " + g.toString();
	}
}
