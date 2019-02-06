
public class Student
	{
		private String firstName;
		private String lastName;
		private String one;
		private String oneGrade;
		private String two;
		private String twoGrade;
		private String three;
		private String threeGrade;
		private double gpa;
		
		public Student(String f, String l, String o, String oG, String t, String tG, String th, String thG, double g)
		{
			firstName = f;
			lastName = l;
			one = o;
			oneGrade = oG;
			two = t;
			twoGrade = tG;
			three = th;
			threeGrade = thG;
			gpa = g;
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

		public double getGpa()
			{
				return gpa;
			}

		public void setGpa(double gpa)
			{
				this.gpa = gpa;
			}
		
		
		
	}
