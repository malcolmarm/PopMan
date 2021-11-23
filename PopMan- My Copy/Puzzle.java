import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    //Instance Variables
    private String ans;
    private String output; 
    private String guesses;
    private boolean firstGuess;
    
    //Constructor
    public Puzzle() {
        ans = "BRAVE"; 
        output = "";
        for (int i = 0; i < ans.length(); i++) {
            output += "_ ";
        }
        guesses = "";
        firstGuess = true;
    }
    
    /**
     * Returns the word.
     * @return The word
     */
    public String getWord() {
        return ans;
    }
    
    /**
     * Checks if the puzzle has been solved.
     * @return Whether or not the puzzle is still unsolved
     */
    public boolean isUnsolved() {
        boolean unsolved = false;
        for (int i = 0; i < output .length(); i += 2) {
            if (output.substring(i, i + 2).equals("_ ")) {
                unsolved = true;
            }
        }
        return unsolved;
    }
    
    /**
     * The method that displays the puzzle info.
     */
    public void show() {
        System.out.println("Puzzle: " + output);
        System.out.println("Guesses: " + guesses);
    }
    
    /**
     * The method called when making guesses.
     * @param String str The guessed letter.
     * @return Whether or not the guessed letter was in the word.
     */
    public boolean makeGuess(String str) {
        str = str.toUpperCase();
        boolean found = false;
        if (firstGuess)  {
            guesses += str;
            firstGuess = false;
        } else {
            guesses += ", " + str;
        }
        int answerTicker = 0;
        int outputTicker = 0; 
        while (answerTicker < ans.length()) {
            if (output.substring(outputTicker, outputTicker+2).equals("_ ") && ans.substring(answerTicker, answerTicker+1).equals(str)) {
                    found = true;
                    output = output.substring(0, outputTicker) + str + " " + output.substring(outputTicker+2);
            }
            answerTicker++;
            outputTicker += 2;
        }
        return found;
    }
}
