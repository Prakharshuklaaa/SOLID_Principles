public class SubContractedEmployee extends Employee {
    public SubContractedEmployee(String name, int age, double salary, String department, Project assignedProject) {
        super(name, age, salary, department, assignedProject);
    }

    @Override
    public void requestUnpaidLeave() {
        System.out.println(name + " has requested unpaid leave.");
    }
}
