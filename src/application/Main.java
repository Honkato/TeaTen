package application;

import definitions.Colors;
import definitions.Roles;
import game.King;
import game.Pawn;
import game.Piece;
import game.Table;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Table mesa = new Table();
        mesa.createPieces(new int[]{0, 0},Colors.BRANCO, Roles.KING);
        mesa.createPieces(new int[]{0, 0},Colors.BRANCO,Roles.KING);
        mesa.createPieces(new int[]{1, 1},Colors.PRETO,Roles.KING);
        mesa.createPieces(new int[]{0, 0},Colors.PRETO,Roles.KING);
        mesa.createPieces(new int[]{5, 1},Colors.PRETO,Roles.KING);
        System.out.println("======TODAS AS PEÇAS======");
        mesa.printAllPieces();
        System.out.println(mesa.pieces.get(5).get(0));
        Piece a = (Piece) mesa.pieces.get(5).get(1);
        System.out.println(a.getColor());
        King k = new King(0,0,Colors.PRETO);
        System.out.println(k.getColor());
    }
}