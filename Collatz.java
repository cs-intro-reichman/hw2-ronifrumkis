// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int Highestseed = Integer.parseInt(args [0]); // notice camel case -> highestSeed
	    String chosen_mode = args [1]; // chosenMode

		if (chosen_mode.equals("V" ) || chosen_mode.equals("v")) { // great thinking of edge cases :)
			for (int i = 1; i <= Highestseed ; i++) { 
				int M = i;
				int Count = 1;
				System.out.print(M + " ");
				if (M % 2 == 0) {
					M = M / 2;
					System.out.print(M + " ");
					Count = Count + 1;
				}	
				else {
					M = (3 * M) + 1 ;
					System.out.print (M + " ");
					Count = Count + 1 ;
				}
				while (M != 1) 
					if (M % 2 ==0) {
							M = M / 2;
							System.out.print(M + " ");
							Count = Count + 1;
					}
					else {
						M = (3 * M) + 1;
						System.out.print(M + " ");
						Count = Count + 1;
					}
					System.out.println("(" + Count + ")");
				}
				System.out.println("Every one of the first " + Highestseed + " hailstone sequences reached 1.");
				
		}
		else { 
					System.out.println("Every one of the first " + Highestseed + " hailstone sequences reached 1.");
				}
	}
}

