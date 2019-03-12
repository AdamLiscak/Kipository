public class A1_2 extends Thread {
    public void run()
    {
        System.out.println("KOCH");
    }

    public static void main(String[] args) {
        A1_2 newThread = new A1_2();
        newThread.start();
    }
}
