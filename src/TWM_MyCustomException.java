class MaseeraException extends Exception{
    public MaseeraException(String string) {
        super(string);
    }
}

public class TWM_MyCustomException {
    public static void main(String[] args) {
        try {
            Class.forName("TWM_2DArray");
        } catch (ClassNotFoundException e) {
            System.out.println("Not able to find class");
        }
        int i = 20;
        int j =0;

        try {
            j = 18/i;
            if(j==0)
             throw new MaseeraException("This is my custom Exception");
        } catch (MaseeraException e) {
            j =18/1;
            System.out.println("That's the default output "+e);
        }
        catch (Exception e){
            System.out.println("Something went wrong "+e);
        }
    }
}
