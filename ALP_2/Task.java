package ALP_2;

import java.time.LocalDate;

public class Task {

    private int taskID, projectID, assignedTo, points;
        // assignedTo : memberID of the assigned team member
    private String name, description, status;
    private LocalDate dueDate;

    public Task(int taskID, int projectID, int assignedTo, int points, String name, String description, String status, LocalDate dueDate) {
        this.taskID = taskID;
        this.projectID = projectID;
        this.assignedTo = assignedTo;
        this.points = points;
        this.name = name;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
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

    public int getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(int assignedTo) {
        this.assignedTo = assignedTo;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
