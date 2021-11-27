import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        StudentID studentID1 = new StudentID(113, 19);
        System.out.println(studentID1.id);//bunu mu oluşturcaz şimdi

        Schedule schedule1 = new Schedule();

        Semester fall20 = new Semester(1, "Fall"); 

        ArrayList<Course> oopPre = new ArrayList<Course>();
        ArrayList<Student> studentsExample = new ArrayList<Student>(); 
        ArrayList<String> logsExample = new ArrayList<String>(); 
        

        Course oop = new Course("CSE3033", "OOSD", fall20, schedule1, studentsExample, 5, oopPre, 1, 50, "Lab"); 

        Transcript transcript1 = new Transcript(); 

        Student student1 = new Student(72612, "Ahmet", "Can", "a@hotmail.com", studentID1, 2020, schedule1, transcript1, transcript1, oopPre, logsExample);
        System.out.println(student1);// nasıl yani
        
    }
}
