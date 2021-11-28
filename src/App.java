import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
      

        StudentID studentID1 = new StudentID(113, 19);
        StudentID studentID2 = new StudentID(1, 17);
        StudentID studentID3 = new StudentID(18, 20);
        //System.out.println(studentID1.id);

        int scheduleArray[][] = new int[5][9]; 
        Schedule schedule1 = new Schedule(scheduleArray);

        Semester fall20 = new Semester(3, "Fall");
        Semester fall19 = new Semester(1, "Fall");  

        ArrayList<Course> oopPre = new ArrayList<Course>();
        ArrayList<Course> emptyList = new ArrayList<Course>();
        ArrayList<Student> studentsExample = new ArrayList<Student>(); 
        ArrayList<String> logsExample = new ArrayList<String>(); 
        

        Course oop = new Course("CSE3033", "OOSD", fall20, schedule1, studentsExample, 5, oopPre, 1, 50, "Lab");
        Course java2 = new Course("CSE1142", "Java2", fall19, schedule1, studentsExample, 5, emptyList, 3, 30, "Lab"); 
        oopPre.add(java2);

        Transcript transcript1 = new Transcript(); 

        Student stu1 = new Student("1405768679", "Ahmet", "Can", "abc@gmail.com", studentID1, 2019, schedule1, transcript1, transcript1, oopPre, logsExample);
        Student stu2 = new Student("1501991817", "Emir", "Said", "es@gmail.com", studentID2, 2017, schedule1, transcript1, transcript1, oopPre, logsExample);
        Student stu3 = new Student("5688493729", "Recep", "Tayyip", "rt@gmail.com", studentID3, 2020, schedule1, transcript1, transcript1, oopPre, logsExample);
       
        System.out.println(stu1);
        System.out.println(stu2);
        //System.out.println(stu1.getStudentID()); //ynei geldi
        
    }
}
