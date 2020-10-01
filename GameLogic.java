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
    private GameBoard currentsituation;
    /*
     * Constructor for the GameLogic class.
     * 
     * @param
     */   
    public GameLogic()
    {
        currentsituation = new GameBoard();
    }

    /*
     * Checks if move inputed is valid, following these rules:
     *  An input must be a value between 1-9.
     *  An input is not allowed in a field, which is already filled.
     *  
     *  @param 
     */
    public boolean validateMove(int field, int player)
    {
        GameOutput out = new GameOutput();
        boolean validmove = true;
        if(((field == 1) && (currentsituation.returnField1() !=0))||((field == 2) && (currentsituation.returnField2() !=0))||((field == 3) && (currentsituation.returnField3() !=0))||((field == 4) && (currentsituation.returnField4() !=0))||
        ((field == 5) && (currentsituation.returnField5() !=0))||((field == 6) && (currentsituation.returnField6() !=0))||((field == 7) && (currentsituation.returnField7() !=0))||((field == 8) && (currentsituation.returnField8() !=0))||
        ((field == 9) && (currentsituation.returnField9() !=0)))
        {
            out.printWrongMove(); 
        }
        else 
        {
            validmove = true;   
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
    public int checkGameState()
    {
        int winningstatus = 0;
        if ((currentsituation.returnField1() && currentsituation.returnField2() && currentsituation.returnField3()) == 1) // horizontal, top row, player one
        {
            winningstatus = 2;
        }
        if ((currentsituation.returnField1() && currentsituation.returnField2() && currentsituation.returnField3()) == 2) // horizontal, top row, player two
        {
            winningstatus = 3;
        }
        if ((currentsituation.returnField4() && currentsituation.returnField5() && currentsituation.returnField6()) == 1) // horizontal, middle row, player one
        {
            winningstatus = 2;
        }
        if ((currentsituation.returnField4() && currentsituation.returnField5() && currentsituation.returnField6()) == 2) // horizontal, middle row, player two
        {
            winningstatus = 3;
        }
        if ((currentsituation.returnField7() && currentsituation.returnField8() && currentsituation.returnField9()) == 1) // horizontal, bottom row, player one
        {
            winningstatus = 2;
        }
        if ((currentsituation.returnField7() && currentsituation.returnField8() && currentsituation.returnField9()) == 2) // horizontal, bottom row, player two
        {
            winningstatus = 3;
        }
        if ((currentsituation.returnField1() && currentsituation.returnField4() && currentsituation.returnField7()) == 1) // vertical, first row, player one
        {
            winningstatus = 2;
        }
        if ((currentsituation.returnField1() && currentsituation.returnField4() && currentsituation.returnField7()) == 2) // vertical, first row, player two
        {
            winningstatus = 3;
        }
        if ((currentsituation.returnField2() && currentsituation.returnField5() && currentsituation.returnField8()) == 1) // vertical, second row, player one
        {
            winningstatus = 2;
        }
        if ((currentsituation.returnField2() && currentsituation.returnField5() && currentsituation.returnField8()) == 2) // vertical, second row, player two
        {
            winningstatus = 3;
        }
        if ((currentsituation.returnField3() && currentsituation.returnField6() && currentsituation.returnField9()) == 1) // vertical, third row, player one
        {
            winningstatus = 2;
        }
        if ((currentsituation.returnField3() && currentsituation.returnField6() && currentsituation.returnField9()) == 2) // vertical, third row, player two
        {
            winningstatus = 3;
        }
        if ((currentsituation.returnField1() && currentsituation.returnField5() && currentsituation.returnField9()) == 1) // diagonally, top left to bottom right, player one
        {
            winningstatus = 2;
        }
        if ((currentsituation.returnField1() && currentsituation.returnField5() && currentsituation.returnField9()) == 1) // diagonally, top left to bottom right, player two
        {
            winningstatus = 3;
        }
        if ((currentsituation.returnField3() && currentsituation.returnField5() && currentsituation.returnField7()) == 1) // diagonally, top right to bottom left, player one
        {
            winningstatus = 2;
        }
        if ((currentsituation.returnField3() && currentsituation.returnField5() && currentsituation.returnField7()) == 2) // diagonally, top right to bottom left, player two
        {
            winningstatus = 3;
        }
        return winningstatus;
    }
}
