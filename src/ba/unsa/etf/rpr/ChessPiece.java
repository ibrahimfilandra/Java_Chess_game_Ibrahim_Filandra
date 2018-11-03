package ba.unsa.etf.rpr;

public abstract class ChessPiece {

    public static enum Color {WHITE, BLACK}

    ;
    String position;
    Color color;

    String getPosition() {
        return position;
    }

    Color getColor() {
        return color;
    }



    void move(String position) {

    }



}
