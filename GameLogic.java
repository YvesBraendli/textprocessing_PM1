import java.util.ArrayList;
/**
 * This class implements the logic behind a game of TicTacToe.
 * The class has the following functionalities:
 *      check if a move is valid.
 *      check if a winning move has been made or the board is in a state of a draw.
 *      
 * @author Yves Brändli, Nadine Moser, Robin Meier
 * @version 1.0
 */

public class GameLogic
{
    /**
     * Empty constructor for the GameLogic class.
     * 
     */   
    public GameLogic()
    {
    }

    /**
     * Checks if move inputed is valid, following these rules:
     *  An input must be a value between 1-9.
     *  An input is not allowed in a field, which is already filled.
     *  
     *  @param field        indicates the field in which the players desires to set her moves.
     *  @param fields       gets the corresponding value for the fields of the gameboard.
     *  @return             the information, if the move is valid or not with a boolean.
     */
    public boolean validateMove(int field, ArrayList<Integer> fields)
    {
        boolean validmove = true;
        if((field < 1 || field > 9)
            || ((field == 1) && (fields.get(0) !=0))
            || ((field == 2) && (fields.get(1) !=0))
            || ((field == 3) && (fields.get(2) !=0))
            || ((field == 4) && (fields.get(3) !=0))
            || ((field == 5) && (fields.get(4) !=0))
            || ((field == 6) && (fields.get(5) !=0))
            || ((field == 7) && (fields.get(6) !=0))
            || ((field == 8) && (fields.get(7) !=0))
            || ((field == 9) && (fields.get(8) !=0)))
        {
            validmove = false;
        }
        return validmove;
    }

    /**
     * Checks for either a winning gamestate for each player or a draw.
     * Returns an int for each Player winning or a draw, corresponding the following values:
     * 0 = not yet finished
     * 1 = draw
     * 2 = Player one wins
     * 3 = Player two wins
     * 
     * @param fields        gets the corresponding value for the fields of the gameboard.
     * @param turnCount     the information, which players turn it is.
     * @return              the winningstatus as an integer.
     */
    public int checkGameState(ArrayList<Integer> fields, int turnCount)
    {
        int winningstatus = 0;
        int player = turnCount % 2 + 1;
        if (fields.get(0) == player && fields.get(1) == player && fields.get(2) == player) // horizontal, top row
        {
            winningstatus = player + 1;
        }
        else if (fields.get(3) == player && fields.get(4) == player && fields.get(5) == player) // horizontal, middle row
        {
            winningstatus = player + 1;
        }
        else if (fields.get(6) == player && fields.get(7) == player && fields.get(8) == player) // horizontal, bottom row
        {
            winningstatus = player + 1;
        }
        else if (fields.get(0) == player && fields.get(3) == player && fields.get(6) == player) // vertical, first row
        {
            winningstatus = player + 1;
        }
        else if (fields.get(1) == player && fields.get(4) == player && fields.get(7) == player) // vertical, second row
        {
            winningstatus = player + 1;
        }
        else if (fields.get(2) == player && fields.get(5) == player && fields.get(8) == player) // vertical, third row
        {
            winningstatus = player + 1;
        }
        else if (fields.get(0) == player && fields.get(4) == player && fields.get(8) == player) // diagonally, top left to bottom right
        {
            winningstatus = player + 1;
        }
        else if (fields.get(2) == player && fields.get(4) == player && fields.get(6) == player)  // diagonally, top left to bottom right
        {
            winningstatus = player + 1;
        }
        else if (turnCount == 8) // draw state
        {
            winningstatus = 1;
        }
        return winningstatus;
    }
}
