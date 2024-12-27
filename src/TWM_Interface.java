

interface D {
    int age = 34; //final & static variables
    String area = "Mumbai";
    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X{

}
class F implements D, X {
    public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In Config");
    }
    public void run() {
        System.out.println("In run");
    }
}


public class TWM_Interface {
    public static void main(String[] args) {
        D obj = new F();
        obj.config();
        obj.show();

        X obj1 = new F();
        obj1.run();


        System.out.println(D.age);
        System.out.println(D.area);
    }
}
