enum Status1{//Type
    Running, Failed, Pending, Success;  //objects

}

public class TWM_EnumIfAndSwitch {
    public static void main(String[] args) {
        Status s = Status.Success;
//        if(s == Status.Running){
//            System.out.println("All Good");
//        } else if (s == Status.Success) {
//            System.out.println("Done Success");
//        } else if (s == Status.Pending) {
//            System.out.println("Please Wait");
//        } else {
//            System.out.println("Try again");
//        }

        switch (s) {
            case Running -> System.out.println("All good");
            case Failed -> System.out.println("Try again");
            case Pending -> System.out.println("Please wait");
            default -> System.out.println("Done");

        }
    }
}
