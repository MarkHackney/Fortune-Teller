import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
	
		String firstName = " ";
		String lastName = " "; 
		String location = " ";
		String transportation = " ";
		String color = " ";
		String monthName = " ";
		String again = "Y";
		int age, birthMonth, numberOfSiblings, retireYears, money = 0;
	
		do{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your first name.");
		firstName = scanner.next();
		System.out.println("\n");
		
		System.out.println("Please enter your last name.");
		lastName = scanner.next();
		System.out.println("\n");

		System.out.println("How old are you?");
		age = scanner.nextInt();
		System.out.println("\n");

		
		if (age%2 != 0) {
			retireYears = 22;
		}else {
			retireYears = 5;
		}
		
		System.out.println("Please enter the number which corresponds to the\n"
				+"month you were born.\n"
				+"\n"
				+ "1 - Jan      2 - Feb      3 - Mar      4 - Apr\n"
				+ "5 - May      6 - Jun      7 - Jul      8 - Aug\n"
				+ "9 - Sep     10 - Oct     11 - Nov     12 - Dec\n");
		
		birthMonth = scanner.nextInt();
		
		   switch (birthMonth) {
           case 1:  monthName = "January";
                    break;
           case 2:  monthName = "February";
                    break;
           case 3:  monthName = "March";
                    break;
           case 4:  monthName = "April";
                    break;
           case 5:  monthName = "May";
                    break;
           case 6:  monthName = "June";
                    break;
           case 7:  monthName = "July";
                    break;
           case 8:  monthName = "August";
                    break;
           case 9:  monthName = "September";
                    break;
           case 10: monthName = "October";
                    break;
           case 11: monthName = "November";
                    break;
           case 12: monthName = "December";
                    break;
           default: monthName = "Invalid month";
                    break;
		   }
		    
		   String fullName = firstName + lastName;		   
		   
		   if (fullName.contains(monthName.substring(0, 1))){
			   money = 300000;
		   }else if (fullName.contains(monthName.substring(1, 2))){
			   money = 10000000;
		   }else if (fullName.contains(monthName.substring(2, 3))){
			   money = 72;
		   } 

		  System.out.println("\n");

		  System.out.println("Enter the first letter of your ROYGBIV favorite color?\n"
		  + "Not sure what ROYGBIV means, type \"HELP\"");
			
			color = scanner.next();
			color = color.toUpperCase();
					
			switch (color) {
			case "HELP":
				System.out.println("\n"
						+"ROYGBIV is an acronym for the primary sequence of hues.\n"
						+"Sometimes expressed Roy G. Biv colors. Each letter\n"
						+"represents the following colors:\n"
						+"\n"
						+ "R - Red    O - Orange    Y - Yellow    G - Green\n"
						+ "B - Blue   I - Indigo    V - Violet\n"
						+"\n"
						+ "Please indicate the first letter of your favorite.");
				color = scanner.next();
				color = color.toUpperCase();
			
			case "R": 
				transportation = "motorcycle";
				break;
			case "O": 
				transportation = "buggy";
				break;
			case "Y": 
				transportation = "horse";
				break;
			case "G": 
				transportation = "big wheel";
				break;
			case "B": 
				transportation = "car";
				break;
			case "I": 
				transportation = "unicycle";
				break;
			case "V": 
				transportation = "bicycle";
				break;
			default:
				transportation = "tricycle";
				break;
			}     
			
		System.out.println("\nHow many siblings do you have?");
		numberOfSiblings =  scanner.nextInt();
		
			if (numberOfSiblings == 0){
				location = "Nassua";
			}else if (numberOfSiblings == 1){
				location = "Malibu";
			}else if (numberOfSiblings == 2){
				location = "Boca Raton";
			}else if (numberOfSiblings ==3){
				location = "Springfield";
			}else if (numberOfSiblings >3){
				location = "Mars";
			}
	
		System.out.println("\n"
		+ firstName + " " +  lastName + " will retire in " + retireYears + " years with " + "$ " + money + " in the\n" 
		+ "bank, a vacation home in " + location + " and a " + transportation + ".");	
		
		System.out.println("Want to try again. Enter \"Y\"to rerun program.");
		again=scanner.next();
		again=again.toUpperCase();

		}while(again.equals("Y"));
		
		System.out.println("Normally your future isn't written. But now yours IS.");
}
}
