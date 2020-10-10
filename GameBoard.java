import java.util.ArrayList;
/**
 * This class implements a gameboard for a game of TicTacToe.
 * The class has the following functionalities:
 *      Initializing the board itself.
 *      Inputing values for the nine fields of the board.
 *      Saving the moves into the corresponding field.
 *      
 * @author Yves Brändli, Nadine Moser, Robin Meier
 * @version 1.0
 */


public class GameBoard
{
    private ArrayList<Integer> fields;
    private int turnCount;
    private GameOutput gameOutput;
    private GameLogic gameLogic;
    private LanguageController languageController;

    /**
     * Empty constructor for the GameBoard class.
     * 
     */
    public GameBoard()
    { 

    }

    /**
     * Prints out an empty field and asks for a players move.
     */
    public void startGame()
    { 
        turnCount = 0;
        languageController = new LanguageController();
        gameOutput = new GameOutput(languageController);
        gameLogic = new GameLogic();
        fields = new ArrayList<>();
        for (int i = 0; i<9; i++){
            fields.add(0);
        }
        int currentPlayer = 1;
        gameOutput.printWelcome(currentPlayer);
        gameOutput.printBoard(fields);
    }

    /**
     * Takes user input for one of the nine fields.
     * User input gets sent to get checked if its valid and a winning gamemove.
     * If valid it gets saved, else an error message is displayed.
     * 
     * @param field      indicates in which field the players wants to make her moves.
     */
    public void nextMove(int field){       
        boolean isValidMove = gameLogic.validateMove(field, fields);
        if(isValidMove){
            saveMove(field);
            gameOutput.printBoard(fields);
            int currentGameState = gameLogic.checkGameState(fields, turnCount);
            gameOutput.printGameState(currentGameState);
            if(currentGameState > 0)
            {
                return; //ends the game
            }
            turnCount++;
            int currentPlayer = (turnCount % 2) + 1;
            gameOutput.printLanguageChangeRequest();
            gameOutput.printMoveRequest(currentPlayer);
        }
        else {
            gameOutput.printWrongMove();
            gameOutput.printBoard(fields);
        }
    }

    /**
     * Saves the move made to one of the nine field in the fields ArrayList after it has been validated.
     * 
     * @param field      indicates in which field the players wants to make her moves.
     */
    private void saveMove(int field){
        int currentPlayer = (turnCount % 2) + 1;
        int index = field-1;
        fields.set(index, currentPlayer);
    }

    /**
     * Changes the language.
     */
    public void changeLanguage(){
        languageController.changeLanguage();
        gameOutput.printLanguageChange();
    }
}
