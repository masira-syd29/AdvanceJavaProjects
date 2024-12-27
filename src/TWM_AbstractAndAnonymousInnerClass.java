abstract class S{
    public abstract void look();
    public abstract void func();
}
class M extends S{
    @Override
    public void look() {
        System.out.println("In M look");
    }

    @Override
    public void func() {
        System.out.println("In M func");
    }
}

public class TWM_AbstractAndAnonymousInnerClass {
    public static void main(String[] args) {
        S s = new S(){
            public void look() {
                System.out.println("In New look");
            }
            public void func(){
                System.out.println("In new Func");
            }
        };
        s.look();
        s.func();
    }
}
