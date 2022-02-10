import java.lang.reflect.Constructor;

public class Car {
    int price;
    String name;
    String color;
    int year;
    int volue;
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getVolue() {
        return volue;
    }
    public int getYear() {
        return year;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setVolue(int volue) {
        this.volue = volue;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    public Car(int price,String color, String name, int year, int volue)
    {
        this.color= color;
        this.name= name;
        this.price= price;
        this.volue= volue;
        this.year= year;
    }
    @Override
    public String toString() {
        return this.price+" "+this.color+" "+this.name+" "+this.year+" "+this.volue;
    }
}
