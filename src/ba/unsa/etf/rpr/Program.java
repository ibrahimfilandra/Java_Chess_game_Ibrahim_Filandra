package ba.unsa.etf.rpr;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        System.out.println("*****NEW GAME*****");
        String s1 = "", s2 = "";
        Scanner scan = new Scanner(System.in);
        Board b = new Board();
        boolean ispravan = false;
        igra:
        while (true) {
            do {
                try {
                    System.out.println("White move: ");
                    s1 = scan.next();
                    if (s1.charAt(0) == 'X' && s1.length() == 1) {
                        System.out.println("White has resigned");
                        break igra;
                    }
                    if (s1.charAt(0) > 'a' && s1.charAt(0) < 'h') {
                        if (s1.charAt(1) > '1' && s1.charAt(1) < '9') {
                            b.move(Pawn.class, ChessPiece.Color.WHITE, s1);
                            ispravan = true;
                        } else ispravan = false;
                    } else if (s1.charAt(0) == 'N') {
                        if (s1.charAt(1) > 'a' && s1.charAt(1) < 'h') {
                            if (s1.charAt(2) > '1' && s1.charAt(2) < '9') {
                                b.move(Knight.class, ChessPiece.Color.WHITE, (char) (s1.charAt(1)) + "" + (char) (s1.charAt(2)));
                                ispravan = true;
                            } else ispravan = false;
                        } else ispravan = false;
                    } else if (s1.charAt(0) == 'R') {
                        if (s1.charAt(1) > 'a' && s1.charAt(1) < 'h') {
                            if (s1.charAt(2) > '1' && s1.charAt(2) < '9') {
                                b.move(Rook.class, ChessPiece.Color.WHITE, (char) (s1.charAt(1)) + "" + (char) (s1.charAt(2)));
                                ispravan = true;
                            } else ispravan = false;
                        } else ispravan = false;
                    } else if (s1.charAt(0) == 'K') {
                        if (s1.charAt(1) > 'a' && s1.charAt(1) < 'h') {
                            if (s1.charAt(2) > '1' && s1.charAt(2) < '9') {
                                b.move(King.class, ChessPiece.Color.WHITE, (char) (s1.charAt(1)) + "" + (char) (s1.charAt(2)));
                                ispravan = true;
                            } else ispravan = false;
                        } else ispravan = false;
                    } else if (s1.charAt(0) == 'Q') {
                        if (s1.charAt(1) > 'a' && s1.charAt(1) < 'h') {
                            if (s1.charAt(2) > '1' && s1.charAt(2) < '9') {
                                b.move(Queen.class, ChessPiece.Color.WHITE, (char) (s1.charAt(1)) + "" + (char) (s1.charAt(2)));
                                ispravan = true;
                            } else ispravan = false;
                        } else ispravan = false;
                    } else if (s1.charAt(0) == 'B') {
                        if (s1.charAt(1) > 'a' && s1.charAt(1) < 'h') {
                            if (s1.charAt(2) > '1' && s1.charAt(2) < '9') {
                                b.move(Bishop.class, ChessPiece.Color.WHITE, (char) (s1.charAt(1)) + "" + (char) (s1.charAt(2)));
                                ispravan = true;
                            } else ispravan = false;
                        } else ispravan = false;
                    } else ispravan = false;

                } catch (Exception e) {
                    ispravan = false;
                }
                if (!ispravan) System.out.println("Illegal move");
            } while (!ispravan);
            if (b.isCheck(ChessPiece.Color.WHITE)) System.out.println("White is in check");


            do {
                try {
                    System.out.println("Black move: ");
                    s2 = scan.next();
                    if (s2.charAt(0) == 'X' && s2.length() == 1) {
                        System.out.println("Black has resigned");
                        break igra;
                    }
                    if (s2.charAt(0) > 'a' && s2.charAt(0) < 'h') {
                        if (s2.charAt(1) > '1' && s2.charAt(1) < '9') {
                            b.move(Pawn.class, ChessPiece.Color.BLACK, s2);
                            ispravan = true;
                        } else ispravan = false;
                    } else if (s2.charAt(0) == 'N') {
                        if (s2.charAt(1) > 'a' && s2.charAt(1) < 'h') {
                            if (s2.charAt(2) > '1' && s2.charAt(2) < '9') {
                                b.move(Knight.class, ChessPiece.Color.BLACK, (char) (s2.charAt(1)) + "" + (char) (s2.charAt(2)));
                                ispravan = true;
                            } else ispravan = false;
                        } else ispravan = false;
                    } else if (s2.charAt(0) == 'R') {
                        if (s2.charAt(1) > 'a' && s2.charAt(1) < 'h') {
                            if (s2.charAt(2) > '1' && s2.charAt(2) < '9') {
                                b.move(Rook.class, ChessPiece.Color.BLACK, (char) (s2.charAt(1)) + "" + (char) (s2.charAt(2)));
                                ispravan = true;
                            } else ispravan = false;
                        } else ispravan = false;
                    } else if (s2.charAt(0) == 'K') {
                        if (s2.charAt(1) > 'a' && s2.charAt(1) < 'h') {
                            if (s2.charAt(2) > '1' && s2.charAt(2) < '9') {
                                b.move(King.class, ChessPiece.Color.BLACK, (char) (s2.charAt(1)) + "" + (char) (s2.charAt(2)));
                                ispravan = true;
                            } else ispravan = false;
                        } else ispravan = false;
                    } else if (s2.charAt(0) == 'Q') {
                        if (s2.charAt(1) > 'a' && s2.charAt(1) < 'h') {
                            if (s2.charAt(2) > '1' && s2.charAt(2) < '9') {
                                b.move(Queen.class, ChessPiece.Color.BLACK, (char) (s2.charAt(1)) + "" + (char) (s2.charAt(2)));
                                ispravan = true;
                            } else ispravan = false;
                        } else ispravan = false;
                    } else if (s2.charAt(0) == 'B') {
                        if (s2.charAt(1) > 'a' && s2.charAt(1) < 'h') {
                            if (s2.charAt(2) > '1' && s2.charAt(2) < '9') {
                                b.move(Bishop.class, ChessPiece.Color.WHITE, (char) (s2.charAt(1)) + "" + (char) (s2.charAt(2)));
                                ispravan = true;
                            } else ispravan = false;
                        } else ispravan = false;
                    } else ispravan = false;

                } catch (Exception e) {
                    ispravan = false;
                }
                if (!ispravan) System.out.println("Illegal move");
            } while (!ispravan);

        }
    }
}
