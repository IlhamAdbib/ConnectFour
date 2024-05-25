## Overview

The Connect Four game is a classic board game where two players take turns dropping colored discs into a vertically suspended grid. The objective is to connect four of one's own discs of the same color in a row, column, or diagonal before your opponent does.

## Key Features

### Builder Pattern

 employed the Builder design pattern to construct complex game configurations with ease. The Builder pattern allows us to separate the construction of complex objects from their representation, making it simple to create various game setups.

### Strategy Pattern

The Strategy design pattern is used to implement different strategies for the computer player. Players can choose from multiple AI strategies, each with its own approach to selecting the best move. Whether you prefer a defensive or aggressive playing style, our game has a strategy for you!

### Observer Pattern

The Observer design pattern is utilized to implement the game's event handling mechanism. Players, observers, and the game itself observe various game events such as disc drops, wins, and draws. This pattern ensures loose coupling between game components and allows for easy extensibility.

### Singleton Pattern

 employed the Singleton design pattern to ensure that there is only one instance of the game board throughout the application. This pattern guarantees global access to the board state and prevents multiple instances from being created inadvertently.


