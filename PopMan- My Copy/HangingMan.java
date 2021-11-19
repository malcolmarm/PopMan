public class HangingMan {

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
                            
    public HangingMan() {
        numWrongGuesses = 0;
    }
    
    public boolean isntDead() {
        return numWrongGuesses < HangmanImage.length;
    }
    
    public void show() {
        System.out.println(HangmanImage[numWrongGuesses]);
    }
    
    public void dieSomeMore() {
        numWrongGuesses++;
    }
}
