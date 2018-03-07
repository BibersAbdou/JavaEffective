package CreatingAndDestroyingObjects.Item3.StaticFactoryMethode;


//Singleton with Static Factory methode
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();

    //called only once, to initialize the public static field
    private Elvis() {

    }

    public static Elvis getInstance(){return INSTANCE;}

    public void leaveTheBuilding()
    {

    }
}
