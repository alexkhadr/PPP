package model;

public class Internship {
    String name;
    String dueDate;
    String status;
    String educationRequirement;
    String yearRequirement;

    public Internship(String name, String dueDate, String status, String educationRequirement, String yearRequirement) {
        this.dueDate = dueDate;
        this.name = name;
        this.status = status;
        this.educationRequirement = educationRequirement;
        this.yearRequirement = yearRequirement;
    }
}
