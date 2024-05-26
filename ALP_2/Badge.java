package ALP_2;

public class Badge {
    private int requiredPoints;
    private String name, description;

    public Badge(String name, String description, int requiredPoints) {
        this.name = name;
        this.description = description;
        this.requiredPoints = requiredPoints;
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
    
    public int getRequiredPoints() {
        return requiredPoints;
    }

    public void setRequiredPoints(int requiredPoints) {
        this.requiredPoints = requiredPoints;
    }

}

