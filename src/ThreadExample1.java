public class ThreadExample1 extends Thread {
    //run() method to perform action for thread.
    public void run(){
        int a=10;
        int b=12;
        int result = a+b;
        System.out.println("Thread started running...");
        System.out.println("Sum of two numbers is :" + result);
    }
    public static void main(String args[]){
        //Creating instance of class extend thread class
        ThreadExample1 t1=new ThreadExample1();
        //calling start method to execute the run() method of the thread class
        t1.start();
    }
}
