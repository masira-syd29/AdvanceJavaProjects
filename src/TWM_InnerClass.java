class I{
    int age;
    public void see(){
        System.out.println("In See");
    }
    static class N{
        public void config(){
            System.out.println("In config");
        }
    }
}

public class TWM_InnerClass {
    public static void main(String[] args) {
        I obj = new I();
        obj.see();

        I.N obj1 = new I.N(); //In order to access this syntax you will have to make the N class Static with static keyword
        //I.N obj1 = obj.new N(); Non Static Syntax
        obj1.config();
    }
}
