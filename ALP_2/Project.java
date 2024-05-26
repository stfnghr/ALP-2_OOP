package ALP_2;

import java.util.*;

public class Project {

    private int projectID;
    private String name, description, status;
    // contoh status: "Not Started", "In Progress", "Completed", "Cancelled"
    private Date startDate, endDate;
    private Queue<Task> taskQueue;
    private List<TeamMember> teamMembers;
    private List<ProgressReport> progressReports;

    public Project(int projectID, String name, String description, String status, Date startDate, Date endDate) {
        this.projectID = projectID;
        this.name = name;
        this.description = description;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.taskQueue = new PriorityQueue<>(Comparator.comparing(Task::getDueDate));
        this.teamMembers = new ArrayList<>();
        this.progressReports = new ArrayList<>();
    }

    public void addTask(Task task) {
        this.taskQueue.offer(task);
    }

    public Task getNextTask() {
        return this.taskQueue.poll();
    }
    
    public void addProgressReport(ProgressReport report){
        this.progressReports.add(report);
    }
    
    public List<ProgressReport> getProgressReports(){
        return progressReports;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Queue<Task> getTaskQueue() {
        return taskQueue;
    }

    public void setTaskQueue(Queue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

    public List<TeamMember> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<TeamMember> teamMembers) {
        this.teamMembers = teamMembers;
    }

}
