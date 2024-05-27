package ALP_2;

import java.util.*;

public class TeamMember {

    protected int memberID, totalPoints;
    protected String name, role;
    protected List<Project> projects;
    protected Map<String, Badge> badges;

    public TeamMember(int memberID, String name, String role) {
        this.memberID = memberID;
        this.name = name;
        this.role = role;
        this.projects = new ArrayList<>();
        this.totalPoints = 0;
        this.badges = new HashMap<>();
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

    public Map<String, Badge> getBadges() {
        return badges;
    }

    public void setBadges(Map<String, Badge> badges) {
        this.badges = badges;
    }

    public void addPoints(int points) {
        this.totalPoints += points;
        awardBadge();
    }

    private void awardBadge() {
        if (totalPoints >= 10000 && !badges.containsKey("Diamond Badge")) {
            badges.put("Diamond Badge", new Badge("Diamond Badge", "Awarded for achieving 10000 points", 10000));
        } else if (totalPoints >= 5000 && !badges.containsKey("Platinum Badge")) {
            badges.put("Platinum Badge", new Badge("Platinum Badge", "Awarded for achieving 5000 points", 5000));
        } else if (totalPoints >= 1000 && !badges.containsKey("Gold Badge")) {
            badges.put("Gold Badge", new Badge("Gold Badge", "Awarded for achieving 1000 points", 1000));
        } else if (totalPoints >= 500 && !badges.containsKey("Silver Badge")) {
            badges.put("Silver Badge", new Badge("Silver Badge", "Awarded for achieving 500 points", 500));
        } else if (totalPoints >= 100 && !badges.containsKey("Bronze Badge")) {
            badges.put("Bronze Badge", new Badge("Bronze Badge", "Awarded for achieving 100 points", 100));
        }
    }
    
     public void displayBadges() {
        System.out.println("Badges for " + name + ":");
        if (badges.isEmpty()) {
            System.out.println("No badges earned yet.");
        } else {
            for (Badge badge : badges.values()) {
                System.out.println("- " + badge.getName());
            }
        }
    }
}
