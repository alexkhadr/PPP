package model;

import java.util.ArrayList;

public class Portfolio {
    ArrayList<Internship> Internships;

    public Portfolio(ArrayList<Internship> Internships) {
        Internships = new ArrayList<>();
    }

    public void addInternship(Internship i) {
        if (Internships.contains(i)) {
            System.out.println("Internship is already added to Account");
        } else {
            Internships.add(i);
        }
    }

    public void removeInternship(Internship i) {
        if (Internships.contains(i)) {
            Internships.remove(i);
        } else {
            System.out.println("Internship was not found in account");
        }
    }

    public ArrayList<Internship> viewInternships() {
        return Internships;
    }


}
