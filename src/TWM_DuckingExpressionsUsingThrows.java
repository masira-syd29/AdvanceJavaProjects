class Duck{
    public void dShow() throws ClassNotFoundException{
        try {
            Class.forName("SAM");
        } catch (ClassNotFoundException e) {
            System.out.println("Not able to find class");
            throw e;
        }
    }
}

public class TWM_DuckingExpressionsUsingThrows {
    static {
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        Duck d = new Duck();
        try {
            d.dShow();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
