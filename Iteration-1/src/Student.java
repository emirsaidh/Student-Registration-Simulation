import java.util.ArrayList;

public class Student extends Person{
    
    private StudentID studentID;
    private int yearEnrolled;
    private Schedule schedule;
    private Transcript lastTranscript;
    private Transcript nextTranscript;
    private ArrayList<Course> collisionCourses;
    private ArrayList<String> logs;

    public Student() {
    }

    public Student(String ssn, String firstName, String lastname, String email, StudentID studentID,
            int yearEnrolled, Schedule schedule, Transcript lastTranscript, Transcript nextTranscript,
            ArrayList<Course> collisionCourses, ArrayList<String> logs) {
        super(ssn, firstName, lastname, email);
        this.studentID = studentID;
        this.yearEnrolled = yearEnrolled;
        this.schedule = schedule;
        this.lastTranscript = lastTranscript;
        this.nextTranscript = nextTranscript;
        this.collisionCourses = collisionCourses;
        this.logs = logs;
    }

    public StudentID getStudentID() {
        return studentID;
    }

    public void setStudentID(StudentID studentID) {
        this.studentID = studentID;
    }

    public int getYearEnrolled() {
        return yearEnrolled;
    }

    public void setYearEnrolled(int yearEnrolled) {
        this.yearEnrolled = yearEnrolled;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Transcript getLastTranscript() {
        return lastTranscript;
    }

    public void setLastTranscript(Transcript lastTranscript) {
        this.lastTranscript = lastTranscript;
    }

    public Transcript getNextTranscript() {
        return nextTranscript;
    }

    public void setNextTranscript(Transcript nextTranscript) {
        this.nextTranscript = nextTranscript;
    }

    public ArrayList<Course> getCollisionCourses() {
        return collisionCourses;
    }

    public void setCollisionCourses(ArrayList<Course> collisionCourses) {
        this.collisionCourses = collisionCourses;
    }

    public ArrayList<String> getLogs() {
        return logs;
    }

    public void setLogs(ArrayList<String> logs) {
        this.logs = logs;
    }

    public void showTranscript(){}

    @Override
    public String toString() {
        return "Student [FirstName= " + super.getFirstName() + ", LastName= " + super.getLastname() + ", SSN= " + super.getSsn() + ", Email= " + super.getEmail() 
                + ", collisionCourses= " + collisionCourses + ", lastTranscript= " + lastTranscript + ", logs= " + logs
                + ", nextTranscript= " + nextTranscript + ", schedule= " + schedule + ", studentID= " + studentID
                + ", yearEnrolled= " + yearEnrolled + "]";
    }


 
}
