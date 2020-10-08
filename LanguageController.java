/*
 * This class implements the language change functionality for a game of TicTacToe.
 * The two languages to chose from are english and german.
 * The class has the following functionalities:
 *      switch the language
 *      
 * @author Yves Brändli, Nadine Moser, Robin Meier
 * @version 1.0
 */
public class LanguageController
{
    private boolean isGerman;
    /*
     * Constructor for the LanguageChange class.
     * 
     * @param isGerman false for english, true for german
     */
    public LanguageController()
    {
        isGerman = false;
    }

    /*
     * 
     * sets the isGerman boolean
     * 
     * @param
     */
    public void changeLanguage(){
        isGerman = !isGerman;
    }
    
    /*
     * 
     * gets the isGerman boolean
     * 
     * @param
     */
    public boolean getIsGerman()
    {
        return isGerman;
    }
    
    /**
     * Translates a Welcome message
     * @param   player  to indicate witch player is making the first move
     */
    public String translateWelcomeText(){
        String player;
        if(getIsGerman() == true)
        {
            player = "Spieler eins";
            return "Herzlich Willkommen zu ihrem neuen Spiel. " + player + ", bitte tätigen sie ihren ersten Spielzug.";
        }
        else
        {
            player = "Player one";
            return "Welcome to your new Game. " + player + ", please select your first turn.";
        }
    }
    
    /**
     * Translates a Language Request message
     */
    public String translateLanguageChangeRequestText(){
        if(getIsGerman() == true)
        {
            return "Möchten sie die Sprache auf Englisch wechseln?";
        }
        else
        {
            return "Would you like to switch the language to german?";
        }
    }
    
    /**
     *  Translates a Language change message
     */
    public String translateLanguageChangeText(){
        if(getIsGerman() == true)
        {
            return "Sprachwechsel auf Deutsch erfolgreich.";
        }
        else
        {
            return "Language change to english successful.";
        }
    }
    
    /**
     *  Translates a Move Request message
     *  @param  isPlayerOne inidcates if Player One is making the next move
     */
    public String translateMoveRequestText(boolean isPlayerOne){
        String currentPlayer;
        if(getIsGerman() == true)
        {
            if (isPlayerOne == true)
            { 
                currentPlayer = "Spieler Eins";
            }
            else
            { 
                currentPlayer = "Spieler Zwei";
            }
            return currentPlayer + ", bitte geben sie ihren nächsten Spielzug ein.";
        }
        else
        {
            if (isPlayerOne == true)
            { 
                currentPlayer = "Player one";
            }
            else
            { 
                currentPlayer = "Player two";
            }
            return currentPlayer + ", please choose your next turn.";
        }
    }
    
    /**
     * Translates current Game State message
     * @param   currentGameState    indicates witch state the gameboard currently has. 1 stands for draw, 2 stands for player one is winning, 3 stands for player two is winning.
     */
    public String translateCurrentGameStateText(int currentGameState){
        String currentPlayer;
        if(getIsGerman() == true)
        {
            if (currentGameState == 1) // 1 Stands for a draw condition.
            { 
                return "Sie haben ein Unentschieden erreicht. Herzliche Gratulation an beide Spieler.";
            }
            if (currentGameState == 2) // 2 Stands for a winning condition for Player one.
            { 
                currentPlayer = "Spieler Eins";
                return currentPlayer + ", hat das Spiel gewonnen";
            }
            if (currentGameState == 3) // 3 Stands for a winning condition for Player two.
            { 
                currentPlayer = "Spieler Zwei";
                return currentPlayer + ", hat das Spiel gewonnen";
            }
        }
        else
        {
            if (currentGameState == 1) // 1 Stands for a draw condition.
            { 
                return "You've reached a draw situation. Congratulations to both players.";
            }
            if (currentGameState == 2) // 2 Stands for a winning condition for Player one.
            { 
                currentPlayer = "Player one";
                return currentPlayer + ", has won the game.";
            }
            if (currentGameState == 3) // 3 Stands for a winning condition for Player two.
            { 
                currentPlayer = "Player two";
                return currentPlayer + ", has won the game";
            }
        }
        return "";
    }
    
    /**
     * Translates wrong move message
     */
    public String translateWrongMoveText(){
        if(getIsGerman() == true)
        {
            return "Zug ungültig. Wählen sie bitte einen freien Sektor auf dem Spielfeld.";
        }
        else
        {
            return "Move invalid. Please select a free field on the gameboard.";
        } 
    }
}
