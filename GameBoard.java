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
    private int field1;
    private int field2;
    private int field3;
    private int field4;
    private int field5;
    private int field6;
    private int field7;
    private int field8;
    private int field9;
    private int turnCount;
    private GameOutput gameOutput;
    private GameLogic gameLogic;
    
    /*
     * Constructor for the GameBoard class.
     * 
     * @param
     */
    public GameBoard()
    {
        gameOutput = new GameOutput();
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
        boolean isPlayerOnesTurn = (turnCount % 2) == 1;
        gameOutput.printMoveRequest(isPlayerOnesTurn);
    }
    
    /*
     * Takes user input for one of the nine fields.
     * 
     * @param   move    a value between 1-9 to fill a field on the board.
     * @param   player  either "X" or "O" to indicate, which player is making a move.
     */
    public void nextMove(int move){
        if(move < 1 || move > 9)
        {
            //todo: invalid input, try again
        }
        
        boolean isValidMove = gameLogic.validateMove(move, 0); // 0 placeholder, not 
        if(isValidMove){
            saveMove();
            int currentGameState = gameLogic.checkGameState();
            gameOutput.printGameState(currentGameState);
            
            if(currentGameState > 0)
            {
                // todo: gameOutput.printEnding();
            }
            gameOutput.printLanguageChangeRequest();
        }
        else {
            gameOutput.printWrongMove();
        }
    }
    
    /*
     * Saves the move made to one of the nine field datafields after it has been validated.
     * 
     * @param   move    a value between 1-9 to fill a field on the board.
     * @param   player  either "X" or "O" to indicate, which player is making a move.
     */
    public void saveMove(){
        
    }
}
