import java.util.ArrayList;

public class ElectiveCourse extends Course{
    
    private String electiveCourseCode;
    public String getElectiveCourseCode() {
        return electiveCourseCode;
    }

    public void setElectiveCourseCode(String electiveCourseCode) {
        this.electiveCourseCode = electiveCourseCode;
    }

    public String getElectiveCourseName() {
        return electiveCourseName;
    }

    public void setElectiveCourseName(String electiveCourseName) {
        this.electiveCourseName = electiveCourseName;
    }

    private String electiveCourseName;

    public ElectiveCourse() {
    }
    
    public ElectiveCourse(String courseCode, String courseName, Semester givenSemester, Schedule courseSchedule,
            ArrayList<Student> students, int courseCredit, ArrayList<Course> prerequsities, int section, int quota,
            String type, String electiveCourseCode, String electiveCourseName) {
        super(courseCode, courseName, givenSemester, courseSchedule, students, courseCredit, prerequsities, section,
                quota, type);
        this.electiveCourseCode = electiveCourseCode;
        this.electiveCourseName = electiveCourseName;
    }
    
}
