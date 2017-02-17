import java.util.ArrayList;
import java.util.Arrays;
/**
 * Creates a new Student
 * 
 * @author Tre 
 * @version 2/9/2017
 */
public class Student
{
    private int studentId;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] _grades;
    
   public Student(int studentId,String firstName, String lastName, String email, int age, int[] grades)
    {
        this.studentId= studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this._grades = grades;               
    }
    
   public int getStudentId()
    {
       return this.studentId;           
    }
    
   public String getFirstName()
    {
      return this.firstName;    
    }

   public String getLastName()
   {
     return this.lastName;  
   }
    
   public String getEmail()
   {
     return this.email;  
   }
    
   public int getAge()
   {
    return this.age;
   }
   
   public int[] getGrades()
   {
    return this._grades;
   }
   
   public void setStudentId(int studentId)
   {
    this.studentId = studentId;    
   }
   
   public void setFirstName(int studentId)
   {
    this.firstName = firstName;    
   }
   
   public void setLastName(int studentId)
   {
    this.lastName = lastName;    
   }
   
   public void setEmail(String email)
   {
    this.email = email;    
   }
   
   public void setAge(int age)
   {
    this.age = age; 
   }
   
   public void setGrades(int[] grades)
   {
    this._grades = grades; 
   }
   
   public String toString()
   {
       return "Student Info[ Student ID: " + this.getStudentId() + "\t First Name: " + this.getFirstName() + "\t Last Name: " + this.getLastName() + "\t Email " + this.getEmail()
            + "\t Age: " + getAge() + Arrays.toString(getGrades()) +"]";
            
   }
   
   public void print()
   {
       System.out.println(toString());
   }
}
