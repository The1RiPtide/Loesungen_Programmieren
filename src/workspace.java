public class workspace
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println(innerclass.test);
    }

   public static class innerclass{
        static int test = 4;
   }
}
