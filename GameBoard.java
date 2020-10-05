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

public class GameBoard
{
    private int[] fields;
    private int turnCount;
    private GameOutput gameOutput;
    private GameLogic gameLogic;
    private LanguageChange languageChange;
    
    /*
    * Constructor for the GameBoard class.
    * 
    * @param
    */
    public GameBoard()
    { 
        fields = new int[9];
        languageChange = new LanguageChange();
        gameOutput = new GameOutput(languageChange);
        gameLogic = new GameLogic();
    }
    
    /*
    * Prints out an empty field and asks for a players move.
    * 
    * @param 
    */
    public void startGame()
    { 
        gameOutput.printWelcome();
        gameOutput.printBoard(fields);
    }
    
    /*
    * Takes user input for one of the nine fields.
    * 
    * @param   move    a value between 1-9 to fill a field on the board.
    * @param   player  either "X" or "O" to indicate, which player is making a move.
    */
    public void nextMove(int field){
        
        boolean isValidMove = gameLogic.validateMove(field, fields, languageChange);
        if(isValidMove){
            saveMove(field);
            gameOutput.printBoard(fields);
            int currentGameState = gameLogic.checkGameState(fields);
            gameOutput.printGameState(currentGameState);
            if(currentGameState > 0)
            {
                // todo: gameOutput.printEnding();
                return;
            }
            turnCount++;
            gameOutput.printLanguageChangeRequest();
            //todo: printmoverequest, find better place
            boolean isPlayerOne = turnCount % 2 == 1;
            gameOutput.printMoveRequest(isPlayerOne);
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
        int player = (turnCount % 2) + 1;
        int index = field-1;
        fields[index] = player;
    }
    
    public void changeLanguage(){
        languageChange.changeLanguage();
        gameOutput.printLanguageChange();
    }
}
