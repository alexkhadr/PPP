package main;

import model.Internship;
import model.Application;

import javax.swing.*;
import java.util.ArrayList;
//import persistence.JsonReader;  //Todo add persistence
//import persistence.JsonWriter;

public class Main {
    private static JButton button;
    private static Application application;
    private static Internship internship1;
    private static Internship internship2;
    private static Internship internship3;
    private static ArrayList<Internship> InternshipList;
    //private static JsonWriter JsonWriter;
    //private static JsonReader JsonReader;
    private static final String JSON_STORE = "./data/myportfolio.json";

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(1500, 1500);


    }

}
