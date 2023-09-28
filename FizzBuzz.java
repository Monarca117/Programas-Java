public class FizzBuzz 
{
    public static void main(String args[])
    {
        //Ciclo For
        for(int i = 1; i <= 100; i++)
        {
            //Fizz
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i + " FizzBuzz, ");
            } else if(i % 5 == 0)
            {
                System.out.println(i + " Buzz, ");
            } else if(i % 3 == 0)
            {
                System.out.println(i + " Fizz, ");
            }

         System.out.println(i + ", ");
        }
    }
}
