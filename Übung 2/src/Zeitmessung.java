public class Zeitmessung
{
	private static double tuwas()
	{
		return Math.random();
	}

	// Linear
	public static String func1(int n)
	{
		String output;
		double summe = 0;
		int counter = 0;

		for (int a = 0; a < n; a++)
			summe += tuwas();
			counter++;

		output = summe + "   " + counter;
		return output;
	}

	// Quadratisch
	public static String func2(int n)
	{
		String output;
		double summe = 0;
		int counter = 0;

		for (int a = 0; a < n; a++)
			for(int b = 0; b < n; b++)
				summe += tuwas();
				counter++;

		output = summe + "   " + counter;
		return output;
	}

	// log2(n)
	public static String func6(int n)
	{
		String output;
		double summe = 0;
		int counter = 0;

		while (n > 0)
		{
			summe += tuwas();
			counter++;
			n /= 2;
		}

		output = summe + "   " + counter;
		return output;
	}

	public static void main(String[] args)
	{
		Zeitmessung main = new Zeitmessung();
		System.out.println(main.func1(100));
		System.out.println(main.func2(100));
		System.out.println(main.func6(100));
	}
}
