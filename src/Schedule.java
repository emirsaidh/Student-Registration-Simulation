import java.util.Arrays;

public class Schedule {
    
    int [][] courseTime;

    //Empty consturctor
    public Schedule() {
    }

    //Constructor
    public Schedule(int[][] courseTime) {
        this.courseTime = courseTime;
    }

    //Getters & Setters
    public int[][] getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(int[][] courseTime) {
        this.courseTime = courseTime;
    }

    //toString
    @Override
    public String toString() {
        return "Schedule [courseTime=" + Arrays.toString(courseTime) + "]";
    }

    
}
