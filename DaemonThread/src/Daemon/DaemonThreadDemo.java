package Daemon;

public class DaemonThreadDemo implements Runnable{
    @Override
    public void run() {
//        if (Thread.currentThread().isDaemon()){
//        System.out.println("Daemon thread");}
//        else{
//            System.out.println("child Thread");}
        System.out.println("Daemon Thread"); // we can also use like this for Daemon thread.
    }
    public static void main(String [] args){
        System.out.println("Parent Thread");
       /* if we commit it then run.
        it then it will show nothing because Daemons work in background and depend upon Main Thread,
        if main contain a Thread then it will work. */

        DaemonThreadDemo checkThread= new DaemonThreadDemo();
        Thread check =new Thread(checkThread);
        check.setDaemon(true); //this is for check the thread as Daemon Thread
        check.start();
    }
}
