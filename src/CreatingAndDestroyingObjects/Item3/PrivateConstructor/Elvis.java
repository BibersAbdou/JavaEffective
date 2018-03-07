package CreatingAndDestroyingObjects.Item3.PrivateConstructor;


//Singleton with public final field
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    //called only once, to initialize the public static field
    private Elvis() {

    }
    public void leaveTheBuilding()
    {

    }
}
