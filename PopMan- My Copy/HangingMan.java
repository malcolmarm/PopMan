public class HangingMan {
    //Instance variables
    private int numWrongGuesses;
    private String[] HangmanImage = {"OOOOOOO\n" +
                                    "\\|||||/\n" +
                                    " \\|||/\n" +
                                    "  \\|/\n" +
                                    "   |",
                                    
                                    "OOOOOO\n" +
                                    "\\|||||\n" +
                                    " \\|||/\n" +
                                    "  \\|/\n" +
                                    "   |",
                                    
                                    " OOOOO\n" +
                                    " |||||\n" +
                                    " \\|||/\n" +
                                    "  \\|/\n" +
                                    "   |",
                                    
                                    " OOOO\n" +
                                    " ||||\n" +
                                    " \\|||\n" +
                                    "  \\|/\n" +
                                    "   |",
                                    
                                    "  OOO\n" +
                                    "  |||\n" +
                                    "  |||\n" +
                                    "  \\|/\n" +
                                    "   |",
                                    
                                    "  OO\n" +
                                    "  ||\n" +
                                    "  ||\n" +
                                    "  \\|\n" +
                                    "   |",
                                    
                                    "   O\n" +
                                    "   |\n" +
                                    "   |\n" +
                                    "   |\n" +
                                    "   |",

                                    };
    //Constructor                       
    public HangingMan() {
        numWrongGuesses = 0;
    }
    
    /**
     * Checks to see if the player is out of guesses.
     * @return returns whether the player is out of guesses
     */
    public boolean isntDead() {
        return numWrongGuesses < HangmanImage.length;
    }
    
    /**
     * Displays the remaining guesses graphic.
     */
    public void show() {
        System.out.println(HangmanImage[numWrongGuesses]);
    }
    
    /**
     * Causes the player to lose a guess.
     */
    public void dieSomeMore() {
        numWrongGuesses++;
    }
}
