public class A5 implements Runnable
{
    int a=3;
    int k;

    public A5(int k)
    {
        this.k = k;
    }

    public static void main(String[] args) {
        A5 thread = new A5(3);
        A5 kock= new A5(5);
        A5 jenis= new A5(4);
        Thread a = new Thread(thread);
        Thread b= new Thread(kock);
        Thread c= new Thread(jenis);
        a.start();
        b.start();
        c.start();
    }

    @Override
    public void run() {
        System.out.println(a);
        a+=k;
        System.out.println(a);
    }
}
