package threadprint;

public class ThreadPrint {

    public static void main(String[] args) throws InterruptedException {
        Simbolo p1 = new Simbolo("@", 10);
        Simbolo p2 = new Simbolo("&", 6);
        
        Thread a = new Thread(p1);
        Thread b = new Thread(p2);
        
        System.out.println("Inizio");
        
        a.start();
        b.start();
        
        a.join();
        b.join();
        
        System.out.println("\nFine");
    }
    
}
