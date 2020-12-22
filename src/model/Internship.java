package model;

public class Internship {

    public enum Status {Accepted, Rejected, UnderReview}
    public enum EducationRequirement {Diploma, Bachelors, Masters}

    String name;
    String dueDate;
    Status status;
    EducationRequirement requirement;
    String yearRequirement;

    public Internship(String name, String dueDate, Status status, EducationRequirement requirement, String yearRequirement) {
        this.dueDate = dueDate;
        this.name = name;
        this.status = status;
        this.requirement = requirement;
        this.yearRequirement = yearRequirement;
    }

    public String getName() {
        return name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return String.valueOf(status);
    }

    public String getEducationRequirement() {
        return String.valueOf(requirement);
    }

    public String getYearRequirement() {
        return yearRequirement;
    }

    public Status setStatus(Status s) {
        return this.status = s;
    }


}
