/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.reflect.Array;
import static java.rmi.Naming.list;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author benjamintauber
 */
public class Hangman {

    /**
     //* @param args the command line arguments
     */
    public String [] words = {"people","pizza"};
    public int outs = 0;
    public char guesses[];
    public char guess;
    public String theword;
    public int row = 0;
    public boolean []usedAlpha = new boolean[26];
    public void start(){
        int number = new Random().nextInt(words.length);
        theword = words[number];
        guesses = new char[theword.length()];
        char underline = '_';
        Arrays.fill(guesses,underline);
       
        Scanner scanner = new Scanner(System.in);
        while(outs < 10 && row != theword.length()){
        drawScreen();
        System.out.println("guess a letter");
        char guesss = scanner.next().charAt(0);
         guess = Character.toLowerCase(guesss);
        if(usedAlpha[guess - 'a'] == true){
           
            System.out.println("you have already picked " + guess);
           
            continue;
        }else{
             usedAlpha[guess - 'a'] = true;
        }
        checkTheGuess();
        if(checkTheLetter()==false){
            outs++;
        }
        System.out.println("you have guessed " + guess);
        
        
        }
        System.out.println(theword);
    }
    public void checkTheGuess(){
        for(int i=0;i < theword.length(); i++){
            if(theword.charAt(i) == guess){
                guesses[i] = guess;
              row++;
                
            }
        }   
        
    }
    public boolean checkTheLetter(){
        for(int i=0;i < theword.length(); i++){
            if(theword.charAt(i) == guess){
                return true;
            }    
        
        }
        return false;
    }
    public void drawScreen(){
        drawGuesses();
        drawPerson();
    }
    public void drawGuesses(){
       for(char klm : guesses){
           System.out.print(klm +" ");
       }
            
        
    }
    public void drawPerson(){
        System.out.println("you have " + outs + " outs");
    }
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        Hangman hangman = new Hangman();
        hangman.start();
    }
    
}
    