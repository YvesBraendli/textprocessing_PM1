/*
 * This class implements the language change functionality for a game of TicTacToe.
 * The two languages to chose from are english and german.
 * The class has the following functionalities:
 *      switch the language
 *      
 * @author Yves Brändli, Nadine Moser, Robin Meier
 * @version 1.0
 */
public class LanguageChange
{
    private boolean isGerman;
    /*
     * Constructor for the LanguageChange class.
     * 
     * @param isGerman false for english, true for german
     */
    public LanguageChange()
    {
        isGerman = false;
    }

    /*
     * 
     * sets the isGerman boolean
     * 
     * @param
     */
    public void setIsGerman(boolean isGerman)
    {
        this.isGerman = isGerman;
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
}
