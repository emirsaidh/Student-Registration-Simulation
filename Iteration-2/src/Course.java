public class Course {

    private String courseCode;
    private String courseName;
    private String semester;
    private int quota;
    private int credits;
    private int[] sectionHours = new int[2];
    private int year;
    private int requiredCredits;
    private Course prerequisite;
    private double passingCourseProb;


    public Course(String courseCode, String courseName, String semester, int quota,
                  int credits, int theoric, int lab, int year, int requiredCredits,
                  Course prerequisite, double passingCourseProb) {

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.semester = semester;
        this.quota = quota;
        this.credits = credits;
        this.year = year;
        this.requiredCredits = requiredCredits;
        this.prerequisite = prerequisite;
        this.passingCourseProb = passingCourseProb;
        setSectionHours(theoric, lab);
    }

    public double getPassingCourseProb() {
        return passingCourseProb;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getSemester() {
        return semester;
    }

    public int getQuota() {
        return quota;
    }

    public int getCredits() {
        return credits;
    }

    public int getYear() {
        return year;
    }

    public int getRequiredCredits() {
        return requiredCredits;
    }

    public Course getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(Course prerequisite) {
        this.prerequisite = prerequisite;
    }

    public int getSectionHours() { //Returns the total section hours by summing theoric and lab hours
        return sectionHours[0] + sectionHours[1];
    }

    public void setSectionHours(int theoric, int lab) {
        this.sectionHours = new int[]{theoric, lab};
    }


}