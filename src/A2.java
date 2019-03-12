public class A2 implements Runnable
{
    int a;
    int b;
    String c;
    public A2(){}
    public A2(int a, int b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args)
    {
        A2 thread= new A2(1,2,"hello");
        A2 cock= new A2(4,3,"cock");
        Thread a= new Thread(thread);
        Thread b= new Thread(cock);
        b.start();
        a.start();

    }

    @Override
    public void run()
    {
        System.out.println(a+" "+b+" "+c);
        for (int i =0; i<c.length();i++)
        {
            System.out.println(c.charAt(i));
        }
    }


}
