package CreatingAndDestroyingObjects.Item4;

//NonInstantiable utility class
public class UtilityClass {

    private UtilityClass()
    {
        throw new AssertionError("UtilityClass can't be instantiated");
    }


    public static void main(String args[])
    {
        UtilityClass c =new UtilityClass();//Exception
    }
}
