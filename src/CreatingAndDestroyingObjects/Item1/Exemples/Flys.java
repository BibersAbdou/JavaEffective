package CreatingAndDestroyingObjects.Item1.Exemples;

public class Flys {

    //non instantiable
    private Flys(){};
    public static Fly aireplane;
    public static Fly rocket;


    public static final float MAX_AIREPLANE_HEIGHT = 1000;

    //Static factory method
    //choose implementations by name (we can have authers)
    //not required to create a new object
    // multiple subtypes result (no public)
    public Fly newFlyByHeight(float height)
    {
        if(height<= MAX_AIREPLANE_HEIGHT)
        {
            if(aireplane == null) aireplane = new Aireplane();

            return aireplane;
        }


        if(rocket == null) rocket = new Rocket();

        return rocket;

    }
}
