public class ProjectIntern extends Employee implements Intern {
    private String employmentStatus;

    public ProjectIntern(String name, int age, double stipend, String department, Project assignedProject,
            String employmentStatus) {
        super(name, age, stipend, department, assignedProject);
        this.employmentStatus = employmentStatus;
    }

    @Override
    public void requestUnpaidLeave() {
        System.out.println(name + " has requested unpaid leave.");
    }

    @Override
    public void checkTDS() {
        double tds = salary * 0.1; 
        System.out.println("TDS on stipend is: " + tds);
    }

    public void checkEmploymentStatus() {
        System.out.println("Employment status: " + employmentStatus);
    }
}
