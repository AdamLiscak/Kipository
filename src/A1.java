public class A1 implements Runnable
{
    public static void main(String[] args) {
       A1 thread= new A1();
      Thread a= new Thread(thread);
      a.start();
    }

    private void start() {
    }

    @Override
    public void run()
    {
        System.out.println("KOCH");
    }


}
