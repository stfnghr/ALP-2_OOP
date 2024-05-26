package ALP_2;

import java.util.ArrayList;
import java.util.List;

public class Leaderboard {

    private List<TeamMember> members;

    public Leaderboard() {
        this.members = new ArrayList<>();
    }

    public void addMember(TeamMember member) {
        this.members.add(member);
    }

    public List<TeamMember> getTopMembers() {
        this.members.sort((m1, m2) -> Integer.compare(m2.getTotalPoints(), m1.getTotalPoints()));
        return this.members;
    }

    public void displayLeaderboard() {
        // Sorting members by totalPoints in descending order
        getTopMembers();

        System.out.println("Leaderboard:");
        System.out.println("Rank\tName\t\tTotal Points\tBadges");
        for (int i = 0; i < members.size(); i++) {
            TeamMember member = members.get(i);
            System.out.printf("%d\t%s\t\t%d\t\t%s\n", i + 1, member.getName(), member.getTotalPoints(), member.getBadges());
        }
    }
}
