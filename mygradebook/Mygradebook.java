package mygradebook;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Mygradebook {
private ArrayList<Student> myStudent = new ArrayList<Student>();
String newLine = System.getProperty("line.separator");
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        
       
        ///Student indstudent = new Student(scanner.nextLine());
        
       Mygradebook mygradebook = new Mygradebook();
       for(;;){
           mygradebook.theControler();
       }
       
    }
    public void addarray(Student nameOfStudent){
    myStudent.add(nameOfStudent);
   
    
    }
    public void addGrades(Student nameOfStudent){
        nameOfStudent.addGrade(67);
    }
    public void getMeOut(String indname){
    for (Student Indev:myStudent){
                           if(Indev.getName().equals(indname)){
                               System.out.println("Add grades for "+indname);
                            int newGrade = scanner.nextInt();
                                Indev.addGrade(newGrade);
                          
                           }
                              
                          }
        
    }
    public void getout(String indname){
        for (Student Indev: myStudent){
            if(Indev.getName().equals(indname)){
       System.out.println(Indev.getName() + ": " + Indev.getAverage());
            }
        }
        
    }
         public void theControler(){

      System.out.println("Welcome to our Grade Program"+newLine+"To add Studen type a "+newLine+"To add Grades to exiting student type b"+newLine+"To look up grades from exiting student Type c ");
      String in = scanner.nextLine();
          switch (in){
                  case "a": System.out.println("Enter new Student name");
                  Student newStudent = new Student(scanner.nextLine());
                  addarray(newStudent);
                      break;
                  case "b": System.out.println("Please enter exiting Student ") ;  
                      String indname = scanner.nextLine();
                      getMeOut(indname);
                       break; 
                  case "c": System.out.println("Please enter exiting Student ") ;
                      String ind = scanner.nextLine();
                      getout(ind);
                      break;
                      }
          }            
}
