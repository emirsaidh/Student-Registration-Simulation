import java.util.ArrayList;

public class Course {
    
    String courseCode;
    String courseName;
    Semester givenSemester;
    Schedule courseSchedule;
    ArrayList<Student> students;
    int courseCredit;
    ArrayList<Course> prerequsities;
    int section;
    int quota;
    String type;
    
    public Course() {
    }

    public Course(String courseCode, String courseName, Semester givenSemester, Schedule courseSchedule,
            ArrayList<Student> students, int courseCredit, ArrayList<Course> prerequsities, int section, int quota,
            String type) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.givenSemester = givenSemester;
        this.courseSchedule = courseSchedule;
        this.students = students;
        this.courseCredit = courseCredit;
        this.prerequsities = prerequsities;
        this.section = section;
        this.quota = quota;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Course [courseCode=" + courseCode + ", courseCredit=" + courseCredit + ", courseName=" + courseName
                + ", courseSchedule=" + courseSchedule + ", givenSemester=" + givenSemester + ", prerequsities="
                + prerequsities + ", quota=" + quota + ", section=" + section + ", students=" + students + ", type="
                + type + "]";
    }

    

}
