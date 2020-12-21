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

    public String getName() {
        return name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public String getEducationRequirement() {
        return educationRequirement;
    }

    public String getYearRequirement() {
        return yearRequirement;
    }

    public void setStatus() {
        //todo: changes status of application to something else
    }


}
