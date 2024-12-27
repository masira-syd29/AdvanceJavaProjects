class Counter {
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class TWM_ThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();


        Runnable obj = () -> //You can just create an innerClass and then convert it to a lambda expression, excellent!
        {
            for(int i=1; i<=10000; i++){
               c.increment();
            }
        };
        Runnable obj1 = () ->
        {
            for(int i=1; i<=10000; i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

        t1.join(); //throws random values like 116,129,909,139 then we use join and synchronized keyword in method
        t2.join();
        System.out.println(c.count);
    }
}
