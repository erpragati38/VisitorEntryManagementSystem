import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pragati on 10/27/2015.
 */
public class Employee extends Person {
    String empId;
    static Map<String, Employee> existingEmployee = new HashMap<>();

    Employee(String empId, String name, String category) {
        super(name, category);
        this.empId = empId;

    }

    public static void addPerson(Person obj) {
        Employee createEmp = (Employee) obj;
        existingEmployee.put(createEmp.empId, createEmp);
    }

    public static boolean checkExisting(String id) {
        if (existingEmployee.containsKey(id))
            return true;
        else
            return false;
    }
}
