enum Status{//Type
    Running, Failed, Pending, Success;  //objects

}

public class TWM_Enum {
    public static void main(String[] args) {
        Status[] ss = Status.values();
        //System.out.println(s.ordinal());
        System.out.println(ss[0]);

        Status s1 = Status.Failed;
        System.out.println(s1);

        Status s2 = Status.Pending;
        System.out.println(s2);

        Status s3 = Status.Success;
        System.out.println(s3);
        for(Status s : ss) {
            System.out.println(s + ":" + s.ordinal());
        }


    }
}
