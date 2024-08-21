public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int age, double salary, String department, Project assignedProject) {
        super(name, age, salary, department, assignedProject);
    }

    @Override
    public void requestUnpaidLeave() {
        System.out.println(name + " has requested unpaid leave.");
    }

    public void requestPaidLeave() {
        System.out.println(name + " has requested paid leave.");
    }

    public void checkIncomeTax() {
        double tax = salary * 0.2;
        System.out.println("Income tax applicable on salary is: " + tax);
    }
}
