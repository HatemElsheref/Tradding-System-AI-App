package airesearch;
/*@author Hatem Mohamed*/
public class Book {
    public String GloalName;
    private String name;
    private Float price;
    public Book(String globalname,String name,Float price){
        this.GloalName=globalname;
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return this.name;
    }
     public Float getPrice(){
        return this.price;
    }
}
