
package boardgame;

public class Piece {
    
    protected Position position;
    private Board board;

    public Piece(Position position, Board board) {
        position = null;
        this.board = board;
    }

    /**
     *
     * @return Board
     */
    protected Board getBoard() {
        return board;
    }
    
    
}
