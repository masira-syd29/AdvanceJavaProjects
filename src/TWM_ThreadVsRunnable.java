//class Talk implements Runnable{
//    public void run(){
//        for(int i=1; i<=5; i++){
//            System.out.println("Hi");
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//class Back implements Runnable{
//    public void run(){
//        for(int i=1; i<=5; i++){
//            System.out.println("Bye");
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

public class TWM_ThreadVsRunnable {
    public static void main(String[] args) {
        Runnable obj = () -> //You can just create and innerClass and then convert it to a lambda expression, excellent!
        {
            for(int i=1; i<=5; i++){
                System.out.println("Hi");
                try {Thread.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}
            }
        };
        Runnable obj1 = () ->
        {
            for(int i=1; i<=5; i++){
                System.out.println("Bye");
                try {Thread.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
    }
}
