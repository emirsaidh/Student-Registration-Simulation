public class StudentID {

    private int rank;
    private int year;
    private final String department = "1501"; // Only for computer engineering

    public StudentID(int year, int rank) {
        this.year = year;
        this.rank = rank;
    }

    private String registrationYear() { // Finds reg year of students
        return String.valueOf((2021 - year) % 100);
    }

    public String getStudentID() {
        return department + registrationYear() + String.format("%03d", rank);
    }

    public String toString() {
        return getStudentID();
    }
}