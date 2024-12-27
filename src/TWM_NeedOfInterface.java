interface Computer{
    public abstract void code();
}

class MyLaptop implements Computer{
    public void code(){
        System.out.println("Code, Compile, Run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Code, Compile, Run : Faster");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();
        System.out.println("Coding...");
    }
}

public class TWM_NeedOfInterface {
    public static void main(String[] args) {
        Computer lap = new MyLaptop();
        Computer desk = new Desktop();

        Developer maseera = new Developer();
        maseera.devApp(desk);


    }
}
