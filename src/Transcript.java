import java.util.ArrayList;

public class Transcript {
    
    Semester semester;
    ArrayList<Double> gpa;
    double totalGPA;
    ArrayList<Integer> passedCredits; 
    ArrayList<Integer> failedCredits;
    ArrayList<Course> coursesPassed; 
    ArrayList<Course> coursesFailed;
    ArrayList<Course> coursesNotTaken;
    ArrayList<Course> activeCourses;
    //nasıl yani nerde
    
    public Transcript() {
    }

    public Transcript(Semester semester, ArrayList<Double> gpa, double totalGPA, ArrayList<Integer> passedCredits,
            ArrayList<Integer> failedCredits, ArrayList<Course> coursesPassed, ArrayList<Course> coursesFailed,
            ArrayList<Course> coursesNotTaken, ArrayList<Course> activeCourses) {
        this.semester = semester;
        this.gpa = gpa; 
        this.totalGPA = totalGPA;
        this.passedCredits = passedCredits;
        this.failedCredits = failedCredits;
        this.coursesPassed = coursesPassed;
        this.coursesFailed = coursesFailed;
        this.coursesNotTaken = coursesNotTaken;
        this.activeCourses = activeCourses;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public ArrayList<Double> getGpa() {
        return gpa;
    }

    public void setGpa(ArrayList<Double> gpa) {
        this.gpa = gpa;
    }

    public double getTotalGPA() {
        return totalGPA;
    }

    public void setTotalGPA(double totalGPA) {
        this.totalGPA = totalGPA;
    }

    public ArrayList<Integer> getPassedCredits() {
        return passedCredits;
    }

    public void setPassedCredits(ArrayList<Integer> passedCredits) {
        this.passedCredits = passedCredits;
    }

    public ArrayList<Integer> getFailedCredits() {
        return failedCredits;
    }

    public void setFailedCredits(ArrayList<Integer> failedCredits) {
        this.failedCredits = failedCredits;
    }

    public ArrayList<Course> getCoursesPassed() {
        return coursesPassed;
    }

    public void setCoursesPassed(ArrayList<Course> coursesPassed) {
        this.coursesPassed = coursesPassed;
    }

    public ArrayList<Course> getCoursesFailed() {
        return coursesFailed;
    }

    public void setCoursesFailed(ArrayList<Course> coursesFailed) {
        this.coursesFailed = coursesFailed;
    }

    public ArrayList<Course> getCoursesNotTaken() {
        return coursesNotTaken;
    }

    public void setCoursesNotTaken(ArrayList<Course> coursesNotTaken) {
        this.coursesNotTaken = coursesNotTaken;
    }

    public ArrayList<Course> getActiveCourses() {
        return activeCourses;
    }

    public void setActiveCourses(ArrayList<Course> activeCourses) {
        this.activeCourses = activeCourses;
    }

    public void calculateGPAs(int term){}

    public double calculateTermGPA(ArrayList<Course> termPassed, ArrayList<Course> termFailed){
        return 0.0;}

    public int calculateTakenCredit(){
        return 0;
    }

    public int calculateCompletedCredit(){
        return 0;
    }

    public double getGradeEquivalent(String grade){
        return 0.0;
    }

    
    
}
