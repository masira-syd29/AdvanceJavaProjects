public class TWM_ThrowAndThrows {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try
        {
            j = 18/i;
            if(j==0)
                throw new ArithmeticException("I don't want a zero");
        } catch (ArithmeticException e) {
            j = 18/1;
            System.out.println("Cannot divide by zero"+e);
        }
        catch (Exception e) {
            System.out.println("Something went wrong"+e);
        }
        System.out.println(j);
    }
}
