# Connect Four Game

Welcome to the Connect Four game implemented in Java! This project demonstrates the use of several design patterns including Builder, Observer, and Strategy, alongside a graphical user interface built with Java Swing.



## Features
- Two-player game (Player vs Player)
- Undo functionality
- Graphical User Interface using Java Swing
- Scalable and maintainable code architecture

## Design Patterns
### Builder
The Builder pattern is used for constructing complex objects step by step. In this project, it helps in constructing the game board and setting up the initial game state.

### Observer
The Observer pattern is used to handle the game state updates and ensure that the GUI components are in sync with the underlying game logic. When the game state changes, the observers are notified to update the display accordingly.

### Strategy
The Strategy pattern allows the implementation of different algorithms for the game moves. This can be extended to implement different AI strategies for a computer player in the future.
