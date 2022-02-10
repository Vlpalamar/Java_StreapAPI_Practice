import java.util.*;


/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Random r= new Random();
        Scanner in = new Scanner(System.in);

        // //Task1
        List<Integer> al= new ArrayList<Integer>();
        al=  r.ints(20,4,24).boxed().toList();
        
        System.out.print("Enter you int: ");
        int i=Integer.parseInt(in.nextLine()); 

        System.out.println("Odd= "+al.stream().filter(x->x%2==1).count());  
        System.out.println("Even= "+al.stream().filter(x->x%2==0).count());    
        System.out.println("0= "+al.stream().filter(x->x==0).count());
        System.out.println("Custom= "+al.stream().filter(x->x==i).count());        
      
        // //Task2
        // List<String> al= new ArrayList<String>();
        
        // al.add("Kyiv");
        // al.add("Moscow");
        // al.add("Pomoika");
        // al.add("Belgrad");
        // al.add("Uzgorod");
        // al.add("Uzgorod");
        // al.add("Brjanzk");

        // //All
        // System.out.println("All:\nvvvvvvvvv");
        // al.stream().forEach(System.out::println);
        // //All length>10
        // System.out.print("\nAll length>10: ");
        // System.out.print(al.stream().filter(s->s.toCharArray().length>6).count()+"\n"); 
        // String custom= in.nextLine();
        // System.out.print("\ntowns=="+custom+": ");
        // System.out.print(al.stream().filter(s->s.toLowerCase().equals(custom.toLowerCase())).count()+"\n"); 
        // System.out.print("Enter subString: ");
        // String str= in.nextLine();
        // al.stream().filter(x->x.toLowerCase().substring(0,str.length()).equals(str.toLowerCase())).forEach(System.out::println);

        // //Task3
        List<Car> cars= new ArrayList<Car>();
        cars.add(new Car(534, "Green", "GDFFG", 1345,36));
        cars.add(new Car(334, "Red", "GDFFG", 1534,35));
        cars.add(new Car(34235, "Blue", "GDFFG", 1845,43));
        cars.add(new Car(424, "Black", "GDFFG", 2001,26));
        cars.add(new Car(422, "Black", "GDFFG", 2005,29));
        cars.add(new Car(743, "White", "GDFFG", 2010,35));
        cars.add(new Car(945, "Green", "GDFFG", 2007,22));
        cars.add(new Car(643, "Green", "GDFFG", 1999,44));


        cars.stream().forEach(System.out::println);
        String color= "green";
        System.out.println("\ncars thar have color=="+color);
        cars.stream().filter(x->x.getColor().toLowerCase().equals(color.toLowerCase())).forEach(System.out::println);
        int volue=35;
        System.out.println("\ncars thar have volue=="+volue);
        cars.stream().filter(x->x.getVolue()==volue).forEach(System.out::println);
        int price=643;
        System.out.println("\ncars thar have price=="+price);
        cars.stream().filter(x->x.getPrice()>price).forEach(System.out::println);
        int yearStart=2000;
        int yearEnd= 2020;
        System.out.println("\ncars Year of more than=="+yearStart+"and less than"+ yearEnd);
        cars.stream().filter(x->x.getYear()>yearStart).filter(x->x.getYear()<yearEnd).forEach(System.out::println);

      //Task4
        // List<Television> televisions= new ArrayList<Television>();
        // televisions.add(new Television(1000, "Prod1", "GDFFG", 2000,44));
        // televisions.add(new Television(1111, "Prod2", "FGDFG", 2001,55));
        // televisions.add(new Television(1200, "Prod2", "DFG", 2006,44));
        // televisions.add(new Television(1300, "Prod3", "GDF", 2000,74));
        // televisions.add(new Television(800, "Prod1", "3JRT", 2010,44));
        // televisions.add(new Television(900, "Prod1", "DLUY", 2022,74));


        // televisions.stream().forEach(System.out::println);
        // int dia= 44;
        // System.out.println("\ntelevision that have dialog=="+dia);
        // televisions.stream().filter(x->x.getDiagonal()==dia).forEach(System.out::println);
        // String prod= "Prod2";
        // System.out.println("\ntelevision that have prod=="+prod);
        // televisions.stream().filter(x->x.getProd()==prod).forEach(System.out::println);
        // Date dt= new Date();
        // int year= dt.getYear()+1900;
        // System.out.println("\ntelevision that have year=="+year);
        // televisions.stream().filter(x->x.getYear()==year).forEach(System.out::println);
        // int price= 999;
        // System.out.println("\ntelevision that have price>"+price);
        // televisions.stream().filter(x->x.getPrice()>price).forEach(System.out::println);
        // System.out.println("\ntelevision sort price Increase");
        // televisions.stream().sorted(Comparator.comparingInt(Television::getPrice)).forEach(System.out::println);
        // System.out.println("\ntelevision sort price Decrease");
        // televisions.stream().sorted( Comparator.comparingInt(Television::getPrice).reversed()).forEach(System.out::println);
        // System.out.println("\ntelevision sort diag Increase");
        // televisions.stream().sorted(Comparator.comparingInt(Television::getDiagonal)).forEach(System.out::println);
        // System.out.println("\ntelevision sort diag Decrease");
        // televisions.stream().sorted( Comparator.comparingInt(Television::getDiagonal).reversed()).forEach(System.out::println);





    }
}