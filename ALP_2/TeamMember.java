package ALP_2;

import java.util.ArrayList;
import java.util.List;

public class TeamMember {

    private int memberID, totalPoints;
    private String name, role;
    private List<Project> projects;
    private List<Badge> badges;

    public TeamMember(int memberID, String name, String role) {
        this.memberID = memberID;
        this.name = name;
        this.role = role;
        this.projects = new ArrayList<>();
        this.totalPoints = 0;
        this.badges = new ArrayList<>();
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public List<Badge> getBadges() {
        return badges;
    }

    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    // add points to the totalPoints
    public void addPoints(int points) {
        this.totalPoints += points;
        awardBadge();
    }

    public void addBadge(Badge badge) {
        this.badges.add(badge);
    }

    // Method to check and award badge based on totalPoints
    private void awardBadge() {
        if (totalPoints >= 10000 && !hasBadge("Diamond Badge")) {
            addBadge(new Badge("Diamond Badge", "Awarded for achieving 10000 points", 10000));
        } else if (totalPoints >= 5000 && !hasBadge("Platinum Badge")) {
            addBadge(new Badge("Platinum Badge", "Awarded for achieving 5000 points", 5000));
        } else if (totalPoints >= 1000 && !hasBadge("Gold Badge")) {
            addBadge(new Badge("Gold Badge", "Awarded for achieving 1000 points", 1000));
        } else if (totalPoints >= 500 && !hasBadge("Silver Badge")) {
            addBadge(new Badge("Silver Badge", "Awarded for achieving 500 points", 500));
        } else if (totalPoints >= 100 && !hasBadge("Bronze Badge")) {
            addBadge(new Badge("Bronze Badge", "Awarded for achieving 100 points", 100));
        }
    }

    // Method to check if a badge already exists
    private boolean hasBadge(String badgeName) {
        for (Badge badge : badges) {
            if (badge.getName().equals(badgeName)) {
                return true;
            }
        }
        return false;
    }
}
