package CreatingAndDestroyingObjects.Item1.ServiceProvider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services  {
    private Services(){};

    //Map service names to services
    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider> ();

    private static final String DEFFAULT_PROVIDER_NAME = "<def>";

    //Provider registration API
    public static void registerDefaultProvider (Provider p)
    {
        registerProvider(DEFFAULT_PROVIDER_NAME,p);
    }


    public static void registerProvider(String name , Provider p)
    {
        providers.put(name, p);
    }



    //Service access API
    public static Service newInstance()
    {
        return newInstance(DEFFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name)
    {
       Provider p= providers.get(name);
       if(p==null) throw new IllegalArgumentException("No provider registred with name : "+name);

       return p.newServie();
    }
}
