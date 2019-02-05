
public class Student
	{
		private String firstName;
		private String lastName;
		private double gpa;
		private String one;
		private String oneGrade;
		private String two;
		private String twoGrade;
		private String three;
		private String threeGrade;
		
		public Student(String f, String l, double g, String o, String oG, String t, String tG, String th, String thG)
		{
			firstName = f;
			lastName = l;
			gpa = g;
			one = o;
			oneGrade = oG;
			two = t;
			twoGrade = tG;
			three = th;
			threeGrade = thG;
		}
		
		public String getFirstName()
			{
				return firstName;
			}
		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}
		public String getLastName()
			{
				return lastName;
			}
		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}
		public double getGpa()
			{
				return gpa;
			}
		public void setGpa(double gpa)
			{
				this.gpa = gpa;
			}
		public String getOne()
			{
				return one;
			}
		public void setOne(String one)
			{
				this.one = one;
			}
		public String getOneGrade()
			{
				return oneGrade;
			}
		public void setOneGrade(String oneGrade)
			{
				this.oneGrade = oneGrade;
			}
		public String getTwo()
			{
				return two;
			}
		public void setTwo(String two)
			{
				this.two = two;
			}
		public String getTwoGrade()
			{
				return twoGrade;
			}
		public void setTwoGrade(String twoGrade)
			{
				this.twoGrade = twoGrade;
			}
		public String getThree()
			{
				return three;
			}
		public void setThree(String three)
			{
				this.three = three;
			}
		public String getThreeGrade()
			{
				return threeGrade;
			}
		public void setThreeGrade(String threeGrade)
			{
				this.threeGrade = threeGrade;
			}
		
	}
