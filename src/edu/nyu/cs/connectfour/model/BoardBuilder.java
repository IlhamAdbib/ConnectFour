package edu.nyu.cs.connectfour.model;

/**
 * Builder class for board object that takes row, column and returns a board
 * 
 * @author abhishek bhunia
 *
 */

public class BoardBuilder implements Builder{
  private int row;
  private int col;
  @Override
  /*public BoardBuilder buildFromRow(int row): This method sets the number of rows for the board. It takes an integer row, assigns it to the row attribute of the builder, and returns the builder instance itself. This return type supports fluent chaining, where multiple builder methods can be called in a single line..*/
  public BoardBuilder buildFromRow(int row) {
    this.row = row;
    return this;
  }
  @Override
  public BoardBuilder buildFromCol(int col) {
    this.col = col;
    return this;
  }



  /**
   * builder function for the board class
   * @return board object
   * public Board build(): This method constructs the final Board object using the configured row and col values. It calls Board.getBoard(row, col), which refers to the singleton method of the Board class that returns an instance of Board with the specified dimensions, ensuring that there is only one board instance throughout the application.
   */
  @Override
  public Board build() {
    return Board.getBoard(row, col);
  }
}