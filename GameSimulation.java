/**
 * This class implements fake user inputs to simulate a game of TicTacToe.
 * The different game procedures can be choosen by removing the slahes in the beginning of each procedure.
 * The class has the following functionalities:
 *      play the game
 *      
 * @author Yves Brändli, Nadine Moser, Robin Meier
 * @version 1.0
 */
public class GameSimulation
{
    private GameBoard gameBoard;
    /**
     * Constructor for the GameSimulation class.
     * 
     */
    public GameSimulation()
    {
        gameBoard = new GameBoard();
    }

    /**
     * playGame starts a Game of TicTacToe. 
     * This is the method that generates the different inputs, to run the game.
     */
    public void playGame()
    {
        /* Gametype 1: Player One Wins */
        gameBoard.startGame();
        gameBoard.nextMove(1);
        gameBoard.nextMove(2);
        gameBoard.changeLanguage();
        gameBoard.nextMove(5);
        gameBoard.nextMove(9);
        gameBoard.nextMove(7);
        gameBoard.changeLanguage();
        gameBoard.nextMove(4);
        gameBoard.nextMove(3);

        // /* Gametype 2: Player Two Wins */
        // gameBoard.startGame();
        // gameBoard.nextMove(1);
        // gameBoard.changeLanguage();
        // gameBoard.nextMove(5);
        // gameBoard.changeLanguage();
        // gameBoard.nextMove(2);
        // gameBoard.changeLanguage();
        // gameBoard.nextMove(3);
        // gameBoard.changeLanguage();
        // gameBoard.nextMove(4);
        // gameBoard.changeLanguage();
        // gameBoard.nextMove(7);

        // // /* Gametype 3: Draw */
        // gameBoard.startGame();
        // gameBoard.nextMove(1);
        // gameBoard.nextMove(3);
        // gameBoard.nextMove(2);
        // gameBoard.nextMove(9);
        // gameBoard.nextMove(6);
        // gameBoard.nextMove(8);
        // gameBoard.nextMove(7);
        // gameBoard.nextMove(4);
        // gameBoard.nextMove(5); 

        // /* Gametype 4: Errorhandling Situations */
        // gameBoard.startGame();
        // gameBoard.nextMove(1);
        // gameBoard.nextMove(1); // Trying to overwrite others player move
        // gameBoard.nextMove(2); // Making correct move after wrong one
        // gameBoard.nextMove(-10); // Negativ out of bounds move
        // gameBoard.nextMove(99); // Positive out of bounds move
        // gameBoard.nextMove(3); // Making correct move after wrong move

        // gameBoard.nextMove(5); // Finishing game
        // gameBoard.nextMove(4);
        // gameBoard.nextMove(8);

    }
}
