import java.util.ArrayList;

public class CourseSection {

    private Course course;
    private boolean full;
    private int sectionHour;
    ArrayList<Student> students;
    private boolean[][] courseSchedule;
    private int numberOfQuotaFail=0;
    private int numberOfPrereqFail=0;
    private int numberOfCollisionFail=0;
    private int numberOfCreditFail=0;
    private String failedQuota="";
    private String failedPrereq="";
    private String failedCollision="";
    private String failedCredit="";

    public CourseSection(Course course) {
        this.course = course;
        this.courseSchedule = new boolean[5][8];
        this.students = new ArrayList<>();
        setSectionHour();
        setCourseSchedule();
    }

    private void setCourseSchedule() { // This method sets course's days and hours randomly
        for (int i = 0; i < sectionHour; i++) {
            int day = (int)(Math.random() * 5); // Generates random day from 5 working days
            int hour = (int)(Math.random() * 8); // Generates random hours from 8 working hours

            if (!courseSchedule[day][hour]) { // Generated values assigns to the course program array only if particular schedule is available
                courseSchedule[day][hour] = true;
            }else {
                i--; // If it is not decreases i and tries another schedule 
            }
        }
    }

    public void addStudent(Student student) { // This methods registers students to the courses if courses quotas are not full
        if (!isFull()) {
            students.add(student);
            student.newCourses(this); // Calls newCourses method from student's class for registration
            if (getQuota() == students.size()) { // Sets the full true if after the addition, course section is full
                setFull(true);
            }
        }else {
            student.setLogString("\nThe student couldn't register for " + getCourseSectionCode() + " because " +
                    "of a quota problem.");
            numberOfQuotaFail++;
            failedQuota += student.getStudentID();
        }

    }

    public int getQuota() {
        return course.getQuota();
    }

    public boolean isFull() {
        return students.size() == getQuota();
    }

    public Course getCourse() {
        return course;
    }

    public String getCourseSectionCode() {
        return getCourse().getCourseCode();
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public void setSectionHour() {
        sectionHour = course.getSectionHours();
    }

    public boolean[][] getCourseSchedule() {
        return courseSchedule;
    }

    public int getNumberOfQuotaFail() {
        return numberOfQuotaFail;
    }

    public int getNumberOfPrereqFail() {
        return numberOfPrereqFail;
    }

    public void setNumberOfPrereqFail(int numberOfPrereqFail) {
        this.numberOfPrereqFail = numberOfPrereqFail;
    }

    public int getNumberOfCollisionFail() {
        return numberOfCollisionFail;
    }

    public void setNumberOfCollisionFail(int numberOfCollisionFail) {
        this.numberOfCollisionFail = numberOfCollisionFail;
    }

    public int getNumberOfCreditFail() {
        return numberOfCreditFail;
    }

    public void setNumberOfCreditFail(int numberOfCreditFail) {
        this.numberOfCreditFail = numberOfCreditFail;
    }

    public String getFailedQuota() {
        return failedQuota;
    }

    public String getFailedPrereq() {
        return failedPrereq;
    }

    public void setFailedPrereq(String failedPrereq) {
        this.failedPrereq = failedPrereq;
    }

    public String getFailedCollision() {
        return failedCollision;
    }

    public void setFailedCollision(String failedCollision) {
        this.failedCollision = failedCollision;
    }

    public String getFailedCredit() {
        return failedCredit;
    }

    public void setFailedCredit(String failedCredit) {
        this.failedCredit = failedCredit;
    }


}