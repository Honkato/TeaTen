package game;

import definitions.Colors;
import definitions.Roles;

public class Pawn extends Piece{
    private boolean wasMovedOnce = false;
    private final Colors color;

    private final Roles role = Roles.PAWN;
    public Pawn(){
        this.x = 0;
        this.y = 0;
        this.color = Colors.BRANCO;
    }
    public Pawn(int x, int y){
        this.x = x;
        this.y = y;
        this.color = Colors.BRANCO;
    }

    public Pawn(int x, int y, Colors cor){
        this.x = x;
        this.y = y;
        this.color = cor;
    }
    public Pawn(int[] xy, Colors cor){
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


    @Override
    public int[][][] walkArea() {
        if(wasMovedOnce) {
            return new int[][][]
                    {
                            {{x + 1, y}, {x + 2, y}}
                    };
        }
        return new int[][][]
                {
                        {{x+1,y}}
                };
//        return super.canWalk();
    }

    @Override
    public int[][][] killArea() {
        int[] xy = getPosition();
        int x = xy[0];
        int y = xy[1];
        int[][][] killable =
                {
                        {{x+1,y+1}},
                        {{x-1,y+1}}
                };
        return killable;
    }

}
