/*
* This class implements a gameboard for a game of TicTacToe.
* The class has the following functionalities:
*      Initializing the board itself
*      Inputing values for the nine fields of the board
*      Saving the moves into the corresponding datafield
*      
* @author Yves Brändli, Nadine Moser, Robin Meier
* @version 1.0
*/
import java.util.ArrayList;

public class GameBoard
{
    private ArrayList<Integer> fields;
    private int turnCount;
    private GameOutput gameOutput;
    private GameLogic gameLogic;
    private LanguageController languageController;
    
    /*
    * Constructor for the GameBoard class.
    * 
    * @param
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
    * 
    * @param   move    a value between 1-9 to fill a field on the board.
    * @param   player  either "X" or "O" to indicate, which player is making a move.
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
                // todo: gameOutput.printEnding();
                return;
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
    
    /*
    * Saves the move made to one of the nine field datafields after it has been validated.
    * 
    * @param   move    a value between 1-9 to fill a field on the board.
    * @param   player  either "X" or "O" to indicate, which player is making a move.
    */
    private void saveMove(int field){
        int currentPlayer = (turnCount % 2) + 1;
        int index = field-1;
        fields.set(index, currentPlayer);
    }
    
    public void changeLanguage(){
        languageController.changeLanguage();
        gameOutput.printLanguageChange();
    }
}
