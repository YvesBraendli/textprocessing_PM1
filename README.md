# Project 1 - TicTacToe
## gruppe3-fischbein-projekt1-tictactoe

## Authors
* Yves Brändli
* Nadine Moser
* Robin Meier

## How to play
In this version of TicTacToe it is not possible to directly input moves,
which is why there is an additional class to simulate moves: **_GameSimulation_**

To play, follow these steps:

1. Create a new GameSimulation object.
2. Start the _playGame()_ method.

With these steps a default game is played to completion. If the user wants to use a different preset or wants to create a whole new scenario, they can do this the following way:

1. Open the GameSimulation class.
2. Uncomment one of the four presets:
- Player One Wins
- Player Two Wins
- Draw
- Error Handling Situations

3. Or comment all the presets and add a completely new set of instructions following these rules:
- The set of instructions should start with _gameBoard.startGame();_. This clears the game board and gets it ready for a new round.
- To make a move use _gameBoard.nextMove(**x**);_ where **x** is the field value a player wants to set. Plays are made in alternating order starting with player one.
- A language change can be made at any point of the game with the _gameBoard.changeLanguage();_ method.  
