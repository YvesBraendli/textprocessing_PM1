/*
 * This class implements the logic behind a game of TicTacToe.
 * The class has the following functionalities:
 *      check if a move is valid
 *      check if a winning move has been made or the board is in a state of a draw
 *      
 * @author Yves Brändli, Nadine Moser, Robin Meier
 * @version 1.0
 */
public class GameLogic
{
    /*
     * Constructor for the GameLogic class.
     * 
     * @param
     */   
    public GameLogic()
    {
    }

    /*
     * Checks if move inputed is valid, following these rules:
     *  An input must be a value between 1-9.
     *  An input is not allowed in a field, which is already filled.
     *  
     *  @param 
     */
    public boolean validateMove(int field, int[] fields, LanguageChange languageChange)
    {
        GameOutput out = new GameOutput(languageChange);
        boolean validmove = true;
        if((field < 1 || field > 9)
            || ((field == 1) && (fields[0] !=0))
            || ((field == 2) && (fields[1] !=0))
            || ((field == 3) && (fields[2] !=0))
            || ((field == 4) && (fields[3] !=0))
            || ((field == 5) && (fields[4] !=0))
            || ((field == 6) && (fields[5] !=0))
            || ((field == 7) && (fields[6] !=0))
            || ((field == 8) && (fields[7] !=0))
            || ((field == 9) && (fields[8] !=0)))
        {
            validmove = false;
        }
        return validmove;
    }

    /*
     * Checks for either a winning gamestate or a draw.
     * Returns an int for each Player winning or a draw.
     * 0 = not yet finished
     * 1 = draw
     * 2 = Player one wins
     * 3 = Player two wins
     * 
     * @param
     */
    public int checkGameState(int[] fields, int turnCount)
    {
        int winningstatus = 0;
        if (fields[0] == 1 && fields[1] == 1 && fields[2] == 1) // horizontal, top row, player one
        {
            winningstatus = 2;
        }
        else if (fields[0] == 2 && fields[1] == 2 && fields[2] == 2) // horizontal, top row, player two
        {
            winningstatus = 3;
        }
        else if (fields[3] == 1 && fields[4] == 1 && fields[5] == 1) // horizontal, middle row, player one
        {
            winningstatus = 2;
        }
        else if (fields[3] == 2 && fields[4] == 2 && fields[5] == 2) // horizontal, middle row, player two
        {
            winningstatus = 3;
        }
        else if (fields[6] == 1 && fields[7] == 1 && fields[8] == 1) // horizontal, bottom row, player one
        {
            winningstatus = 2;
        }
        else if (fields[6] == 2 && fields[7] == 2 && fields[8] == 2) // horizontal, bottom row, player two
        {
            winningstatus = 3;
        }
        else if (fields[0] == 1 && fields[3] == 1 && fields[6] == 1) // vertical, first row, player one
        {
            winningstatus = 2;
        }
        else if (fields[0] == 2 && fields[3] == 2 && fields[6] == 2) // vertical, first row, player two
        {
            winningstatus = 3;
        }
        else if (fields[1] == 1 && fields[4] == 1 && fields[7] == 1) // vertical, second row, player one
        {
            winningstatus = 2;
        }
        else if (fields[1] == 2 && fields[4] == 2 && fields[7] == 2) // vertical, second row, player two
        {
            winningstatus = 3;
        }
        else if (fields[2] == 1 && fields[5] == 1 && fields[8] == 1) // vertical, third row, player one
        {
            winningstatus = 2;
        }
        else if (fields[2] == 2 && fields[5] == 2 && fields[8] == 2) // vertical, third row, player two
        {
            winningstatus = 3;
        }
        else if (fields[0] == 1 && fields[4] == 1 && fields[8] == 1) // diagonally, top left to bottom right, player one
        {
            winningstatus = 2;
        }
        else if (fields[0] == 2 && fields[4] == 2 && fields[8] == 2)  // diagonally, top left to bottom right, player two
        {
            winningstatus = 3;
        }
        else if (fields[2] == 1 && fields[4] == 1 && fields[6] == 1) // diagonally, top right to bottom left, player one
        {
            winningstatus = 2;
        }
        else if (fields[2] == 2 && fields[4] == 2 && fields[6] == 2) // diagonally, top right to bottom left, player two
        {
            winningstatus = 3;
        }
        else if (turnCount == 8)
        {
            winningstatus = 1;
        }
        return winningstatus;
    }
}
