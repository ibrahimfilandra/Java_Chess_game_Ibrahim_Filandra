package ba.unsa.etf.rpr;
import static java.lang.Math.abs;
public class Pawn extends ChessPiece{

    Pawn(String position, Color color) {

        if(position.charAt(0)<'a'){
            if(position.charAt(0)<'A' || position.charAt(0)>'H')throw new IllegalArgumentException();
        }
        if(position.charAt(0)>'h')throw new IllegalArgumentException();   //Je li neispravno navedena kolona

        if(position.charAt(1)<'1'||position.charAt(1)>'8') throw new IllegalArgumentException(); //je li neispravno naveden red
        if(position.length()!=2) throw new IllegalArgumentException(); //Finalna provjera ispravnosti formata
        this.position=position;
        this.color=color;
        this.previous=position;
    }

    void move(String position) {

        if(position.charAt(0)<'a'){
            if(position.charAt(0)<'A' || position.charAt(0)>'H')throw new IllegalArgumentException();
        }
        if(position.charAt(0)>'h')throw new IllegalArgumentException();

        if(position.charAt(1)<'1'||position.charAt(1)>'8') throw new IllegalArgumentException();
        if(position.length()!=2) throw new IllegalArgumentException();

        if(this.color==Color.WHITE && this.position.charAt(1)=='2'&& position.charAt(1)=='4' && this.position.charAt(0)==position.charAt(0))
            this.position=position;

       else if(this.color==Color.BLACK && this.position.charAt(1)=='7'&&position.charAt(1)=='5' && this.position.charAt(0)==position.charAt(0))
             this.position=position;

       else if   ( (position.charAt(0)==this.position.charAt(0) || abs(this.position.charAt(0)-position.charAt(0))==32)&& position.charAt(1)-this.position.charAt(1)==1 )
         this.position=position;
          else throw new IllegalChessMoveException(); //samo se moze kretati naprijed za 1 polje ili 2 ako mu je prvi potez

    }

    void jedi(String position) {
        if(position.length()!=2) throw new IllegalArgumentException();
        if(position.charAt(0)<'a'){
            if(position.charAt(0)<'A' || position.charAt(0)>'H')throw new IllegalArgumentException();
        }
        if(position.charAt(0)>'h')throw new IllegalArgumentException();

        if(position.charAt(1)<'1'||position.charAt(1)>'8') throw new IllegalArgumentException();

if(position.charAt(1)-this.position.charAt(1)==1 && (abs(position.charAt(0)-this.position.charAt(0))==1 || abs( position.charAt(1)-this.position.charAt(1))==31 ||
        abs( position.charAt(1)-this.position.charAt(1))==33 ) ) this.position=position;
else throw new IllegalChessMoveException();
    }


}
