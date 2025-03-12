package bcc.battleship;

public class Ship {
    private int row, col, length, direction;

    // Constructor. Create a ship and set the length.
    public Ship(int length) {
        this.length = length;
        this.row = Constants.UNSET;
        this.col = Constants.UNSET;
        this.direction = Constants.UNSET;
    }

    // Has the location been initialized
    public boolean isLocationSet() {
        return row != Constants.UNSET && col != Constants.UNSET;
    }

    // Has the direction been initialized
    public boolean isDirectionSet() {
        return direction != Constants.UNSET;
    }

    // Set the location of the ship
    public void setLocation(int row, int col) {
        this.row = row;
        this.col = col;
    }

    // Set the direction of the ship
    public void setDirection(int direction) {
        this.direction = direction;
    }

    // Getter for the row value
    public int getRow() { return row; }
    
    // Getter for the column value
    public int getCol() { return col; }
    
    // Getter for the length of the ship
    public int getLength() { return length; }
    
    // Getter for the direction
    public int getDirection() { return direction; }

    // Helper method to get a string value from the direction
    private String directionToString() {
        return direction == Constants.HORIZONTAL ? "horizontal" :
               direction == Constants.VERTICAL ? "vertical" : "unset direction";
    }

    // Helper method to get a (row, col) string value from the location
    private String locationToString() {
        return isLocationSet() ? "(" + row + ", " + col + ")" : "(unset location)";
    }

    // toString value for this Ship
    @Override
    public String toString() {
        return directionToString() + " ship of length " + length + " at " + locationToString();
    }
}
