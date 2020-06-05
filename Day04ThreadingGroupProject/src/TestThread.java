class Printer {
    private static int tracker = 0;

    //method that needs to be synchornized.
    public synchronized void printCounter(String threadName, Thread currentThread) {
        int limit = 0;
        while(!(limit > 20)) {
            System.out.println("Counter:  " + tracker+ " from " + threadName);
            tracker++;
            limit++;
        }
    }
}

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    Printer PD;

    ThreadDemo( String name,  Printer pd) {
        threadName = name;
        PD = pd;
    }

    public void run() {
        System.out.println("From thread " + this.threadName + this.isAlive());
        PD.printCounter(this.threadName, this);
        System.out.println("Thread " +  threadName + " exiting.");

    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

public class TestThread {

    public static void main(String args[]) {
        Printer PD = new Printer();

        ThreadDemo T1 = new ThreadDemo( "ThreadNum: 1 ", PD);
        ThreadDemo T2 = new ThreadDemo( "ThreadNum: 2 ", PD);

        // wait for threads to end
        try {
            //System.out.println(T1.isAlive());
            T1.start();
            //T1.join();
            T2.start();
            //T2.join();
        } catch ( Exception e) {
            System.out.println("Exception.");
        }
    }
}