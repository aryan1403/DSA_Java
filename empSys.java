import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

class emp {
    protected String id;
    protected String name;
    protected String role;
    protected double salary;
    protected double exp;

    public emp(String id, String name, String role, double salary, double exp) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.exp = exp;
    }
}
public class empSys {
    static Scanner sc = new Scanner(System.in);
    static List<emp> list = new ArrayList<>();

    static void printEmp() {
        for (int i = 0; i < list.size(); i++) {
            emp e = list.get(i);
            System.out.println((i+1) + ". Id: " + e.id + ", Name: " + e.name + ", " + "Role: " + e.role + ", " + " Exp: " + e.exp);
        }
    }

    static emp addEmp() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the name of the Employee: ");
        String name = sc1.nextLine();
        System.out.println("Enter the role of the Employee: ");
        String role = sc.nextLine();
        System.out.println("Enter the salary of the Employee: ");
        double salary = sc.nextDouble();
        System.out.println("Enter the total years of exp: ");
        double exp = sc.nextDouble();

        emp e = new emp(UUID.randomUUID().toString(), name, role, salary, exp);
        sc1.close();
        return e;
    }

    static void deleteEmp() {
        printEmp();
        System.out.print("Choose the Employee to delete: ");
        int choice = sc.nextInt();
        list.remove(choice - 1);
    }
    public static void main(String[] args) {
        int choice = 0;
        while (choice != 5) {
            System.out.println("Menu: ");
            System.out.println("1. Enter a new Emp");
            System.out.println("2. Delete a Emp");
            System.out.println("3. Edit a Emp");
            System.out.println("4. Get a Emp");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    list.add(addEmp());
                    break;
                case 2:
                    deleteEmp();
                    break;
                case 3:
                    // TODO: edit the Employee
                    break;
                case 4:
                    System.out.println("List of Employees: ");
                    printEmp();
                    break;
                case 5:
                    sc.close();
                    System.exit(0); // terminate the program
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
