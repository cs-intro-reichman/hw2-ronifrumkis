public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args [1]);

        int totalminutes = (hours * 60) + minutes + minutesToAdd;
        int totalhours = totalminutes / 60;
        int Newminutes = totalminutes - (totalhours * 60);
        int Newhours = (totalhours % 24);
         
        

        if (Newhours < 10) {
				if (Newminutes < 10) 
		        {
				System.out.println("0"+Newhours+":"+"0"+Newminutes);
			    } 
			else {
				System.out.println("0"+Newhours+":"+Newminutes);
            }
        }
        if (Newhours > 10) {
				if (Newminutes < 10) 
				{
				    System.out.println(Newhours+":"+"0"+Newminutes);
				} 
			else {
				System.out.println(Newhours+":"+Newminutes);
            
            }
        }
    }
}

// great
// notice camel case
// NewHours -> newHours
// totalminutes -> totalMinutes

