class Mobile{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand+":"+name+":"+price);
    }
    public static void show1(Mobile obj){
        System.out.println("I am a static method");
        System.out.println(obj.brand+":"+name+":"+obj.price);  //non-static variable price cannot be referenced from a static context
    }
}

public class TWM_StaticKeywordAndMethods {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 56000;
        obj.name = "Iphone";

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 36000;
        Mobile.name = "Galaxy";  // this is how static variables are used and defined with class name and not object name

        Mobile.name = "Phone";

        obj.show();
        obj1.show();

        Mobile.show1(obj);

    }
}
