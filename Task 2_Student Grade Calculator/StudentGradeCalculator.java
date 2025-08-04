import java.util.Scanner;

class StudentGradeCalculator
{
	public static void main(String args[])
	{
		int java, c, cpp, python, php, dbms, dsa;
		int total;
		float avg;
		String grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter your obtained marks (out of 100) for following subjects : \n");
		
		System.out.println("\n1. Java : ");
		java= sc.nextInt();
		
		System.out.println("\n2. Python : ");
		python= sc.nextInt();
		
		System.out.println("\n3. C : ");
		c= sc.nextInt();
		
		System.out.println("\n4. C++ : ");
		cpp= sc.nextInt();
		
		System.out.println("\n5. DSA : ");
		dsa= sc.nextInt();
		
		System.out.println("\n6. DBMS : ");
		dbms= sc.nextInt();
		
		System.out.println("\n7. php : ");
		php= sc.nextInt();
		
		total= (java+python+c+cpp+dsa+dbms+php);
		
		avg= (total/7);
		
		if(avg>=90)
		{
			grade="A+";
		}else if(avg>=80)
		{
			grade="A";
		}else if(avg>=70)
		{
			grade="B+";
		}else if(avg>=60)
		{
			grade="B";
		}else if(avg>=50)
		{
			grade="C";
		}else if(avg>=40)
		{
			grade="P";
		}else{
			grade="F";
		}
		
		System.out.println("\n\nYour total Marks : "+total);
		System.out.println("\n\nYour Average percentage : "+avg+"%");
		System.out.println("\n\nGrade : "+grade);
	}
}