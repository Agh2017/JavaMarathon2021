package day17;

public enum ChessPiece {
    KING_WHITE(100, "♔"), KING_BLACK(100, "♚"), QUEEN_WHITE(9, "♕"), QUEEN_BLACK(9, "♛"),
    ROOK_WHITE(5, "♖"), ROOK_BLACK(5, "♜"), BISHOP_WHITE(3, "♗"), BISHOP_BLACK(3, "♝"),
    KNIGHT_WHITE(3.5, "♘"), KNIGHT_BLACK(3.5, "♞"), PAWN_WHITE(3.5, "♙"), PAWN_BLACK(3.5, "♟");

    private double value;
    private String shapeDescription;

    ChessPiece(double value, String shapeDescription) {
        this.value=value;
        this.shapeDescription=shapeDescription;
    }

    public double getValue() {
        return value;
    }

    public String getShapeDescription() {
        return shapeDescription;
    }

    @Override
    public String toString() {
        return shapeDescription;
    }
}
