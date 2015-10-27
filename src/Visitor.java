import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pragati on 10/27/2015.
 */
public class Visitor extends Person {
    String visitorId;
    static Map<String, Visitor> visitorLsit = new HashMap<String, Visitor>();

    public Visitor(String name, String category, String visitorId) {
        super(name, category);
        this.visitorId = visitorId;
    }

    public static void addPerson(Person obj) {
        Visitor createVisitor = (Visitor) obj;
        visitorLsit.put(createVisitor.visitorId, createVisitor);
    }

    public static boolean checkExisting(String id) {
        if (visitorLsit.containsKey(id))
            return true;

        else
            return false;

    }

}
