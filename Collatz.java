// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) 
	{
			int n = Integer.parseInt(args[0]);
			int count = 1;
			String ch = args[1];
			for (int i = 1; i <= n; i++) 
			{
				int j = i;
				do 
				{
					if (ch.equals("v"))
					{
						System.out.print(j + " ");
					}
					if (j % 2 == 0) 
					{
						j = j / 2;
					} 
					else 
					{
						j = 3 * j + 1;
					}
					count = count + 1;
				} while (j != 1);
				if (ch.equals("v")) 
				{
					System.out.print(j + " ");
					System.out.print("(" + count + ")");
					System.out.println();
				}
				count = 1;
			}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
	}


