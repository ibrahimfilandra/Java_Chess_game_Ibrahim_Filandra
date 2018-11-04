package ba.unsa.etf.rpr;

import static java.lang.Math.abs;

public class Knight extends ChessPiece {

    Knight(String position, Color color) {

        if(position.charAt(0)<'a'){
            if(position.charAt(0)<'A' || position.charAt(0)>'H')throw new IllegalArgumentException();
        }
        if(position.charAt(0)>'h')throw new IllegalArgumentException();   //Je li neispravno navedena kolona

        if(position.charAt(1)<'1'||position.charAt(1)>'8') throw new IllegalArgumentException(); //je li neispravno naveden red
        if(position.length()!=2) throw new IllegalArgumentException(); //Finalna provjera ispravnosti formata
        this.position=position;
        this.color=color;



    }

    void move(String position) {
        if(position.charAt(0)<'a'){
            if(position.charAt(0)<'A' || position.charAt(0)>'H')throw new IllegalArgumentException();
        }
        if(position.charAt(0)>'h')throw new IllegalArgumentException();

        if(position.charAt(1)<'1'||position.charAt(1)>'8') throw new IllegalArgumentException();
        if(position.length()!=2) throw new IllegalArgumentException();

        if (! (( abs(position.charAt(0)-this.position.charAt(0))==3 &&  abs(position.charAt(1)-this.position.charAt(1))==1 ) ||
        ( abs(position.charAt(1)-this.position.charAt(1))==3 &&  abs(position.charAt(0)-this.position.charAt(0))==1 ) ||
                ( abs(position.charAt(0)-this.position.charAt(0))==35 &&  abs(position.charAt(1)-this.position.charAt(1))==1 )
        ||( abs(position.charAt(0)-this.position.charAt(0))==29 &&  abs(position.charAt(1)-this.position.charAt(1))==1 )
        ))
            throw new IllegalChessMoveException();
    }

}
