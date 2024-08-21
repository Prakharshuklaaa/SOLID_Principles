import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Project project1 = new Project("JLR", 5);
        Project project2 = new Project("BMW", 10);

        Employee emp1 = new FullTimeEmployee("Prakhar Shukla", 22, 50000, "IT", project1);
        Employee emp2 = new SubContractedEmployee("Anand Mishra", 28, 30000, "HR", project2);
        Employee emp3 = new SummerIntern("Ayush", 22, 15000, "Marketing", project1);
        Employee emp4 = new ProjectIntern("Robin", 24, 18000, "Finance", project2, "IN_PROGRESS");

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        for (Employee emp : employees) {
            System.out.println("Employee: " + emp.getName() + ", Department: " + emp.getDepartment());
            emp.requestUnpaidLeave();

            if (emp instanceof FullTimeEmployee) {
                ((FullTimeEmployee) emp).requestPaidLeave();
                ((FullTimeEmployee) emp).checkIncomeTax();
            } else if (emp instanceof Intern) {
                ((Intern) emp).checkTDS();
            }

            if (emp instanceof ProjectIntern) {
                ((ProjectIntern) emp).checkEmploymentStatus();
            }

            System.out.println();
        }
    }
}
