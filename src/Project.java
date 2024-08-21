public class Project {
    private String projectName;
    private int teamSize;

    public Project(String projectName, int teamSize) {
        this.projectName = projectName;
        this.teamSize = teamSize;
    }

    public String getProjectName() {
        return projectName;
    }

    public int getTeamSize() {
        return teamSize;
    }
}
