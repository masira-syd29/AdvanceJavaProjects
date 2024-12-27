@FunctionalInterface
//Lambda Expression works only with a Functional Interface
interface Function1{
    //void show(int i, int j);
    int add(int i, int j);

}
public class TWM_LambdaExpression {
    public static void main(String[] args) {
//        Function1 fs = new Function1() {
//            @Override
//            public void show(int i, int j) {
//                System.out.println("Old way of creating objects");
//            }
//        };
//
//        Function1 fs1 = (i,j) ->
//        {
//            System.out.println("New way lambda Expression");
//        };
//        fs1.show(4,5);
//
//        Function1 fs2 = (i, j) -> System.out.println("Simplest Lambda Expression" + i+ ":" +j);
//        fs2.show(3,5);

        Function1 fs3 = (i, j) -> i+j;
        int result = fs3.add(5,7);
        System.out.println(result);
    }
}
