package ba.unsa.etf.rpr;

import static java.lang.Math.abs;

public class King extends ChessPiece {

    String position;
    Color color;
    King (String position, Color color){
        this.position=position;
        this.color=color;
    }

    public class IllegalChessMoveException extends RuntimeException {
   public IllegalChessMoveException() {super();}

    }
    @Override
    void Move(String position) {


if(position.charAt(0)<'a'){
    if(position.charAt(0)<'A' || position.charAt(0)>'H')throw new IllegalArgumentException();
}
if(position.charAt(0)>'h')throw new IllegalArgumentException();   //Je li neispravno navedena kolona

        if(position.charAt(1)<'1'||position.charAt(1)>'8') throw new IllegalArgumentException(); //je li neispravno naveden red
        if(position.length()!=2) throw new IllegalArgumentException(); //Finalna provjera ispravnosti formata

        if(abs(this.getPosition().charAt(1)-position.charAt(1))>1) throw new IllegalChessMoveException();
        if(abs(this.getPosition().charAt(0)-position.charAt(0))>1  && abs(this.getPosition().charAt(0) -position.charAt(0))!=33)
            throw new IllegalChessMoveException();       //Bacanje izuzetka ako se zeli napraviti ilegalno kretanje sa kraljem


    }
}
