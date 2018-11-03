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

    void Move(String position) {

        if(position.charAt(0)!='A' || position.charAt(0)!='B'|| position.charAt(0)!='C'|| position.charAt(0)!='D'||
        position.charAt(0)!='E'|| position.charAt(0)!='F' || position.charAt(0)!='G'|| position.charAt(0)!='H'
        || position.charAt(0)!='a'|| position.charAt(0)!='b'|| position.charAt(0)!='c'|| position.charAt(0)!='d'
                || position.charAt(0)!='e'|| position.charAt(0)!='f'|| position.charAt(0)!='g'|| position.charAt(0)!='h')
        throw new IllegalArgumentException();

        if(position.charAt(1)!='1'||position.charAt(1)!='2'||position.charAt(1)!='3' ||position.charAt(1)!='4'
        ||position.charAt(1)!='5'||position.charAt(1)!='6'||position.charAt(1)!='7'||position.charAt(1)!='8'
        ) throw new IllegalArgumentException();

    }

}
