package mygradebook;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Mygradebook {

    private ArrayList<Student> myStudent = new ArrayList<Student>();
    String newLine = System.getProperty("line.separator");
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Mygradebook mygradebook = new Mygradebook();
        for (;;) {
            mygradebook.theControler();
        }
    }

    public void addarray(Student nameOfStudent) {
        myStudent.add(nameOfStudent);

    }

    public void addGrades(Student nameOfStudent) {
        String more = "y";
          while(more.equalsIgnoreCase("y")){
        System.out.println("Add grades for " + nameOfStudent.getName());
        int newGrade = scanner.nextInt();
        scanner.nextLine();
        nameOfStudent.addGrade(newGrade);
        System.out.println("More Grades? y/n");
        more = scanner.nextLine();
        
          }
    }

    public void getMeOut(String indname) {
        int y = 0;
        for (Student Indev : myStudent) {
            if (Indev.getName().equalsIgnoreCase(indname)) {
                addGrades(Indev);
               y++;
                   break;
            }
          
        }
           if(y != 1){
               System.out.println("sorry no souch student in out database!!");
           }
    }

    public void getout(String indname) {
        int y = 0;
        for (Student Indev : myStudent) {
            if (Indev.getName().equals(indname)) {
                System.out.println(Indev.getName() + ": " + Indev.getAverage());
                y++;
                break;
            }
            
        }
               if(y!= 1){
             System.out.println("sorry no souch student in out database!!");
               }
    }

    public void theControler() {

        System.out.println("Welcome to our Grade Program" + newLine + "To add Student type a " + newLine + "To add Grades to exiting student type b" + newLine + "To look up grades from exiting student Type c ");
        String in = scanner.nextLine();
        switch (in) {
            case "a":
                System.out.println("Enter new Student name");
                Student newStudent = new Student(scanner.nextLine());
                addarray(newStudent);
                break;
            case "b":
                System.out.println("Please enter exiting Student ");
                String indname = scanner.nextLine();
                getMeOut(indname);
                break;
            case "c":
                System.out.println("Please enter exiting Student ");
                String ind = scanner.nextLine();
                getout(ind);
                break;
        }
    }
}
