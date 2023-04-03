package game;

import definitions.Colors;
import definitions.Roles;

public class Horse extends Piece{
    private final Roles role = Roles.HORSE;
    private final Colors color;
    public Horse(){
        this.x = 0;
        this.y = 0;
        this.color = Colors.BRANCO;
    }
    public Horse(int x, int y){
        this.x = x;
        this.y = y;
        this.color = Colors.BRANCO;
    }

    public Horse(int x, int y, Colors cor){
        this.x = x;
        this.y = y;
        this.color = cor;
    }
    public Horse(int[] xy, Colors cor){
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
