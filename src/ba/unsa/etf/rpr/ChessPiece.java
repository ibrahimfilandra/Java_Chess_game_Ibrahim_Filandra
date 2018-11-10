package ba.unsa.etf.rpr;

public abstract class ChessPiece implements Cloneable {

    public static enum Color {WHITE, BLACK}

    ;
    String position;
    Color color;
    String previous;

    String getPosition() {
        return position;
    }

    Color getColor() {
        return color;
    }

    void movebackwards() {
        position = previous;
    }

    void move(String position) {

    }


    ChessPiece() {
        this.position = "";
        this.color = Color.WHITE;
        this.previous = "";
    }

}
