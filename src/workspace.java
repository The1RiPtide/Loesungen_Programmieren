public class workspace
{
     static String x = "this";

     static int[] sum(int...values)
     {
         return values;
     }

    public static void main(String[] args)
    {
        int[] array = sum(1,5,7,23,24);


    }

    public void method()
    {
        String x = "the second";

        System.out.println(this.x);
        System.out.println(x);
    }


}
