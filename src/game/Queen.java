package game;

import definitions.Colors;
import definitions.Roles;

public class Queen extends Piece{
    private final Roles role = Roles.QUEEN;
    private final Colors color;
    public Queen(){
        this.x = 0;
        this.y = 0;
        this.color = Colors.BRANCO;
    }
    public Queen(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = Colors.BRANCO;
    }

    public Queen(int x, int y, Colors cor){
        this.x = x;
        this.y = y;
        this.color = cor;
    }
    public Queen(int[] xy, Colors cor){
        this.x = xy[0];
        this.y = xy[1];
        this.color = cor;
    }

    public Roles getRole() {
        return role;
    }
    public Colors getColor(){
        return color;
    }

}
