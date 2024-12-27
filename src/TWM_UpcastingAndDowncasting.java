class A {
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A {

    public void show1() {
        System.out.println("In B show");
    }
}
public class TWM_UpcastingAndDowncasting {
    public static void main(String[] args) {
//        double d = 4.5;
//        int i = (int) d;
//        System.out.println(i);

        //A obj = (A)new B();  //Upcasting
        //obj.show();

        A obj = new B();  //DownCasting
        obj.show();

        B obj1 = (B) obj;
        obj1.show1();
    }

}
