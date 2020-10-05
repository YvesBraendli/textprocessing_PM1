/*
 * This class implements the console outputs for a game of TicTacToe in english and german.
 * The class has the following functionalities:
 *      Print a welcome message
 *      Print the board
 *      Print a request for a language change
 *      Print a messsage if a language change has been made
 *      Print a request for a player to make a move
 *      Print a message for the winner
 *      Print a message in case of a draw
 *           
 * @author Yves Brändli, Nadine Moser, Robin Meier
 * @version 1.0
 */

public class GameOutput
{
    private String fieldsymbol1;
    private String fieldsymbol2;
    private String fieldsymbol3;
    private String fieldsymbol4;
    private String fieldsymbol5;
    private String fieldsymbol6;
    private String fieldsymbol7;
    private String fieldsymbol8;
    private String fieldsymbol9;
    private LanguageChange language;
    private String player;
    /*
     * Constructor for the GameOutput class.
     * 
     * @param empty
     */
    public GameOutput(LanguageChange languageChange)
    {
        fieldsymbol1 = "-";
        fieldsymbol2 = "-";
        fieldsymbol3 = "-";
        fieldsymbol4 = "-";
        fieldsymbol5 = "-";
        fieldsymbol6 = "-";
        fieldsymbol7 = "-";
        fieldsymbol8 = "-";
        fieldsymbol9 = "-";
        language = languageChange;
        player = "Spieler eins";
    }

    /*
     * Prints out a welcome message at the start of the game.
     */    
    public void printWelcome()
    {
        if(language.getIsGerman() == true)
        {
            System.out.println("Herzlich Willkommen zu ihrem neuen Spiel. " + player + ", bitte tätigen sie ihren ersten Spielzug.");
        }
        if(language.getIsGerman() == false)
        {
            player = "Player one";
            System.out.println("Welcome to your new Game. " + player + ", please select your first turn.");
        }
    }

    /*
     * Prints the board after every turn.
     */    
    public void printBoard(int[] fields)
    {
        if (fields[0] == 1)
        {
            fieldsymbol1 = "X";   
        } else if (fields[0] == 2)
        {
            fieldsymbol1 = "O"; 
        }
        if (fields[1] == 1)
        {
            fieldsymbol2 = "X";   
        } else if (fields[1] == 2)
        {
            fieldsymbol2 = "O"; 
        }
        if (fields[2] == 1)
        {
            fieldsymbol3 = "X";   
        } else if (fields[2] == 2)
        {
            fieldsymbol3 = "O"; 
        }
        if (fields[3] == 1)
        {
            fieldsymbol4 = "X";   
        } else if (fields[3] == 2)
        {
            fieldsymbol4 = "O"; 
        }
        if (fields[4] == 1)
        {
            fieldsymbol5 = "X";   
        } else if (fields[4] == 2)
        {
            fieldsymbol5 = "O"; 
        }
        if (fields[5] == 1)
        {
            fieldsymbol6 = "X";   
        } else if (fields[5] == 2)
        {
            fieldsymbol6 = "O"; 
        }
        if (fields[6] == 1)
        {
            fieldsymbol7 = "X";   
        } else if (fields[6] == 2)
        {
            fieldsymbol7 = "O"; 
        }
        if (fields[7] == 1)
        {
            fieldsymbol8 = "X";   
        } else if (fields[7] == 2)
        {
            fieldsymbol8 = "O"; 
        }
        if (fields[8] == 1)
        {
            fieldsymbol9 = "X";   
        } else if (fields[8] == 2)
        {
            fieldsymbol9 = "O"; 
        }
        System.out.println(fieldsymbol1 + " * " + fieldsymbol2 + " * " + fieldsymbol3);
        System.out.println("* * * * *");
        System.out.println(fieldsymbol4 + " * " + fieldsymbol5 + " * " + fieldsymbol6);
        System.out.println("* * * * *");
        System.out.println(fieldsymbol7 + " * " + fieldsymbol8 + " * " + fieldsymbol9);
        System.out.println();
    }

    /*
     * Prints out a request message for the language change functionality.
     */    
    public void printLanguageChangeRequest()
    {
        if(language.getIsGerman() == true)
        {
            System.out.println("Möchten sie die Sprache auf Englisch wechseln?");
        }
        if(language.getIsGerman() == false)
        {
            System.out.println("Would you like to switch the language to german?");
        }
    }

    /*
     * Prints out a message if the language change was completed.
     */
    public void printLanguageChange()
    {
        if(language.getIsGerman() == true)
        {
            System.out.println("Sprachwechsel auf Deutsch erfolgreich.");
        }
        if(language.getIsGerman() == false)
        {
            System.out.println("Language change to english successful.");
        }
    }

    /*
     * Prints out a request for a player to make a move.
     */    
    public void printMoveRequest(boolean isplayerone)
    {
        if(language.getIsGerman() == true)
        {
            if (isplayerone == true)
            { player = "Spieler Eins";
            }
            if (isplayerone == false)
            { player = "Spieler Zwei";
            }
            System.out.println(player + ", bitte geben sie ihren nächsten Spielzug ein.");
        }
        if(language.getIsGerman() == false)
        {
            if (isplayerone == true)
            { player = "Player one";
            }
            if (isplayerone == false)
            { player = "Player two";
            }
            System.out.println(player + ", please choose your next turn.");
        }
    }

    /*
     * Prints out a message if a winning condition has been met or the game ended in a draw.
     */    
    public void printGameState(int currentGameState)
    {
        if(language.getIsGerman() == true)
        {
            if (currentGameState == 1) // 1 Stands for a draw condition.
            { System.out.println("Sie haben ein Unentschieden erreicht. Herzliche Gratulation an beide Spieler.");
            }
            if (currentGameState == 2) // 2 Stands for a winning condition for Player one.
            { player = "Spieler Eins";
              System.out.println(player + ", hat das Spiel gewonnen");
            }
            if (currentGameState == 3) // 3 Stands for a winning condition for Player two.
            { player = "Spieler Zwei";
              System.out.println(player + ", hat das Spiel gewonnen");
            }
        }
        if(language.getIsGerman() == false)
        {
            if (currentGameState == 1) // 1 Stands for a draw condition.
            { System.out.println("You've reached a draw situation. Congratulations to both players.");
            }
            if (currentGameState == 2) // 2 Stands for a winning condition for Player one.
            { player = "Player one";
              System.out.println(player + ", has won the game.");
            }
            if (currentGameState == 3) // 3 Stands for a winning condition for Player two.
            { player = "Player two";
              System.out.println(player + ", has won the game");
            }
        }
    }

    public void printWrongMove()
    {
       if(language.getIsGerman() == true)
        {
            System.out.println("Zug ungültig. Wählen sie bitte einen freien Sektor auf dem Spielfeld.");
        }
        if(language.getIsGerman() == false)
        {
            System.out.println("Move invalid. Please select a free field on the gameboard.");
        } 
    }
}
