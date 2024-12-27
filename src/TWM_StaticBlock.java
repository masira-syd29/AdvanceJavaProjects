import static java.lang.Class.forName;

class Mobile1{
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("I static Block");
    }
    public Mobile1(){
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    public void show(){
        System.out.println(brand+":"+name+":"+price);
    }

}

public class TWM_StaticBlock {
    public static void main(String[] args) {
        //Class.forName("Mobile1");
        Mobile1 obj = new Mobile1();
        obj.brand = "Apple";
        obj.price = 56000;
        obj.name = "Iphone";

        Mobile1 obj1 = new Mobile1();
    }
}
