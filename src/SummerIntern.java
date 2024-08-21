public class SummerIntern extends Employee implements Intern {
    public SummerIntern(String name, int age, double stipend, String department, Project assignedProject) {
        super(name, age, stipend, department, assignedProject);
    }

    @Override
    public void requestUnpaidLeave() {
        System.out.println(name + " has requested unpaid leave.");
    }

    @Override
    public void checkTDS() {
        double tds = salary * 0.1; // Example calculation
        System.out.println("TDS on stipend is: " + tds);
    }
}
