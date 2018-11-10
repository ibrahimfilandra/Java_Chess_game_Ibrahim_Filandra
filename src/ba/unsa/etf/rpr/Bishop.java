package ba.unsa.etf.rpr;

import static java.lang.Math.abs;
public class Bishop extends ChessPiece {

    Bishop(String position, Color color) {
        if(position.charAt(0)<'a'){
            if(position.charAt(0)<'A' || position.charAt(0)>'H')throw new IllegalArgumentException();
        }
        if(position.charAt(0)>'h')throw new IllegalArgumentException();   //Je li neispravno navedena kolona

        if(position.charAt(1)<'1'||position.charAt(1)>'8') throw new IllegalArgumentException(); //je li neispravno naveden red
        if(position.length()!=2) throw new IllegalArgumentException(); //Finalna provjera ispravnosti formata

        this.position=position; this.color=color; this.previous=position;
    }

    public void move(String position) {
        if(position.charAt(0)<'a'){
            if(position.charAt(0)<'A' || position.charAt(0)>'H')throw new IllegalArgumentException();
        }
        if(position.charAt(0)>'h')throw new IllegalArgumentException();

        if(position.charAt(1)<'1'||position.charAt(1)>'8') throw new IllegalArgumentException();
        if(position.length()!=2) throw new IllegalArgumentException();

        if(!(  abs(position.charAt(0)-this.position.charAt(0))==abs(position.charAt(1)-this.position.charAt(1))
                ||  abs(position.charAt(0)-this.position.charAt(0))-32==abs(position.charAt(1)-this.position.charAt(1)) )) throw new IllegalChessMoveException();
         //ako nije napravljena ista razlika u redovima i kolonama (ako se ne krece dijagonalno) baci izuzetak
           //uracunato je i to da funkcija treba raditi i sa malim i sa velikim slovima za oznaku kolona


    }

}
