/**
 * This class implements the language change functionality for a game of TicTacToe.
 * It also is responsible for the language Strings and to return them correctly.
 * The two languages to chose from are english and german.
 * It can switch between the two languages by changing a boolean.
 *      
 *The language is set by default to english.
 *      
 * @author Yves Brändli, Nadine Moser, Robin Meier
 * @version 1.0
 */
public class LanguageController
{
    private boolean isGerman;
    /**
     * Constructor for the LanguageChange class. Sets the language to english.
     * 
     */
    public LanguageController()
    {
        isGerman = false;
    }

    /**
     * 
     * sets the isGerman boolean to the reciprocal value.
     * 
     */
    public void changeLanguage(){
        isGerman = !isGerman;
    }

    /**
     * 
     * gets the isGerman boolean.
     * 
     * @return      the boolean to get the information about which language has been choosen.
     */
    public boolean getIsGerman()
    {
        return isGerman;
    }

    /**
     * translates the Strings Player.
     * 
     * @param player        to indicated which player's turn it is.
     * @return              a String for the players in the selected language.
     */
    public String translatePlayerText(int player){
        if(getIsGerman() == true)
        {
            if(player == 1){
                return "Spieler eins";
            }
            else{
                return "Spieler zwei";
            }
        }
        else
        {
            if(player == 1){
                return "player one";
            }
            else{
                return "player two";
            }
        }
    }

    /**
     * Translates a Welcome message.
     * 
     * @param player        to indicate which player is making the first move.
     * @return              a welcome message in the selected language.
     */
    public String translateWelcomeText(String player){
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
     * Translates a Language Request message.
     * 
     * @return      a String with the question to change the language in the selected language.
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
     *  Translates a Language change message.
     *  
     *  @return     a message in the selected language, that the language change was successful.
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
     *  Translates a Move Request message.
     *  
     *  @param player       indicates, which player should make the next move.
     *  @return             a call for the move of the next player.
     */
    public String translateMoveRequestText(String player){
        if(getIsGerman() == true)
        {
            return player + ", bitte geben sie ihren nächsten Spielzug ein.";
        }
        else
        {
            return player + ", please choose your next turn.";
        }
    }

    /**
     * Translates current Game State message.
     * 
     * @param currentGameState      indicates which state the gameboard currently has. 1 stands for draw, 2 stands for player one is winning, 3 stands for player two is winning.
     * @return                      a message with the current winning or draw states.
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
     * Translates wrong move message.
     * 
     * @return      a message to chose another move in the selected language.
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
