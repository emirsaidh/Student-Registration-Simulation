public class Transcript {

    private Student student;

    public Transcript(Student student) {
        this.student = student;
    }

    /**
     * This method sums of credits for each course that student passed
     */
    public int calculateCredits() {
        int sumOfcredits = 0;
        for (PreviousCourseGrade g : student.getGrades()) {
            sumOfcredits += g.getCourse().getCredits();
        }
        return sumOfcredits;
    }

    public double calculateGPA() {
        double creditMultiplyGrade = 0;
        for (PreviousCourseGrade g : student.getGrades()) {
            if (g.convertLetterGrade() == "AA") {
                creditMultiplyGrade += g.getCourse().getCredits() * 4.0;
            }
            else if (g.convertLetterGrade() == "BA") {
                creditMultiplyGrade += g.getCourse().getCredits() * 3.50;
            }
            else if (g.convertLetterGrade() == "BB") {
                creditMultiplyGrade += g.getCourse().getCredits() * 3.0;
            }
            else if (g.convertLetterGrade() == "CB") {
                creditMultiplyGrade += g.getCourse().getCredits() * 2.5;
            }
            else if (g.convertLetterGrade() == "CC") {
                creditMultiplyGrade += g.getCourse().getCredits() * 2.0;
            }
            else if (g.convertLetterGrade() == "DC") {
                creditMultiplyGrade += g.getCourse().getCredits() * 1.5;
            }else if (g.convertLetterGrade() == "DD") {
                creditMultiplyGrade += g.getCourse().getCredits() * 1.0;
            }else if (g.convertLetterGrade() == "FF") {
                creditMultiplyGrade += g.getCourse().getCredits() * 0;
            }

        }
        return creditMultiplyGrade / calculateCredits();
    }
}