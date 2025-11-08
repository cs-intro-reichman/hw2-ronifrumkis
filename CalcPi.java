// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

	    int Num = Integer.parseInt(args[0]);
		double pisum = 0;
		for (int i = 0 ; i < Num ; i++) {
			double under = ((2.0 * i) + 1.0);
			double up = (Math.pow(-1, i) * 4);

			double almostpi = up / under ;
			pisum = pisum + almostpi;
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pisum);
	}
}
