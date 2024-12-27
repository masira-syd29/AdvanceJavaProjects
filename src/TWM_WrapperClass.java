public class TWM_WrapperClass {
    public static void main(String[] args) {
        int num = 9;
        //Integer num1 = new Integer(8);  //AutoBoxing
        Integer num1 = num;

        int num2 = num1.intValue(); //Auto-Unboxing
        System.out.println(num1);
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }
}
