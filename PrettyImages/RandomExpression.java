
/**
 * 
 * @author Matthew Bogert, Brian Smith
 *
 */
public class RandomExpression implements Expression
{
	private Expression g;
	
	public RandomExpression()
	{
		g = this.buildRandomExpression(Math.random(), 0);
	}
	
	@Override
	public double evaluate(double x, double y) 
	{
		return g.evaluate(x,y);
	}
	
	public String toString()
	{
		return g.toString();
	}
	
	public Expression buildRandomExpression(double percent, int itr)
	{
		if(itr == 18)
		{
			return new X();
		}
		else
		{
			if(percent > 0 && percent <= .1)
			{
				return new X();
			}
			if(percent > .1 && percent <= .2)
			{
				return new Y();
			}
			if(percent > .2 && percent <= .4)
			{
				itr ++;
				return new Multiply(buildRandomExpression(Math.random(),itr), buildRandomExpression(Math.random(),itr));
			}
			if(percent > .4 && percent <= .6)
			{
				itr ++;
				return new Average(buildRandomExpression(Math.random(),itr), buildRandomExpression(Math.random(),itr));
			}
			if(percent > .6 && percent <= .8)
			{
				itr ++;
				return new Sine(buildRandomExpression(Math.random(),itr));
			}
			if(percent > .8)
			{
				itr ++;
				return new Cosine(buildRandomExpression(Math.random(),itr));
			}			
		}
		return new Y();
	}
	
}
