import java.util.Scanner;
class StudentDatabase
  
{

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)
		
	{
        
		System.out.println("Welcome to student details");
		System.out.println("Enter student Id");
		int id=s.nextInt();
		System.out.println("Enter name of the student");
		String name=s.next();
		System.out.println("Enter class name");
	    String class_name=s.next();
		System.out.println("Enter teaher name");
		String teacher_name=s.next();
		System.out.println();
	

		
		
			System.out.println("student name : "+name);
			System.out.println("Student ID   : "+id);
			System.out.println("Class name   : "+class_name);
			System.out.println("Teacher name : "+teacher_name);
		}
}

    
