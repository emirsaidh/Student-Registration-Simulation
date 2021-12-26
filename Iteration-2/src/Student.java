import java.util.ArrayList;

public class Student {

    private String name;
    private StudentID studentID;
    private int registrationOrder;
    private ArrayList<PreviousCourseGrade> grades;
    private ArrayList<Course> takenCourses;
    private int year;
    private Advisor advisor;
    private WeeklySchedule schedule;
    private Transcript transcript;
    private RegistrationController registrationController;
    private String logString = "";

    public Student(String name, int year, int registrationOrder, RegistrationController registrationController) {
        this.name = name;
        this.year = year;
        this.registrationOrder = year;
        this.grades = new ArrayList<>();
        this.takenCourses = new ArrayList<>();
        this.studentID = new StudentID(year, registrationOrder);
        this.registrationController = registrationController;
        this.transcript = new Transcript(this);
        this.schedule = new WeeklySchedule(this);
    }

    public ArrayList<Course> getPassedCourses() { //
        ArrayList<Course> passedCourses = new ArrayList<>();
        for (PreviousCourseGrade g : grades) {
            passedCourses.add(g.getCourse());
        }
        return passedCourses;
    }

    public boolean isPassed(Course course) { // This method checks whether student passed to course or not
        ArrayList<Course> passedCourses = getPassedCourses();

        for (Course c : passedCourses) {
            if (course.getCourseCode().equals(c.getCourseCode())) { // If the passedCourses list contains the course's code that means student passed the course and method returns true
                return true;
            }
        }
        return false;
    }

    public void newCourses(CourseSection courseSection) {
        schedule.addToSchedule(courseSection);
        getTakenCourses().add(courseSection.getCourse());
    }

    public void getGrade(Course course) { // This method randomly appoints a grade to a passed courses (Grade should be more than 50 according to departments rules)
        int grade = (int) (Math.random() * 51) + 50;
        grades.add(new PreviousCourseGrade(course, grade));
        logString += "\n" + course.getCourseCode() + ": " + grades.get(grades.size() - 1).convertLetterGrade();
    }

    public void selectAndSendToAdvisor() {
        ArrayList<CourseSection> newCourseList = registrationController.createNewCourseList(this);
        setLogString("\n\nCourse List: \n");
        for (CourseSection c : newCourseList) {
            setLogString(c.getCourseSectionCode() + " ");
        }
        setLogString("\n");
        for (CourseSection c: newCourseList) {
            advisor.approveCourse(this, c);;
        }

        setLogString("\n\nTaken Courses: \n");
        for (Course c: takenCourses) {
            setLogString(c.getCourseCode() + " ");
        }
    }

    public String getLogString() {
        return logString;
    }

    public void setLogString(String logString) {
        this.logString += logString;
    }

    public String getName() {
        return name;
    }

    public StudentID getStudentID() {
        return studentID;
    }

    public ArrayList<PreviousCourseGrade> getGrades() {
        return grades;
    }

    public ArrayList<Course> getTakenCourses() {
        return takenCourses;
    }

    public int getYear() {
        return year;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public WeeklySchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(WeeklySchedule schedule) {
        this.schedule = schedule;
    }

    public Transcript getTranscript() {
        return transcript;
    }

}