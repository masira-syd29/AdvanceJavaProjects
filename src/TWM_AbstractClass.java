abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Play Music");
    }
}
abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving");
    }

//    @Override
//    public void fly() {
//        System.out.println("Flying");
//    }
}
class UpdatedWagonR extends WagonR{ //Concrete Class where you can create and object but not of an Abstract Class
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}

public class TWM_AbstractClass {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
