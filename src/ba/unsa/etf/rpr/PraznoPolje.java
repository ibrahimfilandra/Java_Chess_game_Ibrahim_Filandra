package ba.unsa.etf.rpr;

import static ba.unsa.etf.rpr.ChessPiece.Color.WHITE;

public class PraznoPolje extends ChessPiece {

   PraznoPolje(String position) {
     this.position=position;
     this.color=WHITE;
   }


}
