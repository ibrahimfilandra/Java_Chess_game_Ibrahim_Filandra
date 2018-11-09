package ba.unsa.etf.rpr;



public class Board implements Cloneable{

    ChessPiece [][] board= new ChessPiece[8][8];

    Board (){

        board[0][0]=new Rook("A8",ChessPiece.Color.BLACK);
        board[0][1]=new Knight("B8",ChessPiece.Color.BLACK);
        board[0][2]=new Bishop("C8",ChessPiece.Color.BLACK);
        board[0][3]=new Queen("D8",ChessPiece.Color.BLACK);
        board[0][4]=new King("E8",ChessPiece.Color.BLACK);
        board[0][5]=new Bishop("F8",ChessPiece.Color.BLACK);
        board[0][6]=new Knight("G8",ChessPiece.Color.BLACK);
        board[0][7]=new Rook("H8",ChessPiece.Color.BLACK);

        for(int i=0;i<8;i++) {
            board[1][i]=new Pawn((char)(i+'A')+"7",ChessPiece.Color.BLACK);
        }
        board[7][0]=new Rook("A1",ChessPiece.Color.WHITE);
        board[7][1]=new Knight("B1",ChessPiece.Color.WHITE);
        board[7][2]=new Bishop("C1",ChessPiece.Color.WHITE);
        board[7][3]=new Queen("D1",ChessPiece.Color.WHITE);
        board[7][4]=new King("E1",ChessPiece.Color.WHITE);
        board[7][5]=new Bishop("F1",ChessPiece.Color.WHITE);
        board[7][6]=new Knight("G1",ChessPiece.Color.WHITE);
        board[7][7]=new Rook("H1",ChessPiece.Color.WHITE);
        for(int i=0;i<8;i++) {
            board[6][i]=new Pawn((char)('A'+i)+"2",ChessPiece.Color.WHITE);
    }

    for(int i=2;i<6;i++) {
        for(int j=0;j<8;j++) {
            board[i][j]=new PraznoPolje();
        }
    }


    }

   void move (Class type, ChessPiece.Color color, String position) {
       int brojaczafigure=0,brojaczaizuzetke=0;
       String pomocna=""; int rednadjene=0, kolonanadjene=0;
    prva:    for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
             if(board[i][j].getClass()==type && board[i][j].getColor()==color) {
                pomocna=board[i][j].getPosition();
brojaczafigure++;
try {

    board[i][j].move(position);
rednadjene=i; kolonanadjene=j;

break prva;
}
catch( Exception e) {
brojaczaizuzetke++;
                 }
            }

            }
        }
