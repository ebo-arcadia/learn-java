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
// avoid inconsistency when on tread is writing and another is reading
// used when threads share the same resources

GuruThread1.java
package demotest;
public class GuruThread1 implements Runnable{
 
    /**
     * @param args
     */
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
 
public class GuruThread2 {
 
    public static void main(String[] args) {
     // TODO Auto-generated method stub
     GuruThread3 threadguru1 = new GuruThread3("guru1");
     threadguru1.start();
     GuruThread3 threadguru2 = new GuruThread3("guru2");
     threadguru2.start();
    }
   }
   class GuruThread3 implements Runnable {
    Thread guruthread;
    private String guruname;
    GuruThread3(String name) {
     guruname = name;
    }
    @Override
    public void run() {
     System.out.println("Thread running" + guruname);
     for (int i = 0; i < 4; i++) {
      System.out.println(i);
      System.out.println(guruname);
      try {
       Thread.sleep(1000);
      } catch (InterruptedException e) {
       System.out.println("Thread has been interrupted");
      }
     }
    }
    public void start() {
     System.out.println("Thread started");
     if (guruthread == null) {
      guruthread = new Thread(this, guruname);
      guruthread.start();
     }
    
    }
   }
    