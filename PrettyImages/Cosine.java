/**
 * 
 * @author  Matthew Bogert, Brian Smith
 *
 */
public class Cosine implements Expression
{
	private Expression g;
	
	public Cosine(Expression g)
	{
		this.g = g;
	}
	
	@Override
	public double evaluate(double x, double y) {
		return Math.cos(Math.PI * g.evaluate(x,y));
	}
	
	public String toString()
	{
		return "cos(PI * " + g.toString();
	}

}
