import java.util.Arrays;

public class Schedule {
    /*First dimension of array for days
    Monday = 0; Tuesday =1 etc
    Second dimension of arrray for lecture hourss
    9:30 - 10:20 = 0; 10:30 - 11:20 = 1; 11:30 - 12:20 = 2; 13:00 - 13-50 = 3; 14:00 - 14:50 = 4;
    15:00 - 15:50 = 5; 16:00 - 16:50 = 6; 17:00 - 17:50 = 7; 18:00 - 18:50 = 8; 
    */
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
