class Hi extends Thread{
    public void run(){
        for(int i=1; i<=100; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Bye extends Thread{
    public void run(){
        for(int i=1; i<=100; i++){
            System.out.println("Bye");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TWM_MultipleThreads {
    public static void main(String[] args) {
        Hi obj = new Hi();
        Bye obj1 = new Bye();

//        System.out.println(obj.getPriority());
//        obj1.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj1.start();

    }
}
