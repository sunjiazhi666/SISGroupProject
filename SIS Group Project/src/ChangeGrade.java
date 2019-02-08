import java.util.Scanner;

public class ChangeGrade
	{

			public static void gradeChange()
			{
				Scanner userInput = new Scanner(System.in);
				
				System.out.println("Which student's grade would you like to change?");
				Roster.roster();
				int userChoice = userInput.nextInt();
				
				System.out.println("Which class would you like to change the grade in for " + DataBase.students.get(userChoice - 1).getFirstName() + " " + DataBase.students.get(userChoice - 1).getLastName());
				System.out.println("(1) " + DataBase.students.get(userChoice - 1).getOne());
				System.out.println("(2) " + DataBase.students.get(userChoice - 1).getTwo());
				System.out.println("(3) " + DataBase.students.get(userChoice - 1).getThree());
				Scanner userInput2 = new Scanner(System.in);
				int userClass = userInput2.nextInt();
				
				Scanner userInput3 = new Scanner(System.in);
				if(userClass == 1)
					{
						System.out.println("What would you like to change " + DataBase.students.get(userChoice - 1).getFirstName() + " " + DataBase.students.get(userChoice - 1).getLastName() + "'s grade in " + DataBase.students.get(userChoice - 1).getOne() + " to?");
						String userGrade = userInput3.nextLine();
						DataBase.students.get(userChoice - 1).setOneGrade(userGrade);
						System.out.println(DataBase.students.get(userChoice - 1).getFirstName() + " " + DataBase.students.get(userChoice - 1).getLastName() + "'s new grade in " + DataBase.students.get(userChoice - 1).getOne() + " is " + userGrade);
					}
				
				if(userClass == 2)
					{
						System.out.println("What would you like to change " + DataBase.students.get(userChoice - 1).getFirstName() + " " + DataBase.students.get(userChoice - 1).getLastName() + "'s grade in " + DataBase.students.get(userChoice - 1).getTwo() + " to?");
						String userGrade = userInput3.nextLine();
						DataBase.students.get(userChoice - 1).setTwoGrade(userGrade);
						System.out.println(DataBase.students.get(userChoice - 1).getFirstName() + " " + DataBase.students.get(userChoice - 1).getLastName() + "'s new grade in " + DataBase.students.get(userChoice - 1).getTwo() + " is " + userGrade);
					}
				
				if(userClass == 3)
					{
						System.out.println("What would you like to change " + DataBase.students.get(userChoice - 1).getFirstName() + " " + DataBase.students.get(userChoice - 1).getLastName() + "'s grade in " + DataBase.students.get(userChoice - 1).getThree() + " to?");
						String userGrade = userInput3.nextLine();
						DataBase.students.get(userChoice - 1).setThreeGrade(userGrade);
						System.out.println(DataBase.students.get(userChoice - 1).getFirstName() + " " + DataBase.students.get(userChoice - 1).getLastName() + "'s new grade in " + DataBase.students.get(userChoice - 1).getThree() + " is " + userGrade);
					}
				
				System.out.println();
			}
	}
