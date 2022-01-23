package week1.day1;

public class Student {
  String studentName ="Pavana";
  int rollNumber=15;
  public void printCollege() 
      {
    	String name = "Mysore University";
      	     System.out.println("The Name of the college  is:" +name);
      }
    public static void main(String[]args)
    {
    	Student s = new Student();
	     System.out.println("The student roll number is:" +s.rollNumber);
	     System.out.println("The student name is:" +s.studentName);
         s.printCollege();
    }
}