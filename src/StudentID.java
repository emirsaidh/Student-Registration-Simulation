public class StudentID {
    
    private int order;
    private String id;
    private int year;

    public StudentID(int order, int year) {
        this.order = order;
        this.year = year;
        generateRandomID(order, year); 
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String generateRandomID(int order, int year){
        //bunu constructor içine alalım mı şimdi
        id = "1501";
        if(order >= 100){
            id += year + "" + order;
        }else if(order >= 10){
            id += year + "0" + order;
        }else{
            id += year + "00" + order;
        }
        return id;
    }

    @Override
    public String toString() {
        return "StudentID [id=" + id + ", order=" + order + ", year=" + year + "]";
    }

    
}
