@Deprecated
class Meth1{

    public void meth1(){
        System.out.println("Meth 1");
    }
}
class Meth2 extends Meth1{
    @Override
    public void meth1(){
        System.out.println("Meth 2");
    }
}

public class TWM_Annotations {
    public static void main(String[] args) {
        Meth2 m2 = new Meth2();
        m2.meth1();
    }
}
