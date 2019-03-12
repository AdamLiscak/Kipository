public class A4 implements Runnable {
    int a;
    int b;
    String c;

    public A4() {
    }

    public A4(int a, int b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) throws InterruptedException {
        A2 thread = new A2(1, 2, "hello");

        Thread a = new Thread(thread);
        A2 koch = new A2(4, 3, "koch");
        Thread k = new Thread(koch);
        a.start();
        a.join();
        k.start();
        k.join();

    }

    @Override
    public void run() {

        for (int i = 0; i < c.length(); i++) {
            System.out.println(c.charAt(i));
        }
        System.out.println(a + " " + b + " " + c);

    }
}

