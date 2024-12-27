
@FunctionalInterface
interface func{
    void show(int i);

}
//class func1 implements func{
//    @Override
//    public void show() {
//        System.out.println("In func1");
//    }
//}

public class TWM_FunctionalInterface {
    public static void main(String[] args) {
//        func obj = new func() {
//            @Override
//            public void show() {
//                System.out.println("In show func");
//            }
//        };

        func obj = i  ->  System.out.println("This is lambda expression " + i); //Lambda Expression shortens the code of creating object
        obj.show(4);
    }
}
