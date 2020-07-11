
import java.util.Scanner;
public class VacationTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What kind of trip would you like to go on, musical, tropical, or adventurous? ");
		String vacationType = scnr.next();
		
		System.out.println("How many are in your group? ");
		int groupSize=0;
		try {
			groupSize = scnr.nextInt();
			String result = null;
			String destinationType = null;
	        String travelType = null;
			 
	        //Vaction type 
			if(vacationType.equalsIgnoreCase("Musical")) {
				destinationType="New Orleans";
			}
			else if(vacationType.equalsIgnoreCase("Tropical")) {
				destinationType="Beach Vacation in Mexico";
			}
			else if(vacationType.equalsIgnoreCase("Adventurous")) {
				destinationType="WhitewaternRating the Grand Canyon";
			}
			
			//group size
			if(groupSize>=1 && groupSize<=2) {
				travelType="First Class";
			}
			else if(groupSize>=3 && groupSize<=5) {
				travelType="Helicopter";
			}
			else if(groupSize>=6) {
				travelType="Charter Flight";
			}
			
			//results
			
			if ( destinationType==null && travelType==null) {
				result = "unknown vacation type "+ vacationType+" there is no specific destination type Suggestion for the entered vacation Type and unknown group size "+ groupSize+", there is no specific Travel Suggestion for the entered Group Size";
	            System.out.println("\n\nINVALID INPUT");
	            System.out.println("**************\n");
	
			}
		   else if(destinationType == null) {
				result = "unknown vacation type "+ vacationType+", there is no specific destination type Suggestion for the entered vacation Type";
	            System.out.println("\n\nINVALID INPUT");
	            System.out.println("**************\n");
	
		   }
			else if (travelType ==null) {
				result = "unknown group size "+ groupSize+", there is no specific Travel Suggestion for the entered Group Size";
	            System.out.println("\n\nINVALID INPUT");
	            System.out.println("**************\n");
	
			}		
			else {
				result = "since you're a group of "+ groupSize+" going on a "+vacationType+" vacation you should take a "+travelType+" to a "+destinationType;
	            System.out.println("\n\nVACATION DECISIONS");
	            System.out.println("******************\n");
	        
			}
			
			System.out.println(result);
		}catch (Exception e) {
			System.out.println("\n\nINVALID INPUT");
            System.out.println("**************\n");
            System.out.println("Available Vacation Types : Musical,Tropical,Adventurous");
            System.out.println("Group size must be a number and > 0");
            }

	}

}
