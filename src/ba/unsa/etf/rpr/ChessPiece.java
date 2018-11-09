package ba.unsa.etf.rpr;

public abstract class ChessPiece implements Cloneable{

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

    void PostaviNaNeaktivno() {
        this.position="";
    }

    ChessPiece() {
        this.position="";
        this.color=Color.WHITE;
    }

}
