public class SwitchStatementDemo {
    public static void main(String[] args) {
	
	int dayOfWeek = 4; //initialize a variable int with the name dayOfWeek with a value of 4
	switch (dayOfWeek) {  //read the int value of the variable dayOfWeek
	    case 1: //print the message below if the value of dayOfWeek is 1
	        System.out.println("Monday: Start of the work week.");
	        break; //break statement to stop the program from proceeding to the next case accidentally
	    case 2: //print the message below if the value of dayOfWeek is 2
	        System.out.println("Tuesday: Keep going!");
	        break; //break statement to stop the program from proceeding to the next case accidentally
	    case 3: //print the message below if the value of dayOfWeek is 3
	        System.out.println("Wednesday: Midweek.");
	        break; //break statement to stop the program from proceeding to the next case accidentally 
	    case 4: //this will print because the value of dayOfWeek is 4
	        System.out.println("Thursday: Almost there.");
	        break; //break statement to stop the program from proceeding to the next case accidentally
	    case 5: //print the message below if the value of dayOfWeek is 5
	        System.out.println("Friday: Weekend is near.");
	        break; //break statement to stop the program from proceeding to the next case accidentally
	    case 6: //print the message below if the value of dayOfWeek is 6
        	System.out.println("Saturday: Enjoy your day off!");
	        break; //break statement to stop the program from proceeding to the next case accidentally
	    case 7: //print the message below if the value of dayOfWeek is 7
	        System.out.println("Sunday: Rest and recharge.");
	        break; //break statement to stop the program from proceeding to the next case accidentally
	    default: //print the message below if the value of dayOfWeek is not in the case
	        System.out.println("Invalid day.");
	}

	char studentGrade = 'B'; //initialize a variable char with the name studentGrade with a value of B
	switch (studentGrade) { //read the char value of the variable studentGrade
	    case 'A': //print the message below if the value of studentGrade is A
	        System.out.println("Excellent!");
	        break; //break statement to stop the program from proceeding to the next case accidentally
	    case 'B': //the message below will print because the value of studentGrade is B
	        System.out.println("Good job!");
	        break; //break statement to stop the program from proceeding to the next case accidentally 
	    case 'C': //print the message below if the value of studentGrade is C
	        System.out.println("Well done!");
	        break; //break statement to stop the program from proceeding to the next case accidentally
	    case 'D': //print the message below if the value of studentGrade is D
	        System.out.println("You passed.");
	        break; //break statement to stop the program from proceeding to the next case accidentally 
	    case 'F': //print the message below if the value of studentGrade is F
	        System.out.println("Better luck next time.");
	        break; //break statement to stop the program from proceeding to the next case accidentally 
	    default: //print the message below if the value of studentGrade is not in the case
	        System.out.println("Invalid grade.");
	}
    }
}
