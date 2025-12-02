package demo.multitreading.usingTreadClass;
//Extend Thread to create a custom thread with additional state and methods
public class CustomThread extends Thread {
 private String threadName;
 private int count;

 // Constructor to initialize state
 public CustomThread(String name, int count) {
     this.threadName = name;
     this.count = count;
 }

 // Override run to define the thread's task
 @Override
 public void run() {
     for (int i = 0; i < count; i++) {
         System.out.println(threadName + " - Count: " + i);
         try {
             // Simulate work with sleep
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }

 // Additional method
 public void printThreadName() {
     System.out.println("Thread Name: " + threadName);
 }
}

//Main class to test the custom thread
 class CustomMain {
 public static void main(String[] args) {
     CustomThread myThread = new CustomThread("MyCustomThread", 5);
     
     // Start the thread
     myThread.start();
     
     // Call additional method
     myThread.printThreadName();
 }
}
