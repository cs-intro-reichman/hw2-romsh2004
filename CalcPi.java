// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) 
	{ 
		double finalnum = 1;
		double j = 3;
	    int n = Integer.parseInt(args[0]);
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				finalnum = finalnum + (1.0 / j);
			} else {
				finalnum = finalnum - (1.0 / j);
			}
			j = j + 2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + finalnum * 4);
		}
}

