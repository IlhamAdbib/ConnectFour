package edu.nyu.cs.connectfour.view;

/**
 * Observer pattern: This is implemented by view class.
 * 
 * Controller is treated as subject with all views
 * registered to it(here only one is used) as observers.
 * designed to ensure that any changes in the game logic are promptly and correctly reflected in the user interface, maintaining synchronization between the game's state and its visual representation.
 *
 */
public interface ConnectFourObserver {
	/**
	 * Whenever controller has an update for the observer(here a view object) 
	 * registered to it, it will send an update to all of them
	 * 
	 * This enables graphics to be drawn on the UI once the state of the game changes
	 */
  void update();
  
  /**
   * Updates the observer that the game has ended - win/tie
   */
  void gameOver();
}