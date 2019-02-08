import java.util.Scanner;

public class SwitchClasses
	{

			public static void classSwitch()
			{
				Scanner userInput = new Scanner(System.in);
				
				System.out.println("Which student's classes would you like to switch?");
				Roster.roster();
				int userChoice = userInput.nextInt();
				
				System.out.println("Which class would you like to switch " + DataBase.students.get(userChoice - 1).getFirstName() + " " + DataBase.students.get(userChoice - 1).getLastName() + " from?");
				System.out.println("(1) " + DataBase.students.get(userChoice - 1).getOne());
				System.out.println("(2) " + DataBase.students.get(userChoice - 1).getTwo());
				System.out.println("(3) " + DataBase.students.get(userChoice - 1).getThree());
				Scanner userInput2 = new Scanner(System.in);
				int userClassFrom = userInput2.nextInt();
				
				System.out.println("Which class would you like to switch " + DataBase.students.get(userChoice - 1).getFirstName() + " " + DataBase.students.get(userChoice - 1).getLastName() + " into?");
				System.out.println("(1) " + DataBase.students.get(userChoice - 1).getOne());
				System.out.println("(2) " + DataBase.students.get(userChoice - 1).getTwo());
				System.out.println("(3) " + DataBase.students.get(userChoice - 1).getThree());
				Scanner userInput3 = new Scanner(System.in);
				int userClassInto = userInput3.nextInt();
				
				
			}
	}
