import java.util.ArrayList;

public class Course {
    
    private String courseCode;
    private String courseName;
    private Semester givenSemester;
    private Schedule courseSchedule;
    private ArrayList<Student> students; 
    private int courseCredit;
    private ArrayList<Course> prerequsities;

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

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Semester getGivenSemester() {
        return givenSemester;
    }

    public void setGivenSemester(Semester givenSemester) {
        this.givenSemester = givenSemester;
    }

    public Schedule getCourseSchedule() {
        return courseSchedule;
    }

    public void setCourseSchedule(Schedule courseSchedule) {
        this.courseSchedule = courseSchedule;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public ArrayList<Course> getPrerequsities() {
        return prerequsities;
    }

    public void setPrerequsities(ArrayList<Course> prerequsities) {
        this.prerequsities = prerequsities;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private int section;
    private int quota;
    private String type; 
    


    @Override
    public String toString() {
        return "Course [courseCode=" + courseCode + ", courseCredit=" + courseCredit + ", courseName=" + courseName
                + ", courseSchedule=" + courseSchedule + ", givenSemester=" + givenSemester + ", prerequsities="
                + prerequsities + ", quota=" + quota + ", section=" + section + ", students=" + students + ", type="
                + type + "]";
    }

    

}
