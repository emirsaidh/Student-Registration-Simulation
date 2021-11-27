public class StudentID {
    
    int order;
    String id;
    int year;

    public StudentID(int order, int year) {
        this.order = order;
        this.year = year;
        generateRandomID(order, year); 
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
