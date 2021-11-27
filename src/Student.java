import java.util.ArrayList;

public class Student {
    
    StudentID studentID;
    int yearEnrolled;
    Schedule schedule;
    Transcript lastTranscript;
    Transcript nextTranscript;
    ArrayList<Course> collisionCourses;
    ArrayList<String> logs;

    public Student() {
    }

    //After extends person change contructor with superclass attributes
    public Student(StudentID studentID, int yearEnrolled, Schedule schedule, Transcript lastTranscript,
            Transcript nextTranscript, ArrayList<Course> collisionCourses, ArrayList<String> logs) {
        this.studentID = studentID;
        this.yearEnrolled = yearEnrolled;
        this.schedule = schedule;
        this.lastTranscript = lastTranscript;
        this.nextTranscript = nextTranscript;
        this.collisionCourses = collisionCourses;
        this.logs = logs;
    }

    public void showTranscript(){}

    

}
