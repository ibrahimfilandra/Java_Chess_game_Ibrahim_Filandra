package ba.unsa.etf.rpr;



public class Board {

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
            board[1][i]=new Pawn('A'+i+"7",ChessPiece.Color.BLACK);
        }
        board[7][0]=new Rook("A2",ChessPiece.Color.WHITE);
        board[7][1]=new Knight("B2",ChessPiece.Color.WHITE);
        board[7][2]=new Bishop("C2",ChessPiece.Color.WHITE);
        board[7][3]=new Queen("D2",ChessPiece.Color.WHITE);
        board[7][4]=new King("E2",ChessPiece.Color.WHITE);
        board[7][5]=new Bishop("F2",ChessPiece.Color.WHITE);
        board[7][6]=new Knight("G2",ChessPiece.Color.WHITE);
        board[7][7]=new Rook("H2",ChessPiece.Color.WHITE);
        for(int i=0;i<8;i++) {
            board[6][i]=new Pawn('A'+i+"2",ChessPiece.Color.WHITE);
        }


    }

}
