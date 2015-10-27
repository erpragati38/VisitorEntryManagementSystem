import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Pragati on 10/27/2015.
 */
public class UserInput {


    public static void main(String args[]) throws IOException {
        //Adding Employess in List
        Person emp1 = new Employee("PR296774", "Prag", "EMP");
        Employee.addPerson(emp1);
        Person emp2 = new Employee("AR296789", "raj", "EMP");
        Employee.addPerson(emp2);
        Person emp3 = new Employee("LR29690", "Prakhar", "EMP");
        Employee.addPerson(emp3);
        Person emp4 = new Employee("OR29784", "Princy", "EMP");
        Employee.addPerson(emp4);
        Person emp5 = new Employee("ER29974", "Eshan", "EMP");
        Employee.addPerson(emp5);
        Random randomGenerator = new Random();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("**** WELCOME *****");
            System.out.println("Enter EMP for Employee and VIS for Visitor");
            System.out.println("For EXit enter E");
            String personType = br.readLine();
            if (personType.equals("E")) {
                System.out.println("Thank you for visting!!!!");
                break;
            }

            if (personType.equals("EMP")) {
                System.out.println("Enter Employee Id");
                String personInput = br.readLine();
                if (Employee.checkExisting(personInput))
                    System.out.println("PASS..CAN ENTER");
                else
                    System.out.println("YOUR RECORD DOES NOT EXIST..CREATE..");

            } else if (personType.equals("VIS")) {
                System.out.println("Enter your name to enter");
                String visitorInput = br.readLine();
                String generatedID = visitorInput.substring(0, 2) + randomGenerator.nextInt();
                Person visi1 = new Visitor(visitorInput, "VIS", generatedID);
                Visitor.addPerson(visi1);
                if (Visitor.checkExisting(generatedID)) {
                    System.out.println(" YOUR VISTING ID is " + generatedID + " YOU CAN VIST..");
                } else
                    System.out.println("Some Error. Try again");

            } else {
                System.out.println("Wrong Input..");
            }


        }

    }
}
