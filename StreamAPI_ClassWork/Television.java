import javax.crypto.spec.GCMParameterSpec;

public class Television {
    int year;
    String name;
    int price;
    int diagonal;
    String  prod;

    public int getDiagonal() {
        return diagonal;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getProd() {
        return prod;
    }
    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return this.price+" "+this.prod+" "+this.name+" "+this.year+" "+this.diagonal;

    }
    public Television(int price,String prod, String name, int year, int dia)
    {
        this.prod= prod;
        this.name= name;
        this.price= price;
        this.diagonal= dia;
        this.year= year;
    }
}