if(brojaczafigure==brojaczaizuzetke ) throw new IllegalChessMoveException(); //ako za svaku provjerenu figuru je bacilo izuzetak da je potez ilegalan


            if( !(board[position.charAt(1)-48][position.charAt(0)-65] instanceof PraznoPolje) &&  board[position.charAt(1)-48][position.charAt(0)-65].getColor()==color)
               board[rednadjene][kolonanadjene].move(pomocna);           //
            else if(board[position.charAt(1)-48][position.charAt(0)-65] instanceof PraznoPolje || board[position.charAt(1)-48][position.charAt(0)-65].getColor()!=color){
                int red=position.charAt(1)-48; int kolona=position.charAt(0)-65; //koordinate odredisnog polja u 2d nizu

                if(board[rednadjene][kolonanadjene] instanceof Bishop)
                    board[red][kolona]= new Bishop(board[red][kolona].getPosition(), board[red][kolona].getColor()); //azuriranje nove pozicije figure u 2D nizu
                if(board[rednadjene][kolonanadjene] instanceof King)
                    board[red][kolona]= new King(board[red][kolona].getPosition(), board[red][kolona].getColor());
                if(board[rednadjene][kolonanadjene] instanceof Queen)
                    board[red][kolona]= new Queen(board[red][kolona].getPosition(), board[red][kolona].getColor());
                if(board[rednadjene][kolonanadjene] instanceof Knight)
                    board[red][kolona]= new Knight(board[red][kolona].getPosition(), board[red][kolona].getColor());
                if(board[rednadjene][kolonanadjene] instanceof Pawn)
                    board[red][kolona]= new Pawn(board[red][kolona].getPosition(), board[red][kolona].getColor());
                if(board[rednadjene][kolonanadjene] instanceof Rook)
                    board[red][kolona]= new Rook(board[red][kolona].getPosition(), board[red][kolona].getColor());

                board[rednadjene][kolonanadjene]=new PraznoPolje(); // ostavi prazno mjesto gdje je prethodno bila figura

            }

   }
    void move(String oldPosition, String newPosition){


                   int rednadjene=oldPosition.charAt(1)-48;
                   int kolonanadjene=oldPosition.charAt(0)-65;
                  if(board[rednadjene][kolonanadjene].getPosition()=="") throw new IllegalArgumentException(); //ako na oldPosition nema figure
                        try {
                                board[rednadjene][kolonanadjene].move(newPosition);
                        }

                        catch(Exception e){
                            throw new IllegalChessMoveException();
                        }


        int redodredisne=newPosition.charAt(1)-48; int kolonaodredisne=newPosition.charAt(0)-65;
              if(board[redodredisne][kolonaodredisne].getColor()==board[rednadjene][kolonanadjene].getColor())
                  board[rednadjene][kolonanadjene].move(newPosition);

        if(board[rednadjene][kolonanadjene] instanceof Bishop)
            board[redodredisne][kolonaodredisne]= new Bishop(board[redodredisne][kolonaodredisne].getPosition(), board[redodredisne][kolonaodredisne].getColor());
        if(board[rednadjene][kolonanadjene] instanceof King)
            board[redodredisne][kolonaodredisne]= new King(board[redodredisne][kolonaodredisne].getPosition(), board[redodredisne][kolonaodredisne].getColor());
        if(board[rednadjene][kolonanadjene] instanceof Queen)
            board[redodredisne][kolonaodredisne]= new Queen(board[redodredisne][kolonaodredisne].getPosition(), board[redodredisne][kolonaodredisne].getColor());
        if(board[rednadjene][kolonanadjene] instanceof Knight)
            board[redodredisne][kolonaodredisne]= new Knight(board[redodredisne][kolonaodredisne].getPosition(), board[redodredisne][kolonaodredisne].getColor());
        if(board[rednadjene][kolonanadjene] instanceof Pawn)
            board[redodredisne][kolonaodredisne]= new Pawn(board[redodredisne][kolonaodredisne].getPosition(), board[redodredisne][kolonaodredisne].getColor());
        if(board[rednadjene][kolonanadjene] instanceof Rook)
            board[redodredisne][kolonaodredisne]= new Rook(board[redodredisne][kolonaodredisne].getPosition(), board[redodredisne][kolonaodredisne].getColor());

        board[rednadjene][kolonanadjene].PostaviNaNeaktivno();



    }



   boolean isCheck ( ChessPiece.Color color) {
        String kraljevapozicija="";
      vanjska:  for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                if(board[i][j] instanceof King && board[i][j].getColor()==color) {
                    kraljevapozicija = board[i][j].getPosition(); //uzimamo poziciju na kojoj se nalazi kralj
                    break vanjska;
                }
            }
        }
        int brojacfigura=0, brojacizuzetaka=0;
        for(int i=0;i<8;i++) {
           for(int j=0;j<8;j++) {
               if(board[i][j].getPosition()!="" && board[i][j].getColor()!= color) {
                   brojacfigura++;
                   try {
                       board[i][j].move(kraljevapozicija);
                   }


                   catch(Exception e) {
                       brojacizuzetaka++;

                   }
                   if(brojacfigura!=brojacizuzetaka) return true;
               }

           }
       }
            return false;
   }




}
