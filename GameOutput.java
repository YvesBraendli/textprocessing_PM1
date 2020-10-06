/*
 * This class implements the console outputs for a game of TicTacToe in english and german.
 * The class has the following functionalities:
 *      Print a welcome message
 *      Print the board
 *      Print a request for a language change
 *      Print a messsage if a language change has been made
 *      Print a request for a player to make a move
 *      Print a message for the winner
 *      Print a message in case of a draw
 *           
 * @author Yves Brändli, Nadine Moser, Robin Meier
 * @version 1.0
 */
import java.util.ArrayList;
public class GameOutput
{
    private LanguageChange language;
    private String player;
    private ArrayList<Character> fieldsymbol;
    /*
     * Constructor for the GameOutput class.
     * 
     * @param empty
     */
    public GameOutput(LanguageChange languageChange)
    {
        fieldsymbol = new ArrayList<>();
        for (int i = 0; i < 9; i++){
            fieldsymbol.add('-');
        }
        language = languageChange;
        player = "Spieler eins";
    }

    /*
     * Prints out a welcome message at the start of the game.
     */    
    public void printWelcome()
    {
        if(language.getIsGerman() == true)
        {
            System.out.println("Herzlich Willkommen zu ihrem neuen Spiel. " + player + ", bitte tätigen sie ihren ersten Spielzug.");
        }
        if(language.getIsGerman() == false)
        {
            player = "Player one";
            System.out.println("Welcome to your new Game. " + player + ", please select your first turn.");
        }
    }

    /*
     * Prints the board after every turn.
     */    
    public void printBoard(ArrayList<Integer> fields)
    {
        for(int i = 0; i < 9; i++){
            if (fields.get(i) == 1)
            {
                fieldsymbol.set(i, 'X');   
            }  else if (fields.get(i) == 2)
            {
                fieldsymbol.set(i, 'O');
            }
        }
        System.out.println(fieldsymbol.get(0) + " | " + fieldsymbol.get(1) + " | " + fieldsymbol.get(2));
        System.out.println("---------");
        System.out.println(fieldsymbol.get(3) + " | " + fieldsymbol.get(4) + " | " + fieldsymbol.get(5));
        System.out.println("---------");
        System.out.println(fieldsymbol.get(6) + " | " + fieldsymbol.get(7) + " | " + fieldsymbol.get(8));
        System.out.println();
    }

    /*
     * Prints out a request message for the language change functionality.
     */    
    public void printLanguageChangeRequest()
    {
        if(language.getIsGerman() == true)
        {
            System.out.println("Möchten sie die Sprache auf Englisch wechseln?");
        }
        if(language.getIsGerman() == false)
        {
            System.out.println("Would you like to switch the language to german?");
        }
    }

    /*
     * Prints out a message if the language change was completed.
     */
    public void printLanguageChange()
    {
        if(language.getIsGerman() == true)
        {
            System.out.println("Sprachwechsel auf Deutsch erfolgreich.");
        }
        if(language.getIsGerman() == false)
        {
            System.out.println("Language change to english successful.");
        }
    }

    /*
     * Prints out a request for a player to make a move.
     */    
    public void printMoveRequest(boolean isPlayerOne)
    {
        if(language.getIsGerman() == true)
        {
            if (isPlayerOne == true)
            { player = "Spieler Eins";
            }
            if (isPlayerOne == false)
            { player = "Spieler Zwei";
            }
            System.out.println(player + ", bitte geben sie ihren nächsten Spielzug ein.");
        }
        if(language.getIsGerman() == false)
        {
            if (isPlayerOne == true)
            { player = "Player one";
            }
            if (isPlayerOne == false)
            { player = "Player two";
            }
            System.out.println(player + ", please choose your next turn.");
        }
    }

    /*
     * Prints out a message if a winning condition has been met or the game ended in a draw.
     */    
    public void printGameState(int currentGameState)
    {
        if(language.getIsGerman() == true)
        {
            if (currentGameState == 1) // 1 Stands for a draw condition.
            { System.out.println("Sie haben ein Unentschieden erreicht. Herzliche Gratulation an beide Spieler.");
            }
            if (currentGameState == 2) // 2 Stands for a winning condition for Player one.
            { player = "Spieler Eins";
                System.out.println(player + ", hat das Spiel gewonnen");
            }
            if (currentGameState == 3) // 3 Stands for a winning condition for Player two.
            { player = "Spieler Zwei";
                System.out.println(player + ", hat das Spiel gewonnen");
            }
        }
        if(language.getIsGerman() == false)
        {
            if (currentGameState == 1) // 1 Stands for a draw condition.
            { System.out.println("You've reached a draw situation. Congratulations to both players.");
            }
            if (currentGameState == 2) // 2 Stands for a winning condition for Player one.
            { player = "Player one";
                System.out.println(player + ", has won the game.");
            }
            if (currentGameState == 3) // 3 Stands for a winning condition for Player two.
            { player = "Player two";
                System.out.println(player + ", has won the game");
            }
        }
    }

    public void printWrongMove()
    {
        if(language.getIsGerman() == true)
        {
            System.out.println("Zug ungültig. Wählen sie bitte einen freien Sektor auf dem Spielfeld.");
        }
        if(language.getIsGerman() == false)
        {
            System.out.println("Move invalid. Please select a free field on the gameboard.");
        } 
    }
}
