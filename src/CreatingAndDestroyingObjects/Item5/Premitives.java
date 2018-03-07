package CreatingAndDestroyingObjects.Item5;

public class Premitives {

    public static void main(String[] args)
    {

        //use primitive long
        long sum=0L;
        for(long i=0;i<Integer.MAX_VALUE;i++)
        {
            sum+=i;
        }

        System.out.println(sum);
    }
}
