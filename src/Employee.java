abstract  class Employee {
    protected String name;
    protected int age;
    protected double salary;
    protected String department;
    protected Project assignedProject;

    public Employee(String name, int age, double salary, String department, Project assignedProject) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.assignedProject = assignedProject;
    }

    public abstract void requestUnpaidLeave();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public Project getAssignedProject() {
        return assignedProject;
    }
}

