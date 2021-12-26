public class Semester {
    
    private int num;
    private String name;
    
    //Empty constructor
    public Semester(){}
    
    //Constructor
    public Semester(int num, String name) {
        this.num = num;
        this.name = name;
    }

    //Geters & Setters
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    //toString
    @Override
    public String toString() {
        return "Semester [name=" + name + ", num=" + num + "]";
    }

    
}
