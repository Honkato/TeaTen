package game;

import definitions.Colors;
import definitions.Roles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Table {
    public int xMax = 8;
    public int yMax = xMax;
    private final List<Pawn> pawns = new ArrayList<>();
    private final List<Tower> towers = new ArrayList<>();
    private final List<Horse> horses = new ArrayList<>();
    private final List<Bishop> bishops = new ArrayList<>();
    private final List<Queen> queens = new ArrayList<>();
    private final List<King> kings = new ArrayList<>();
    public final List<List<?>> pieces = new ArrayList<>(List.of(pawns, towers, horses, bishops, queens, kings));
    public Table(){
//        System.out.println(pieces.get(0).get(0));
//        Piece peca = (Piece) pieces.get(0).get(0);
//        System.out.println(peca.getRole());
    }
    public void createPieces(int[] xy, Colors color, Roles role) {

        if (!canCreatePieces(xy, color, role)){
            System.out.println("CANCELADO");
            return;
        }

        switch (role) {
            case PAWN -> pawns.add(new Pawn(xy, color));
            case TOWER -> towers.add(new Tower(xy, color));
            case HORSE -> horses.add(new Horse(xy, color));
            case BISHOP -> bishops.add(new Bishop(xy, color));
            case QUEEN -> queens.add(new Queen(xy, color));
            case KING -> kings.add(new King(xy, color));
        }
    }
    private boolean canCreatePieces(int[] xy, Colors color, Roles role){
        System.out.println("======NEW REQUEST======");
        System.out.println(
                "{\n"+
                        "   Role: "+role+"\n"+
                        "   Color: "+color+"\n"+
                        "   Position: "+ Arrays.toString(xy) +"\n"+
                        "},");
        if (role == Roles.PIECE) return false;
        int x = xy[0];
        int y = xy[1];
        if ((x > xMax || y > yMax) || (x < 0 || y < 0)) {
            System.out.println("ERROR: XY INVALID");
            return false;
        }
//        verification to create
        for (List<?> piece : pieces) {
            for (Object one : piece) {
                Piece pieceTo = (Piece) one;
                /*
                System.out.println(
                        "{\n"+
                        "   Role: "+pieceTo.getRole()+"\n"+
                        "   Color: "+pieceTo.getColor()+"\n"+
                        "   Position: "+ Arrays.toString(pieceTo.getPosition()) +"\n"+
                        "},");

                 */
                if (role == Roles.KING && pieceTo.getRole() == Roles.KING && color == pieceTo.getColor()) {
                    System.out.println("ERROR: IT CANNOT EXIST 2 KINGS OF THE SAME COLOR");
                    return false;
                }
                System.out.println("pos"+Arrays.toString(pieceTo.getPosition())+" : "+ Arrays.toString(xy));
                if (Arrays.equals(pieceTo.getPosition(), xy)) {
                    System.out.println("IT ALREADY EXISTS A PIECE IN THIS PLACE");
                    return false;
                }
            }
        }
        System.out.println("APROVADO");
        return true;
    }
    public void printAllPieces(){
        for (List<?> piece : pieces) {
            for (Object one : piece) {
                Piece pieceTo = (Piece) one;
                System.out.println(
                        "{\n"+
                        "   Role: "+pieceTo.getRole()+"\n"+
                        "   Color: "+pieceTo.getColor()+"\n"+
                        "   Position: "+ Arrays.toString(pieceTo.getPosition()) +"\n"+
                        "},");
            }
        }
    }

    public void walk(Piece piece, int[] xy){

    }

}
