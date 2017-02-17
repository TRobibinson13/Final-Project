import java.util.ArrayList;
/**
 * Write a description of class Roster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roster
{
   private static ArrayList<Student> classRoster = new ArrayList<Student>();
    public static void main(String[] args)
   {       
       setUpRoster();
       
       print_all();
       print_invalid_emails();
       for(Student student : classRoster)
       {
           print_average_grade(Integer.toString(student.getStudentId()));
       }
       remove("3");
       remove("3");

    }
   
   public static void print_all()
   {
      for (Student student : classRoster)
       {
           student.print();
       } 
   }
   
   public static void setUpRoster()
   {
       Student student1 = new Student(1, "John", "Smith", "John1989@gmail.com", 20, new int[] {88, 79, 59});
       Student student2 = new Student(2, "Suzan", "Erickson", "Erickson_1990@gmailcom", 19, new int[] {91, 72, 85});
       Student student3 = new Student(3, "Jack", "Napoli", "The_lawyer99yahoo.com", 19, new int[] {85, 84, 87});
       Student student4 = new Student(4, "Erin", "Black", "Erin.black@comcast.net", 22, new int[] {91, 98, 82});
       Student student5 = new Student(5, "Tre", "Robinson", "trerrobinson@gmail.com", 23, new int[] {90, 91, 92});
       
       classRoster.add(student1);
       classRoster.add(student2);
       classRoster.add(student3);
       classRoster.add(student4);
       classRoster.add(student5);
       
   }
   
   public static void remove(String studentId)
   {
       boolean didRemove = false;
    for(int i = 0; i < classRoster.size(); i++)
     {
       if(Integer.parseInt(studentId)==classRoster.get(i).getStudentId())
         {
           didRemove = true;
           classRoster.remove(i);
            }         
     }
    if(didRemove == false)
        {
          String error = new String("Student Cannot be Found");
          System.out.println(error);     
        }
     }    
   
   public static int findStudentIndex(String studentId)
   {
       int studentIndex = -1;  
       for( int i = 0; i < classRoster.size(); i++)
       {
           if(Integer.parseInt(studentId)==classRoster.get(i).getStudentId())
           {
              studentIndex = i;
              System.out.println("\t The index of the student" + studentId + " is: " + studentIndex);
              
              /*System.out.println("yay!" + classRoster.get(i).getStudentId() + " " + classRoster.get(i).getEmail());
              classRoster.indexOf(classRoster.get(i));
              System.out.println("\t the index is:" + classRoster.get(i).getStudentId());
              System.out.println("\t the index by object is " + classRoster.indexOf(classRoster.get(i))); 
              studentIndex = i;
              */
            }

       }
       return studentIndex;             
   }
    
   public static void print_average_grade(String studentId)
   {
       for (Student student : classRoster)
       {
        if(Integer.parseInt(studentId) == student.getStudentId())
            {
                int totalGrade = 0;
                for (int thisGrade : student.getGrades())
                {
                    totalGrade = totalGrade + thisGrade;
                }
                double avgGrade = totalGrade/(double)student.getGrades().length;
                System.out.println("The average grade for student " + studentId + " is: " + avgGrade);
            }
        }
   }
   
   public static void print_invalid_emails()
   {
       for(Student student : classRoster)
       {        
               if(student.getEmail().matches("(.*)@.*\\.(.*)"))
               {                       
               }
               else
               {
                   System.out.println("The following email address is invalid: " + student.getEmail());
               }               
       }
   }
}
