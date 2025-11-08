
public class Cheers {
        public static void main(String[] args) {
	    String cheers = args [0].toUpperCase();
            int N = Integer.parseInt(args [1]);

            String ancondition = "AEFHILMNORSX";

            for (int i = 0; i < cheers.length(); i++) {
                char letter = cheers.charAt(i);  
                String ana;
            
                if (ancondition.indexOf(letter) !=- 1) {
                        ana = "an";     
                }              
                  else {
                        ana = "a";
                        
                }

            System.out.println("Give me " + ana + " " + letter + ": " + letter + "!");

            }

            System.out.println("What does  that spell?");
            for (int i = 0 ; i < N; i++) {
            System.out.println(cheers + "!!!");
            }
        }
}
