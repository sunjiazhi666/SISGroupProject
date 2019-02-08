import java.util.Scanner;

public class AddStudent
	{
		
		static double newGPA = 0;
		public static void studentAdd()
		{
			
			
			
			Scanner userInput = new Scanner(System.in);
			
			
			System.out.println("Please input the first name of the student.");
			String first = userInput.nextLine();
			
			System.out.println("Please input the last name of the student.");
			String last = userInput.nextLine();
			
			System.out.println("Please input the student's first period.");
			String periodOne = userInput.nextLine();
			
			System.out.println("Please input the student's first period grade.");
			String periodOneGrade = userInput.nextLine();
			
			System.out.println("Please input the student's second period.");
			String periodTwo = userInput.nextLine();
			
			System.out.println("Please input the student's second period grade.");
			String periodTwoGrade = userInput.nextLine();
			
			System.out.println("Please input the student's third period.");
			String periodThree = userInput.nextLine();
			
			System.out.println("Please input the student's third period grade.");
			String periodThreeGrade = userInput.nextLine();
			
			String [] grades = new String [3];
			grades[0] = periodOneGrade;
			grades[1] = periodTwoGrade;
			grades[2] = periodThreeGrade;
			double total = 0;
			
			for(int i = 0; i < grades.length; i++)
				{
					switch(grades[i])
					{
					case "A+":
							{
						total += 4.30;
						break;
					}
					
					case "A":{
						total += 4.00;
						break;
					}
					
					case "A-":{
						total += 3.70;
						break;
					}
					
					case "B+":{
						total += 3.30;
						break;
					}
					
					case "B":{
						total += 3.00;
						break;
					}
					
					case "B-":{
						total += 2.70;
						break;
					}
					
					case "C+":{
						total += 2.30;
						break;
					}
					
					case "C":{
						total += 2.00;
						break;
					}
					
					case "C-":{
						total += 1.70;
						break;
					}
					
					case "D+":{
						total += 1.30;
						break;
					}
					
					case "D":{
						total += 1.00;
						break;
					}
					
					case "D-":{
						total += 0.90;
						break;
					}
					
					case "F":{
						total += 0.00;
						break;
					}
					}
				newGPA = total/3;	
					
				}

			
			DataBase.students.add(new Student(first, last, periodOne, periodOneGrade, periodTwo, periodTwoGrade, periodThree, periodThreeGrade, newGPA));
			
			Roster.roster();
		}
	}
