package ALP_2;

import java.time.LocalDate;

public class ProgressReport {
    private int reportID, projectID;
    private LocalDate date;
    private String summary;

    public ProgressReport(int reportID, int projectID, LocalDate date, String summary) {
        this.reportID = reportID;
        this.projectID = projectID;
        this.date = date;
        this.summary = summary;
    }

    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    
}
