package game;

import definitions.Colors;
import definitions.Roles;

public class Tower extends Piece{
    private final Roles role = Roles.TOWER;
    private final Colors color;

    public Tower(){
        this.x = 0;
        this.y = 0;
        this.color = Colors.BRANCO;
    }
    public Tower(int x, int y){
        this.x = x;
        this.y = y;
        this.color = Colors.BRANCO;
    }

    public Tower(int x, int y, Colors cor){
        this.x = x;
        this.y = y;
        this.color = cor;
    }
    public Tower(int[] xy, Colors cor){
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
