// process (instances) assigned to either single or multiple threads
// thread class
// user thread & daemon thread

// single thread example
class single_thread {
    public static void main(String[] args) {
        System.out.println("This is a single thread");
    }
}

// why single thread? reduce overhead in app. reduces maintenance


// concurrency & multi threading. what is it? executing two or more threads
// why using it? users are not blocked. threads are independent. multi operations

package demotest;

public class multithreading implements Runnable {
    public static void main(String[] args) {
            Thread guruThread1 = new Thread("Guru1");
            Thread guruThread2 = new Thread("Guru2");
            guruThread1.start();
            guruThread2.start();
            System.out.println("Thread names are following:");
            System.out.println(guruThread1.getName());
            System.out.println(guruThread2.getName());
    }
    @Override
    public void run() {

    }
}

// the lifecyle of a thread
// new -> runable -> running -> waiting -> dead
// common used methods for threads: start, sleep, getName, setPriority, yield


class thread_example1 implements Runnable {
    @Override
    public void run() {
    }
    public static void main(String[] args) {
        Thread guruthread1 = new Thread();
        guruthread1.start();
        try {
            guruthread1.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        guruthread1.setPriority(1);
        int gurupriority = guruthread1.getPriority();
        System.out.println(gurupriority);
        System.out.println("Thread Running");
  }
}

// thread synchronization


 