package model;

import exception.DuplicateException;
import exception.NotExistException;

import java.util.*;

public class Application {
    private List<Internship> internships;
    private Set<Student> students;
    private Map<Student, List<Internship>> applications;

    public Application() {
        internships = new ArrayList<>();
        students = new HashSet<>();
        applications = new HashMap<>();
    }

    //MODIFIES: this
    //EFFECTS: adds an internship to internships
    public void addInternships(Internship i) {
        internships.add(i);
    }

    //MODIFIES: this
    //EFFECTS: adds a new student
    public void addStudent(Student s) {
        students.add(s);
    }

    //MODIFIES: this
    //EFFECTS: adds an internship to a student's application list
    public void addInternship(Student s, Internship i) throws DuplicateException {
        if (applications.containsKey(s) && !applications.get(s).contains(i)) {
            applications.get(s).add(i);
        } else if (!applications.containsKey(s)) {
            applications.put(s, new ArrayList<Internship>());
            List<Internship> list = applications.get(s);
            list.add(i);
        } else {
            throw new DuplicateException();
        }
//        if (internships.contains(i)) {
//            System.out.println("Internship is already added to Account");
//        } else {
//            internships.add(i);
//        }
    }

    //MODIFIES: this
    //EFFECTS: removes internship from student's application list
    public void removeInternship(Student s, Internship i) throws NotExistException {
        if (applications.containsKey(s) || applications.get(s).contains(i)) {
            applications.get(s).remove(i);
        } else {
            System.out.println("Internship was not found in account");
            throw new NotExistException();
        }

//        if (internships.contains(i)) {
//            internships.remove(i);
//        } else {
//            System.out.println("Internship was not found in account");
//        }
    }

    //Getters and Setters
    //EFFECTS: returns all internships a student applied to
    public List<Internship> getInternships(Student s) {
        return applications.get(s);
    }


}
