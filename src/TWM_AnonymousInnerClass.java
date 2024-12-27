class P{
    public void saw(){
        System.out.println("In M Saw");
    }
}
class L extends P{
    @Override
    public void saw() {
        System.out.println("In L Saw");
    }
}

public class TWM_AnonymousInnerClass {
    public static void main(String[] args) {
        P p = new P(){  //New Inner Class
            public void saw() {
                System.out.println("In new Saw");
            }
        };
        p.saw();

    }
}
