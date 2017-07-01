

/**
 * An interface representing a mathematical expression of the form f(x,y)
 * @author Joel
 * @version Sp 2014
 */
public interface Expression
{
	/**
	 * Evaluates the expression with the given x,y values
	 * @param x x-value
	 * @param y y-value
	 * @return the value of the function when the given parameters are plugged in.
	 */
	public abstract double evaluate(double x, double y);
}
